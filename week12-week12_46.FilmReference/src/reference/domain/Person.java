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
public class Person {
    
    private String personName;
    
    public Person(String name){
        this.personName = name;
    }
    
    public String getName(){
        return this.personName;
    }
    
    @Override
    public int hashCode(){
        return this.personName.hashCode();
    }
    
    public boolean equals(Object compareObject){
        if(compareObject == null || this.getClass() != compareObject.getClass()){
            return false;
        }

        Person comparePerson = (Person) compareObject;
        if(!this.personName.equals(comparePerson.getName())){
            return false;
        }
        return true;
    }
    
}
