/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.List;
import moving.domain.Thing;
import moving.domain.Box;
import java.util.ArrayList;
/**
 *
 * @author Neptrocity
 */
public class Packer{
    
    private int maxWeightForBoxes;
    private ArrayList<Thing> boxItems;
    
    public Packer(int boxesVolume){
        this.maxWeightForBoxes = boxesVolume;
        this.boxItems = new ArrayList<Thing>();
    }
    
    public List<Box> packThings(List<Thing> things){
        
        List<Box> boxStorage = new ArrayList<Box>();
        Box box = new Box(this.maxWeightForBoxes);
        
        for(Thing index: things){
            
            while(box.addThing(index)){
                System.out.println("good!");
            }
            
            boxStorage.add(box);
            box = new Box(this.maxWeightForBoxes);
          
        }
        return boxStorage;
    }
    
}
