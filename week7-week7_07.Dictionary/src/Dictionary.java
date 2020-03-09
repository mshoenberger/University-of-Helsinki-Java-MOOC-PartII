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

public class Dictionary {
    
    private HashMap<String, String> dictionary;
    
    
    public Dictionary(){
        
        this.dictionary = new HashMap<String, String>();
    }   
    
    public String translate(String word){
        
        if(this.dictionary.get(word) != null){
            return this.dictionary.get(word);
        }
        
        return null;
        
    }
    
    public void add(String word,String translate){
        
        if(this.dictionary.get(word) == null){
            this.dictionary.put(word, translate);
        }
               
    }
    
    public int amountOfWords(){
        
        int index =0;
        for(String word: this.dictionary.keySet()){
            index++;
        }
        return index;
        
    }
    
    public ArrayList<String> translationList(){
        
        ArrayList<String> translations = new ArrayList<String>();
        
        for(String word: this.dictionary.keySet()){
            translations.add(word + " = " + this.dictionary.get(word));
        }
       
        return translations;
    }
    
    
}
