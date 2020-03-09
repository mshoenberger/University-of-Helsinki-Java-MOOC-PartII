/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;

/**
 *
 * @author Neptrocity
 */
public class Farm implements Alive{
    
    private String ownerName;
    private Barn farmBarn;
    private ArrayList<Cow> farmCowHerd;
    
    public Farm(String ownerName, Barn barn){
        this.ownerName = ownerName;
        this.farmBarn = barn;
        this.farmCowHerd = new ArrayList<Cow>();
    }
    
    public void liveHour(){
        for(Cow index: farmCowHerd){
            index.liveHour();
        }
    }
    
    public String getOwner(){
        return this.ownerName;
    }
    
    public void addCow(Cow cow){
        this.farmCowHerd.add(cow);
    }
    
    public String printAnimals(){
        if(this.farmCowHerd.isEmpty()){
            return "No cows.";
        }
        System.out.println("Animals: ");
        String cowOutput = "";
        for(Cow index: this.farmCowHerd){
            cowOutput = cowOutput + "        " + index.toString() + "\n";
        }
        return cowOutput;
 
    }
    
    public String toString(){
        return "Farm owner: " + this.ownerName + "\n"
                + "Barn bulk tank: " + this.farmBarn.getBulkTank() + "\n"
                + printAnimals();
    }
    
    public void manageCows(){
        this.farmBarn.takeCareOf(farmCowHerd);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.farmBarn.installMilkingRobot(robot);
    }
    
    
}
