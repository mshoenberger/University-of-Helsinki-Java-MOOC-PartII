/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.util.ArrayList;
import java.awt.Graphics;
/**
 *
 * @author Neptrocity
 */
public class CompoundFigure extends Figure{
    
    private ArrayList<Figure> figureStorage;
    
    public CompoundFigure() {
        this.figureStorage = new ArrayList<Figure>();
    }
    
    public void add(Figure f){
        this.figureStorage.add(f);
    }
    
    @Override 
    public void draw(Graphics graphics){
        for(Figure index: this.figureStorage){
            index.draw(graphics);
        }
    }
    
    @Override
    public void move(int dx, int dy){
        for(Figure index: this.figureStorage){
            index.move(dx, dy);
        }
    }
    
}
