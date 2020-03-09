/**
 *
 * @author Neptrocity
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PersonInfoSystem {
    
    private Map<String, Person> personStorage;
    
    public PersonInfoSystem(){
        this.personStorage = new HashMap<String, Person>();
    }
    
    public void addNumber(Scanner reader){
        System.out.print("whose number: ");
        String userName = reader.nextLine();
        if(!this.personStorage.containsKey(userName)){
            this.personStorage.put(userName, new Person());
        }
        
        
        System.out.print("number: ");
        String userNumber = reader.nextLine();
        this.personStorage.get(userName).addPhoneNumber(userNumber);
        
    }
    
    public String searchNumber(Scanner reader){
        System.out.print("whose number: ");
        String userName = reader.nextLine();
        
        if(!this.personStorage.containsKey(userName)){
            return " not found";
        }
        return this.personStorage.get(userName).getPhoneNumbers();
    }
    
    public void searchForPersonByNumber(Scanner reader){
        System.out.print("number: ");
        String userNumber = reader.nextLine();
    
        
   
    
    public void searchForPersonalInfo(){
        
    }
    
    public void deletePerson(){
        
    }
    
    public void filteredListing(){
        
    }
    
    
    
    
    
}
