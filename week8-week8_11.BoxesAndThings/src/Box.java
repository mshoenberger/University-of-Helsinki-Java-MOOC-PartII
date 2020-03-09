/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.ArrayList;

public class Box implements ToBeStored {
    
    private double maximumWeight;
    private ArrayList<ToBeStored> storedItems;
    
    public Box(double max){
        this.maximumWeight = max;
        this.storedItems = new ArrayList<ToBeStored>();
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored index: storedItems){
            weight += index.weight();
        }
        return weight;
    }
    
    public void add(ToBeStored stored){
        
        double weightCheck = weight() + stored.weight();
        
        if(weightCheck <= this.maximumWeight){
            this.storedItems.add(stored);
        }
        
    }
    
    @Override
    public String toString(){
        return "Box: " + this.storedItems.size() +" things, total weight " + weight() + " kg";
    }
    
    
}
