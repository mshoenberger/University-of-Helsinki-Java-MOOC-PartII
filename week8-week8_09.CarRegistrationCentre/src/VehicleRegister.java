/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owner;
    
    public VehicleRegister(){
        this.owner = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        
        if(!this.owner.containsKey(plate)){
            this.owner.put(plate, owner);
            return true;
        }
        
        return false;
        
    }
    
    public String get(RegistrationPlate plate){
        
        if(!this.owner.containsKey(plate)){
            return null;
        }
        
        return this.owner.get(plate);
                
    }
    
    public boolean delete(RegistrationPlate plate){
        
        if(this.owner.containsKey(plate)){
            this.owner.remove(plate);
            return true;
        }
        
        return false;
        
    }
    
    public void printRegistrationPlates(){
        
        for(RegistrationPlate plate : this.owner.keySet()){
            System.out.println(plate);
        }       
        
    }
    
    public void printOwners(){
        
        ArrayList<String> owners = new ArrayList<String>();
        
        
        
        for(RegistrationPlate plate: this.owner.keySet()){
            
            if(!owners.contains(owner.get(plate))){
                System.out.println(owner.get(plate));
                owners.add(this.owner.get(plate));
            }
            
        }
        
        
    }
    
    
}
