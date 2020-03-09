/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
/**
 *
 * @author Neptrocity
 */
public class Thermometer implements Sensor{
    
    private String thermometerStatus;
    
    public Thermometer(){
        this.thermometerStatus = "off";
    }
    
    public void on(){
       this.thermometerStatus  = "on";
    } 
    
    public void off(){
        this.thermometerStatus  = "off";
    }
    
    public boolean isOn(){
        if(this.thermometerStatus.equals("on")){
            return true;
        } 
        return false;        
    }
    
    public int measure(){
        
        if(isOn()){
            int lowerBound = -29;
            int upperBound = 60;
            Random randomNumbGen = new Random();
        
            return randomNumbGen.nextInt(upperBound) + lowerBound;
        }
        throw new IllegalStateException("Themometer is not on");
    }
    
    
}
