/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Neptrocity
 */
public class ConstantSensor implements Sensor {
    
    private int sensorReading;
    
    
    public ConstantSensor(int sensorReading){
        this.sensorReading = sensorReading;
    }
    
    public void on(){
        
    }
    
    public void off(){
        
    }
    
    public boolean isOn(){
        return true;
    }
    
    public int measure(){
        return this.sensorReading;
    }
    
    
}
