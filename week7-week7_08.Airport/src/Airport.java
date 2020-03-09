/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Airport {
    
    private ArrayList<Airplane> planes;
    private Scanner reader;
    
    
    public Airport(Scanner reader){
        this.reader = reader;
        this.planes = new ArrayList<Airplane>();
    }
    
    public void addPlane(){
        
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        
        System.out.print("Give plane capacity: ");
        int planeCapacity = Integer.parseInt(this.reader.nextLine());
        
        Airplane addedPlane = new Airplane(planeID, planeCapacity);
        this.planes.add(addedPlane);
                
    }
    
    public void addFlight(){
        
        System.out.println("Give plane ID: ");
        String planeID = this.reader.nextLine();
        
        for(Airplane plane: planes){
            if(plane.getID().equals(planeID)){
                plane.flightAdd(inputFlight());
            }
        }
    }
    
    public String inputFlight(){
        System.out.print("Give departure airport code: ");
        String departCode = this.reader.nextLine();
        
        System.out.print("Give destination airport code: ");
        String destCode = this.reader.nextLine();
        
        return "(" + departCode + "-" + destCode + ")";   
    }
    
    public void printPlanes(){
        
        for(Airplane plane: planes){
            System.out.println(plane.getID() + " (" + plane.getCapacity() + " ppl)");
        }
        
    }
    
    public void printFlights(){
        
        for(Airplane plane: planes){
            plane.allString();
        }
    }
    
    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        
        for(Airplane plane: planes){
            if(planeID.equals(plane.getID())){
                System.out.println(plane.getID() + " (" + plane.getCapacity() + " ppl)");
            }
        }
        
    }
    
   
    
    
}
