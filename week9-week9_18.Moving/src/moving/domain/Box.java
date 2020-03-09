/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
/**
 *
 * @author Neptrocity
 */
public class Box implements Thing{
    
    private int maxCapacity;
    private ArrayList<Thing> boxThings;
        
    public Box(int maximumCapacity){
        this.maxCapacity = maximumCapacity;
        this.boxThings = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        
        if(getVolume() + thing.getVolume() <= this.maxCapacity){
            boxThings.add(thing);
            return true;
        }
        return false;
    }
    
    public int getVolume(){
        int volumeOfBoxItems =0;
        
        for(Thing indexThing: boxThings){
            volumeOfBoxItems += indexThing.getVolume();
        }
        return volumeOfBoxItems;       
    }
    
    
}
