/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import wormgame.game.WormGame;
import wormgame.domain.Piece;
import wormgame.domain.Apple;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author Neptrocity
 */
public class DrawingBoard extends JPanel implements Updatable{
    
    private WormGame gameBoard;
    private Apple gameApple;
    private int pieceLength;
    
    public DrawingBoard(WormGame game, int pieceLength){
        this.gameBoard = game;
        this.pieceLength = pieceLength;
    }
    
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        for(Piece index: gameBoard.getWorm().getPieces()){
            g.fill3DRect(index.getX()*this.pieceLength, index.getY()*this.pieceLength, this.pieceLength, this.pieceLength, true);
        }
        
        g.setColor(Color.RED);
        this.gameApple = this.gameBoard.getApple();
        g.fillOval(gameApple.getX()*pieceLength, gameApple.getY()*pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update(){
        super.repaint();
    }
    
}
