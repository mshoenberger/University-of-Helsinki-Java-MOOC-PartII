/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.*;
/**
 *
 * @author Neptrocity
 */
public class ActionEventListener implements ActionListener {
    
    private JTextField copyFrom;
    private JLabel copyTo;
    
    
    public ActionEventListener(JTextField origin, JLabel destination){
        this.copyFrom = origin;
        this.copyTo = destination;
    } 
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.copyTo.setText(this.copyFrom.getText());
        this.copyFrom.setText("");
      
    }
    
}
