/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JLabel;


/**
 *
 * @author Neptrocity
 */
public class UserInterface implements Runnable{
    
    private JFrame frame;
    
    public UserInterface(){
    }
    
    public void run(){
        frame = new JFrame("Swing on");
        frame.setPreferredSize(new Dimension(400,200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void createComponents(Container container){
        JLabel hello = new JLabel("Hi!");
        container.add(hello);
        
    }
    
    public JFrame getFrame(){
        return frame;
    }
    
}
