/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import reference.domain.Person;

import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Neptrocity
 */
public class PersonComparator implements Comparator<Person>{
    
    private Map<Person, Integer> identitiesToCompare;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities){
        this.identitiesToCompare = peopleIdentities;
    }
    
    @Override
    public int compare(Person person1, Person person2){
        if(identitiesToCompare.get(person1) == identitiesToCompare.get(person2)){
            return 0;
        }else if(identitiesToCompare.get(person1) > identitiesToCompare.get(person2)){
            return -1;
        }else{
                return 1;
        }        
    }

}
