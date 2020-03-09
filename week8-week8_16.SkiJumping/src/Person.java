//Author Michael Shoenberger

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
    
    private String name;
    private int Score;
    private Random random;
    private ArrayList<Integer> judgeScores;
    private ArrayList<Integer> jumpLength;
    private ArrayList<Integer> judgeNumberPerRound;
    
    public Person(String name){
        this.name = name;
        this.Score = 0;
        this.random = new Random();
        this.judgeScores = new ArrayList<Integer>();
        this.jumpLength = new ArrayList<Integer>();
        this.judgeNumberPerRound = new ArrayList<Integer>();
    }
    
    @Override
    public int compareTo(Person person){
        return this.getScore() - person.getScore();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getScore(){
        return this.Score;
    }
    
    public int getLength(int lengthGrab){
        return this.jumpLength.get(lengthGrab - 1);
    }
    
    public ArrayList<Integer> getJudge(){
        return this.judgeScores;
    }
    
    public void createJudging(){
        this.judgeScores.clear();
        int judgeMin = 10;
        int judgeMax = 20;
        
        for(int i = 0; i < 5; i++){
            int addScore = random.nextInt(judgeMax - judgeMin) + judgeMin;
            judgeScores.add(addScore);
        }
        
        Collections.sort(judgeScores);
        
        for(int i = 1; i < 4; i++){
            judgeNumberPerRound.add(judgeScores.get(i));
        }
        
    }
    
    public void createScore(){
        int smallestJump = 61;
        int largestJump = 121;
        int jumpLengthScore = this.random.nextInt(largestJump - smallestJump) + smallestJump;
        this.jumpLength.add(jumpLengthScore);
        
        int judgeScorecat = 0;
        for(int i = 1; i < 4; i++){
            judgeScorecat += judgeScores.get(i);
        }
        
        this.Score += judgeScorecat + jumpLengthScore;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + Score + " points)";
    }
    
    public String jumpLengthPrint(){
        
        String words = "";
        
        for(int length: jumpLength){
            words = words + length + "m, ";
        }
        words = words.substring(0, words.length() -2);
        
        return words;
        
    }
}
