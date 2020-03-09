/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Neptrocity
 */
public class OneThingBox extends Box{
    
    private List<Thing> boxItems;
    
    public OneThingBox(){
        this.boxItems = new ArrayList<Thing>();
    }
    
    public void add(Thing thing){
        if(this.boxItems.size() == 0){
            this.boxItems.add(thing);
        }
    }
    
    public boolean isInTheBox(Thing thing){
        for(Thing index: this.boxItems){
            if(index.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }
    
}
