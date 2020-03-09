/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.lang.Math;

/**
 *
 * @author Neptrocity
 */
public class ContainerHistory {
    
    private ArrayList<Double> trackHistory;
    
    public ContainerHistory(){
        this.trackHistory = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.trackHistory.add(situation);
    }
    
    public void reset(){
        this.trackHistory.removeAll(trackHistory);
    }
    
    public String toString(){
        return this.trackHistory.toString();
    }
    
    public double maxValue(){
        double max = this.trackHistory.get(0);
        for(double index: this.trackHistory){
            if(max < index){
                max = index;
            }
        }
        return max;
        
    }
    
    public double minValue(){
        double min = this.trackHistory.get(0);
        for(double index: this.trackHistory){
            if(min > index){
                min = index;
            }
        }
        return min;
    }
    
    public double average(){
        if(this.trackHistory.isEmpty()){
            return 0;
        }
        
        int sum = 0;
        for(double index: this.trackHistory){
            sum += index;
        }
        
        return 1.0 * sum / this.trackHistory.size();
        
    }
    
    public double greatestFluctuation(){
        if(this.trackHistory.size() == 1 || this.trackHistory.size() == 1){
            return 0;
        }
        
        double maxFluctuation = -999;
        for(int i =1; i < this.trackHistory.size(); i++){
            double difference = Math.abs(this.trackHistory.get(i) - this.trackHistory.get(i-1));
            if(difference > maxFluctuation){
                maxFluctuation = difference;
            }
        }
        
        return maxFluctuation;
        
    }
    
    public double variance(){
        if(this.trackHistory.size() == 0 || this.trackHistory.size() == 1){
            return 0;
        }
        
        double average = average();
        double sampleSize = this.trackHistory.size();
        
        double sum = 0;
        for(double index: this.trackHistory){
            sum = sum + Math.pow(index - average, 2);
        }
        
        double squareVariance = sum / (sampleSize - 1);
        return squareVariance;
        
    }    
    
    
    
}
