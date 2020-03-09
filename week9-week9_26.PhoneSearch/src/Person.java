/**
 *
 * @author Neptrocity
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Person {
    
    private String name;
    private ArrayList<String> phoneNumbersList;
    private String streetName;
    private String cityName;
    
    public Person(){
        this.phoneNumbersList = new ArrayList<String>();
        this.streetName = "";
        this.cityName = "";
        this.name = "";
    }
    
    public void addName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPhoneNumber(String phoneNumer){
        this.phoneNumbersList.add(phoneNumer);
    }
    
    public String getPhoneNumbers(){
        String numbers = " ";
        for(String phoneNumber: phoneNumbersList){
            numbers = numbers + phoneNumber + " \n ";
        }
        return numbers;
    }
    
    public void addAddress(){
        
    }
    
    public void addAddress(String Street, String City){
        this.streetName = Street;
        this.cityName = City;
    }
    
    public String getAddrses(){
        return this.streetName + " " + this.cityName;
    }
    
    
    
    
}
