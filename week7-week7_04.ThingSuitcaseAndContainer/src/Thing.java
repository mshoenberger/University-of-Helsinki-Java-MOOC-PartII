/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
public class Thing {
    
    private String name;
    private int weight;
        
    public Thing(String thingName, int thingWeight){
        this.name = thingName;
        this.weight = thingWeight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }
    
    
}
