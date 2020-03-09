/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Airplane {
    
    private String planeID;
    private int planeCapacity;
    private ArrayList<String> flights;
        
    
    public Airplane(String ID, int capacity){
        this.planeID = ID;
        this.planeCapacity = capacity;
        this.flights = new ArrayList<String>();
    }
    
    
    public String getID(){
        return this.planeID;
    }
    
    public int getCapacity(){
        return this.planeCapacity;
    }
    
    public void flightAdd(String addedFlight){
        this.flights.add(addedFlight);
    }
    
    public void allString(){
        
        for(String flight: this.flights){
            System.out.println(this.planeID + " " + "(" + this.planeCapacity + " ppl) " + flight);
        }
        
    }
    
    
    
}
