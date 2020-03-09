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

public class AirportPanelGUI {
    
    private Scanner reader;
    private Airport airport;
      
    
    public AirportPanelGUI(Scanner reader, Airport airport){
        this.reader = reader;
        this.airport = airport;
    }
    
    public void Start(){
        
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        while(true){
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print(">");
            
            String userChoice = reader.nextLine();
            if(userChoice.equals("1")){
                airport.addPlane();
            }else if(userChoice.equals("2")){
                airport.addFlight();
            }else if(userChoice.equals("x")){
                break;
            }
            
        }
        
        System.out.println("");
        startFlightService();        
        
    }
    
    public void startFlightService(){
        
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        
        while(true){
            
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            
            String userChoice = reader.nextLine();
            if(userChoice.equals("1")){
                airport.printPlanes();
            }else if(userChoice.equals("2")){
                airport.printFlights();
            }else if(userChoice.equals("3")){
                airport.printPlaneInfo();
            }else if(userChoice.equals("x")){
                break;
            }
            
            System.out.println("");
            
        }
            
    }
        
        
}
    
    
    
