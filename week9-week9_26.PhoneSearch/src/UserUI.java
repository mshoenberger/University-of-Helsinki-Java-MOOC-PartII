/**
 *
 * @author Neptrocity
 */

import java.util.Scanner;

public class UserUI {
    
    private Scanner reader;
    private PersonInfoSystem phoneBook;
    
    public UserUI(Scanner reader, PersonInfoSystem infoSystem){
        this.reader = reader;
        this.phoneBook = infoSystem;
    }
    
    public void Start(){
        System.out.println("phone search \n"
                + "available operations: \n"
                + "1 add a number \n"
                + "2 search for a number \n"
                + "3 search for a person by phone number \n"
                + "4 add an address \n"
                + "5 search for personal information \n"
                + "6 delete personal information \n"
                + "7 filtered listing \n"
                + "x quit \n");
        askCommand();
    }
    
    public void askCommand(){
        while(true){
            System.out.print("command: ");
            String userInput = this.reader.nextLine();
            if(userInput.equals("x")){
                break;
            }else{
                checkLogicCommand(userInput);
            }
            System.out.println("");
        }
    }
    
    public void checkLogicCommand(String userInput){
        
        if(userInput.equals("1")){
            this.phoneBook.addNumber(reader);            
        }else if(userInput.equals("2")){
            System.out.print(this.phoneBook.searchNumber(reader));
        }else if(userInput.equals("3")){
            this.phoneBook.searchForPersonByNumber(reader);
        }else if(userInput.equals("4")){
            this.phoneBook.addAddress();
        }else if(userInput.equals("5")){
            this.phoneBook.searchForPersonalInfo();
        }else if(userInput.equals("6")){
            this.phoneBook.deletePerson();
        }else if(userInput.equals("7")){
            this.phoneBook.filteredListing();
        }
    }
    
}
