/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

/**
 *
 * @author Neptrocity
 */
public class Piece {
    
    private int xCoordinate;
    private int yCoordinate;
    
    public Piece(int x, int y){
        this.xCoordinate = x;
        this.yCoordinate = y;
    }
    
    public int getX(){
        return this.xCoordinate;
    }
    
    public int getY(){
        return this.yCoordinate;
    }
    
    public boolean runsInto(Piece piece){
        return this.xCoordinate == piece.getX() && this.yCoordinate == piece.getY();
    }
    
    @Override
    public String toString(){
        return "(" + this.xCoordinate + "," + this.yCoordinate + ")";
    }
    
    
    
}
