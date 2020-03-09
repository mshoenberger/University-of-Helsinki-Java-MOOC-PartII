/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;
/**
 *
 * @author Neptrocity
 */
public class Barn {
    
    private BulkTank milkTank;
    private MilkingRobot robotMilker;
    
    public Barn(BulkTank tank){
        this.milkTank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.milkTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robotMilker = milkingRobot;
        this.robotMilker.setBulkTank(milkTank);
       
    }
    
    
    public void takeCareOf(Cow cow){
        if(this.robotMilker == null){
            throw new IllegalStateException("Milking robot not installed.");
        }
        
        this.robotMilker.milk(cow);
        
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.robotMilker == null){
            throw new IllegalStateException("Milking robot not installed.");
        }
        
        for(Cow index: cows){
            this.robotMilker.milk(index);
        }
    }
    
    public String toString(){
        return this.milkTank.toString();
    }
    
    
}
