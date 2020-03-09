
package dungeon;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Neptrocity
 */
public class Player extends GameObject{
    
    private List<String> userCommands;
    private List<String> finalCommandParsed;
    
    public Player(int x, int y, String icon){
        super(x, y, icon);
        this.userCommands = new ArrayList<String>();
        this.finalCommandParsed = new ArrayList<String>();
    }
    
   public void askForCommand(Scanner reader){
        System.out.println("");
        String userInput = reader.nextLine();

        for(int i =0; i < userInput.length(); i++){
            this.userCommands.add(userInput.substring(i, i+1));
        }
    }
   
   public void processCommandWithMove(int maxX, int maxY){
              
       for(int index = 0; index < this.userCommands.size(); index++){
           
           String validCheck = this.userCommands.get(index);
           if(validCheck.equals("w") && super.getX() >0){
               super.changeX(-1);
               this.finalCommandParsed.add(validCheck);
           }else if(validCheck.equals("s") && super.getX() < maxX-1){
               super.changeX(1);
               this.finalCommandParsed.add(validCheck);
           }else if(validCheck.equals("a") && super.getY() >0){
               super.changeY(-1);
               this.finalCommandParsed.add(validCheck);
           }else if(validCheck.equals("d") && super.getY() < maxY-1){
               super.changeY(1);
               this.finalCommandParsed.add(validCheck);
           }
       }
   }
   
   public void clearCommand(){
       this.userCommands.clear();
       this.finalCommandParsed.clear();
   }
   
    
}
