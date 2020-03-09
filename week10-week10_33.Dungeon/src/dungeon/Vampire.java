/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author Neptrocity
 */
public class Vampire extends GameObject {
    
    private int xBoundary;
    private int yBoundary;
    
    public Vampire(int x, int y, String icon, int xMax, int yMax){
       super(x, y, icon);
       this.xBoundary = xMax;
       this.yBoundary = yMax;
    }
    
    public void move(boolean canMove){
        if(canMove){
            while(true){
                int moveDirection = new Random().nextInt(4);
                if(moveDirection == 0 && this.getY() > 0){
                    this.changeY(-1);
                    break;
                }else if(moveDirection == 1 && this.getY() < (this.yBoundary -1)){
                    this.changeY(1);
                    break;
                }else if(moveDirection == 2 && this.getX() > 0){
                    this.changeX(-1);
                    break;
                }else if(moveDirection == 3 && this.getX() < (this.xBoundary -1)){
                    this.changeX(1);
                    break;
                }
            }
            
        
        }
    }
    
   // public void 
    
    
}
