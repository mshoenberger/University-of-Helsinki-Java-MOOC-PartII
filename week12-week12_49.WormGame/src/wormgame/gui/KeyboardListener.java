/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import wormgame.Direction;

import wormgame.domain.Worm;
/**
 *
 * @author Neptrocity
 */
public class KeyboardListener implements KeyListener{
    
    private Worm gameWorm;
    
    public KeyboardListener(Worm worm){
        this.gameWorm = worm;
    }
    
    @Override
    public void keyReleased(KeyEvent releasedEvent){
    }
    
    @Override
    public void keyPressed(KeyEvent pressedEvent){
        if(pressedEvent.getKeyCode() == KeyEvent.VK_UP){
            gameWorm.setDirection(Direction.UP);
        }else if(pressedEvent.getKeyCode() == KeyEvent.VK_DOWN){
            gameWorm.setDirection(Direction.DOWN);
        }else if(pressedEvent.getKeyCode() == KeyEvent.VK_RIGHT){
            gameWorm.setDirection(Direction.RIGHT);
        }else if(pressedEvent.getKeyCode() == KeyEvent.VK_LEFT){
            gameWorm.setDirection(Direction.LEFT);
        }
    }
    
    @Override
    public void keyTyped(KeyEvent typedEvent){
    }
    
}
