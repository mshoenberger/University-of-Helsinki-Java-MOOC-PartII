/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clicker.applicationlogic.Calculator;
import javax.swing.*;
/**
 *
 * @author Neptrocity
 */
public class ClickListener implements ActionListener{
    
    private Calculator calculateClicks;
    private JLabel label;
    
    public ClickListener(Calculator calculator, JLabel label){
        this.calculateClicks = calculator;
        this.label = label;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.calculateClicks.increase();
        this.label.setText(""+ this.calculateClicks.giveValue());
        
    }
    
}
