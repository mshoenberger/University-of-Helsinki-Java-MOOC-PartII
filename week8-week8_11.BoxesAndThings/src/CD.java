/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
public class CD implements ToBeStored {
    
    private String artist;
    private String title;
    private int publishYear;
    private double weight;
    
    public CD(String artist, String title, int publishYear){
        
        this.artist = artist;
        this.title = title;
        this.publishYear = publishYear;
        this.weight = 0.1;
        
    }
    
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artist +": " + this.title + " (" + this.publishYear + ")";
    }
    
}
