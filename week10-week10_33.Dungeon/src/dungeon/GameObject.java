/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Neptrocity
 */
public abstract class GameObject {
    
    private int xPosition;
    private int yPosition;
    private String boardIcon;
    
    public GameObject(int x, int y, String icon){
        this.xPosition = x;
        this.yPosition = y;
        this.boardIcon = icon;
    }
    
    public int getX(){
        return this.xPosition;
    }
    
    public void changeX(int changeXValue){
        this.xPosition += changeXValue;
    }
    
    public void changeY(int changeYValue){
        this.yPosition += changeYValue;
    }  
    
    public int getY(){
        return this.yPosition;
    }
    
    public String getIcon(){
        return this.boardIcon;
    }
    
    @Override
    public String toString(){
        return this.boardIcon + " " + this.yPosition + " " + this.xPosition; 
    }
    
}
