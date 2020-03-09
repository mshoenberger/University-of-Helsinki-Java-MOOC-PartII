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
public class BlackHoleBox extends Box{
    
    private List<Thing> boxItems;
    
    public BlackHoleBox(){
        this.boxItems = new ArrayList<Thing>();
    }
    
    public void add(Thing thing){
        this.boxItems.add(thing);
    }
    
    public boolean isInTheBox(Thing thing){
        this.boxItems.clear();
        for(Thing index: this.boxItems){
            if(index.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }
    
}
