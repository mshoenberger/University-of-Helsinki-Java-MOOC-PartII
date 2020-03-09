/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neptrocity
 */
public class AverageSensor implements Sensor{
    
    private ArrayList<Sensor> sensorList;
    private List<Integer> intList; 
    
    public AverageSensor(){
        this.sensorList = new ArrayList<Sensor>();
        this.intList = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        this.sensorList.add(additional);
    }
    
    public boolean isOn(){
        
        for(Sensor sensor: sensorList){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }
    
    public void on(){
        for(Sensor sensor: sensorList){
            sensor.on();
        }
    }
    
    public void off(){
        for(Sensor sensor: sensorList){
            sensor.off();
        }
    }
    
    public int measure(){
        
        if(isOn()){
            int sum = 0;
            int length = sensorList.size();
                    
            for(Sensor sensor: sensorList){
                sum += sensor.measure();
            }
            
            this.intList.add(sum / length);
            return sum / length; //return average of all sensors
        }
        
        throw new IllegalStateException("A sensor is not on");
        
    }
    
    public List<Integer> readings(){
        return this.intList;
    }
    
    
    
}
