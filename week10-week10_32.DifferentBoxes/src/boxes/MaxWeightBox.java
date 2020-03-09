/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neptrocity
 */
public class MaxWeightBox extends Box{
    
    private int maxWeight;
    private List<Thing> boxItems;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.boxItems = new ArrayList<Thing>();
    }
    
    public int getBoxWeight(){
        int sum = 0;
        for(Thing index: boxItems){
            sum += index.getWeight();
        }
        return sum;
    }
    
    public void add(Thing thing){
        if(thing.getWeight() + getBoxWeight() <= this.maxWeight ){
            this.boxItems.add(thing);
        }
    }
    
    public boolean isInTheBox(Thing thing){
        for(Thing index: this.boxItems){
            if(index.equals(thing)){
                return true;
            }
        }
        return false;
    }
    
    
}
