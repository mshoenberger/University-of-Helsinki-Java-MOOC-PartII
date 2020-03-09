/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Neptrocity
 */
public class Film {
    
    private String filmName;
    
    public Film(String name){
        this.filmName = name;
    }
    
    public String getName(){
        return this.filmName;
    }
    
    @Override
    public int hashCode(){
        return this.filmName.hashCode();
    }
    
    @Override
    public boolean equals(Object compareObject){
        if(compareObject == null | this.getClass() != compareObject.getClass()){
            return false;
        }
        
        Film comparePerson = (Film) compareObject;
        if(!this.filmName.equals(comparePerson.getName())){
            return false;
        }
        return true;
    }
    
}
