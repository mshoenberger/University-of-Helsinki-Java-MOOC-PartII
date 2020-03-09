/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Neptrocity
 */
public class Dungeon {
    
    private Scanner reader;
    
    //Dungeon constructor values
    private int dungeonLength;
    private int dungeonHeight;
    private int numberOfVampires;
    private int numberAllowedMoves;
    private boolean canVampiresMove;
    
    //ArrayList for storing vampires 
    private List<Vampire> gameVampires;
    private Player player;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        
        this.reader = new Scanner(System.in);
        
        this.dungeonLength = length;
        this.dungeonHeight = height;
        this.numberOfVampires = vampires;
        this.numberAllowedMoves = moves;
        this.canVampiresMove = vampiresMove;
        
        this.gameVampires = new ArrayList<Vampire>();
        this.player = new Player(0,0, "@");
    }
    
    public void run(){
        generateVampires();
        while(true){
            printRound();
            this.player.askForCommand(this.reader);
            this.player.processCommandWithMove(this.dungeonLength, this.dungeonHeight);
            removeVampire();
            if(this.gameVampires.size() ==0){
                System.out.println("YOU WIN");
                break;
            }
            
            for(Vampire index: this.gameVampires){
                index.move(canVampiresMove);
            }
            
            
            player.clearCommand();
            this.numberAllowedMoves--;
            

        if(this.numberAllowedMoves ==0){
            System.out.println("YOU LOSE");
            break;
        }

        }
    }
    
    public void printRound(){
        System.out.println(this.numberAllowedMoves + "\n");
        System.out.println(printPositions());
        printBoard();
        
       
    }
    
    public void printBoard(){
        //creates a 2D array seeing if positions in array match coordiantes of GameObjects, if so, print their icon
        for(int height =0; height < this.dungeonHeight; height++){
            
            for(int length = 0; length < this.dungeonLength; length++){
                
                boolean printedYet = false;
                if(height == this.player.getX() && length == this.player.getY()){
                    System.out.print(this.player.getIcon());
                    printedYet = true;
                }
                
                for(Vampire index: this.gameVampires){
                    if(height == index.getX() && length == index.getY()){
                        System.out.print(index.getIcon());
                        printedYet = true;
                    }
                }
                
                if(!printedYet){
                    System.out.print(".");
                }
           }
            System.out.print("\n"); //creates new line 
        }
    }
        
   
    
    private void generateVampires(){
        for(int i =0; i < this.numberOfVampires; i++){
            int x = new Random().nextInt(this.dungeonLength -1) +1;
            int y = new Random().nextInt(this.dungeonHeight -1) +1;
            this.gameVampires.add(new Vampire(x, y, "v", this.dungeonHeight, this.dungeonLength));
    
        }
    }
    
    public String printPositions(){
        String output = "";
        output = output + this.player.toString() + "\n";
        
        for(Vampire index: this.gameVampires){
            output = output + index.toString() + "\n";
        }
        return output;
    }
    
    public void checkWin(){
        if(this.gameVampires.size() ==0){
            System.out.println("YOU WIN");
        }
        if(this.numberAllowedMoves ==0){
            System.out.println("YOU LOSE");
            
        }
    }
    
    public void moveVampires(int value){
        for(Vampire index: this.gameVampires){
            index.move(canVampiresMove);
        }
    }
    
    public void removeVampire(){
                
        for(int i =0; i < this.gameVampires.size(); i++){
            if(this.gameVampires.get(i).getX() == this.player.getX() && this.gameVampires.get(i).getY() == this.player.getY()){
                this.gameVampires.remove(i);
            }
        }
        
    }
    

        
        
}
    
    

