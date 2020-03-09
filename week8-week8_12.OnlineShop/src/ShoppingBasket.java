/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class ShoppingBasket {
    
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket(){
        this.purchases = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        
        if(!purchases.containsKey(product)){
            Purchase storage = new Purchase(product, 1, price);
            purchases.put(product, storage);
        }else{
            purchases.get(product).increaseAmount();
        }
       
    }
    
    public int price(){
        int value = 0;
        
        for(Purchase items: purchases.values()){
            value += items.price();
        }
        
        return value;
        
    }
    
    public void print(){
        
        Set<Purchase> holder = new HashSet<Purchase>();
        
        for(Purchase item: purchases.values()){
            holder.add(item);
        }
        
        for(Purchase item: holder){
            System.out.println(item);
        }
        
        
        
    }
    
    
}
