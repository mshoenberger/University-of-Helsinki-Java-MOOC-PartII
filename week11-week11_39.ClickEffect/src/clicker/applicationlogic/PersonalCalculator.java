/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author Neptrocity
 */
public class PersonalCalculator implements Calculator {
    
    private int counterValue;
    
    public PersonalCalculator(){
        this.counterValue = 0;
    }
    
    public int giveValue(){
        return this.counterValue;
    }
    
    public void increase(){
        this.counterValue++;
    }
}
