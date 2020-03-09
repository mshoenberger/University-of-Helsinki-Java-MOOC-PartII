/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        
        for(Card card: this.cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
                   
    }
    
    public int getSum(){
        int sum = 0;
        
        for(Card card: cards){
            sum += card.getValue();
        }
        
        return sum;
        
    }
    
    @Override
    public int compareTo(Hand hand){
        
        
        
        return this.getSum() - hand.getSum();
    }
    
    public void sortAgainstSuit(){
        
        Collections.sort(cards, new SortAgainstSuitAndValue());
        
        
        
    }
    
    
        
}
    
   
