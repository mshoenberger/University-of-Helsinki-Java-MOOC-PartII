/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
public class CalculatorLogic {
    
    private int currentStoredValue;
    
    public CalculatorLogic(){
        this.currentStoredValue = 0;
    }
    
    public void addValue(int value){
        this.currentStoredValue += value;
    }
    
    public void subtractValue(int value){
        this.currentStoredValue -= value;
    }
    
    public void resetValue(){
        this.currentStoredValue = 0;
    }
    
    public int getValue(){
        return this.currentStoredValue;
    }
    
    
    
    
}
