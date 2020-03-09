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

public class Container {
    
    private int maxWeight;
    private ArrayList<Suitcase> caseStorage;
    private int containerWeight;
    
    public Container(int maxContainerWeight){
        this.maxWeight = maxContainerWeight;
        this.caseStorage = new ArrayList<Suitcase>();
        this.containerWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        int totalWeight = this.containerWeight + suitcase.totalWeight();
        
        if(totalWeight <= this.maxWeight){
            caseStorage.add(suitcase);
            containerWeight += suitcase.totalWeight();
        }
        
    }
    
    
    public String toString(){
        
        return caseStorage.size() + " suitcases (" + this.containerWeight + " kg)";
    }
    
    public void printThings(){
        for(Suitcase index: caseStorage){
            index.printThings();
        }
        
    }
    
    
    
}
