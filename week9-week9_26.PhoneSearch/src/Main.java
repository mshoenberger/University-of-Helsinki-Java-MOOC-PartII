
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        PersonInfoSystem phonebook = new PersonInfoSystem();
        UserUI programUI = new UserUI(reader, phonebook);
        
        programUI.Start();
    }
}
