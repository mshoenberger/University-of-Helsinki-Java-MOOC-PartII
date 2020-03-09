//Author Michael Shoenberger

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Jump{
    
    private ArrayList<Person> people;
    private Scanner reader; 
    private int roundCounter;
    
    public Jump(Scanner scanner){
        this.people = new ArrayList<Person>();
        this.reader = scanner;
        this.roundCounter = 1;
    }
    
    public void addJumpers(){
        
        while(true){
            System.out.print("  Participant name: ");
            String participantName = reader.nextLine();
            
            if(participantName.equals("")){
                System.out.println("");
                break;
            }else{
                people.add(new Person(participantName));
            }
            
        }
        
    }
    
    public void checkJump(){
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String userInput = reader.nextLine();
            if(userInput.equals("quit")){
              
                System.out.println("");
                System.out.println("Thanks! \n");
                
                printTourneyResults();
                break;
            }else{
                System.out.println("");
                printRound();
                roundCounter++;
            }
            
        }
    }
    
    public void printRound(){
        System.out.println("Round " + this.roundCounter + "\n");
        System.out.println("Jumping order:");
        getJumpOrder();
        
    }
    
    public void getJumpOrder(){
        int index = 1;

        Collections.sort(people);
        for(Person person: people){
            System.out.println("  " + index +". " + person.getName() + " (" + person.getScore() + " points)");
            index ++;
        }
        System.out.println("");
                
        jump();
    }
    
    public void jump(){
        
        for(Person person: people){
            person.createJudging();
           person.createScore();
        }
        
        System.out.println("Results of round " + this.roundCounter);
        for(Person person: people){
            System.out.println("  " + person.getName());
            System.out.println("    length: " + person.getLength(roundCounter));
            System.out.println("    judge votes: " + person.getJudge());
        }
        
        System.out.println("");
    }
    
    
    public void printTourneyResults(){
        
        Collections.sort(people);
        Collections.reverse(people);
        
        int index = 1;
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        for(Person person: people){
            
            System.out.println(index + "           " + person.toString());
            System.out.println("            jump lengths: " + person.jumpLengthPrint());
            index++;
        }
           
        
    }

}
