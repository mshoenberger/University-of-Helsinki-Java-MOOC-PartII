package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;

import wormgame.domain.Worm;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import java.util.Random;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    
    private Worm gameWorm;
    private Apple gameApple;
    
    public WormGame(int width, int height) {
        super(1000, null);
        
        this.width = width;
        this.height = height;
        this.continues = true;
        
        this.gameWorm = new Worm((width)/2, height/2, Direction.DOWN);
        createApple(width, height);

        addActionListener(this);
        setInitialDelay(2000);

    }
    
    public void createApple(int width, int height){
         this.gameApple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
         while(gameApple.getX() == width/2 && gameApple.getY() == height/2){
             this.gameApple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
         }
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        this.gameWorm.move();
        
        if(this.gameWorm.runsInto(gameApple)){
            this.gameWorm.grow();
            createApple(width, height);
        }
        
        if(this.gameWorm.runsIntoItself()){
            this.continues = false;
        }
        
        for(Piece index: gameWorm.getPieces()){
            if(index.getX() == 0 || index.getX() == width || index.getY() == 0 || index.getY() == height){
                this.continues = false;
            }
        }
        
        updatable.update();
        setDelay(1000 / gameWorm.getLength());
    }
    
    public Worm getWorm(){
        return this.gameWorm;
    }
    
    public void setWorm(Worm worm){
        this.gameWorm = worm;
    }
    
    public Apple getApple(){
        return this.gameApple;
    }
    
    public void setApple(Apple apple){
        this.gameApple = apple;
    }

}
