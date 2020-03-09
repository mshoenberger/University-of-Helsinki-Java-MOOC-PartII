/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;
/**
 *
 * @author Neptrocity
 */
public class Cow implements Milkable, Alive{
    
    private String cowName;
    private double udderCapacity;
    private double currentUdderAmount; 
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    
    
    public Cow(){
        this.cowName = NAMES[new Random().nextInt(NAMES.length)];
        this.udderCapacity = new Random().nextInt(26) + 15.0;
        this.currentUdderAmount = 0;
    }
    
    public Cow(String name){
        this.cowName = name;
        this.udderCapacity = new Random().nextInt(26) + 15;
        this.currentUdderAmount = 0;
    }
    
    public String getName(){
        return this.cowName;
    }
    
    public double getCapacity(){
        return this.udderCapacity;
    }
    
    public double getAmount(){
        return this.currentUdderAmount;
    }
    
    public String toString(){
        return this.cowName +" " + Math.ceil(this.currentUdderAmount) + "/" + Math.ceil(this.udderCapacity);
    }
    
    public double milk(){
        double taken = this.currentUdderAmount;
        this.currentUdderAmount = 0;
        return taken;
    }
    
    public void liveHour(){
        double milkAccumulated = new Random().nextDouble() *2;
        if(milkAccumulated < 0.7){
            milkAccumulated = 0.7;
        }
        
        if(this.currentUdderAmount + milkAccumulated <= this.udderCapacity){
            this.currentUdderAmount += milkAccumulated;
        }else{
            this.currentUdderAmount = this.udderCapacity;
        }
        
        
    }
    
    
    
    
}
