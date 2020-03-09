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
public class MilkingRobot {
    
    private BulkTank connectedTank;
    
    public MilkingRobot(){
        this.connectedTank = null;
    }
    
    public BulkTank getBulkTank(){
        return this.connectedTank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.connectedTank = tank;
    }
    
    public void milk(Milkable milkable){
        if(this.connectedTank == null){
            throw new IllegalStateException();
        }else{
         Cow milkCow = (Cow) milkable;
         this.connectedTank.addToTank(milkCow.milk());   
        }
    }
}
