
package wormgame.domain;

import wormgame.Direction;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Neptrocity
 */
public class Worm{
    
    private Direction wormHeadDirection;
    private List<Piece> builtWormPieces;
    private boolean allowedToGrow;    
    
    public Worm(int originalX, int originalY, Direction originalDirection){
        
        this.wormHeadDirection = originalDirection;
        this.builtWormPieces = new ArrayList<Piece>();
        this.builtWormPieces.add(new Piece(originalX, originalY));
        
        allowedToGrow = true;
    }
    
    public Direction getDirection(){
        return this.wormHeadDirection;
    }
    
    public void setDirection(Direction newDirection){
        this.wormHeadDirection = newDirection;
    }
    
    public int getLength(){
        return this.builtWormPieces.size();
    }
    
    public List<Piece> getPieces(){
        return this.builtWormPieces;
    }
    
    public void move(){
        
        Piece wormHead = builtWormPieces.get(builtWormPieces.size()-1);
        Piece replaceHead;
        
        if(wormHeadDirection == Direction.UP){
            replaceHead = new Piece(wormHead.getX(), wormHead.getY()-1);
        }else if(wormHeadDirection == Direction.DOWN){
            replaceHead = new Piece(wormHead.getX(), wormHead.getY() +1);
        }else if(wormHeadDirection == Direction.LEFT){
            replaceHead = new Piece(wormHead.getX()-1, wormHead.getY());
        }else{
            replaceHead = new Piece(wormHead.getX()+1, wormHead.getY());
        }
        
        builtWormPieces.add(replaceHead);
        
               
        if(!allowedToGrow){
            builtWormPieces.remove(0);
        } 
        
        if(getLength() >= 3){
            this.allowedToGrow = false;
        }
                
    }
    
    public void grow(){
        this.allowedToGrow = true;
    }
    
    public boolean runsInto(Piece piece){
        
        for(Piece index: this.builtWormPieces){
            if(index.runsInto(piece)){
                return true;
            }
        }
        return false;
    }
    
    public boolean runsIntoItself(){
        Piece wormHead = builtWormPieces.get(builtWormPieces.size()-1);
        
        for(int i =0; i < builtWormPieces.size()-2 ; i++){
            if(wormHead.runsInto(builtWormPieces.get(i))){
                return true;
            }
        }
        return false;
    }
}
