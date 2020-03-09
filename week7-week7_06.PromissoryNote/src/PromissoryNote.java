/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.HashMap;

public class PromissoryNote {
    
    private HashMap<String, Double> notes;
    
    
    public PromissoryNote(){
        
        this.notes = new HashMap<String, Double>();
        
    }
    
    public void setLoan(String toWhom, double value){
        
        if(notes.get(toWhom) == null){
            notes.put(toWhom, value);
        }
        
    }
    
    public double howMuchIsTheDebt(String whose){
        
        if(this.notes.get(whose) != null){
            return this.notes.get(whose);
        }
        return 0;
    }
    
    
}
