/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;


/**
 *
 * @author Neptrocity
 */
public class BulkTank {
    
    private double tankMaxCapacity;
    private double currentVolume;
    
    
    public BulkTank(){
        this.tankMaxCapacity = 2000; //liters
        this.currentVolume = 0;
    }
    
    public BulkTank(double capacity){
        this.tankMaxCapacity = capacity; //liters
        this.currentVolume = 0;
    }
    
    public double getCapacity(){
        return this.tankMaxCapacity;
    }
    
    public double getVolume(){
        return this.currentVolume;
    }
    
    public double howMuchFreeSpace(){
        return this.tankMaxCapacity - this.currentVolume;
    }
    
    public void addToTank(double amount){
         if(this.currentVolume + amount <= this.tankMaxCapacity){
             this.currentVolume += amount;
         }else{
             this.currentVolume = this.tankMaxCapacity;
         }
    }
    
    public double getFromTank(double amount){
        if(amount <= this.currentVolume){
            this.currentVolume -= amount;
            return this.currentVolume;
        }else{
            return this.currentVolume = 0;
        }
    }
    
    @Override
    public String toString(){
        return "" + Math.ceil(this.currentVolume) + "/" + Math.ceil(this.tankMaxCapacity);
    }
    
}
