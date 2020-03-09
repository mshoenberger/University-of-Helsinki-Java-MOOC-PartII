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

public class Suitcase {
    
    private int weightLimit;
    private ArrayList<Thing> storedItems;
    private int currentWeight;
    
    public Suitcase(int maxWeight){
        
        this.currentWeight = 0;
        this.weightLimit = maxWeight;
        this.storedItems = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing){
        
        int newWeight = this.currentWeight + thing.getWeight();
        
        if(newWeight <= this.weightLimit){
            this.storedItems.add(thing);
            this.currentWeight = newWeight;
        }
               
    }
    
    public String toString(){
    
       if(this.storedItems.isEmpty()){
           return "empty (" + this.currentWeight + " kg)";
       }else if(this.storedItems.size() ==1){
           return "1 thing (" + this.currentWeight + " kg)";
       }else{
            return this.storedItems.size() + " things (" + this.currentWeight + " kg)";    
       }
    }
    
    public void printThings(){
        
        for(Thing index: storedItems){
            System.out.println(index.getName() + " (" + index.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        return this.currentWeight;
    }
    
    public Thing heaviestThing(){
        
        if(this.storedItems.isEmpty()){
            return null;
        }
        
        Thing heaviest = this.storedItems.get(0);
        
        for(Thing index: storedItems){
            if(heaviest.getWeight() < index.getWeight()){
                heaviest = index;
            }
        }
        return heaviest;
    }
    
    
}

