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

public class Storehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Storehouse(){
        this.prices = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        
        if(this.prices.containsKey(product)){
            return this.prices.get(product);
        }
        
        return -99;
    }
    
    public int stock(String product){
        
        if(!this.stock.containsKey(product)){
            return 0;
        }
        
        return this.stock.get(product);
    }
    
    public boolean take(String product){
        
        int stockNum = stock(product);
            
        if(stockNum > 0){
            this.stock.replace(product, stockNum- 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> set = new HashSet<String>();
        
        for(String product: this.prices.keySet()){
            set.add(product);
        }
        
        return set;
        
    }
    
    
}
