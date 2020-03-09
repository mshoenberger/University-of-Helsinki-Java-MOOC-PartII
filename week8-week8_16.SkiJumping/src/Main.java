//Author Michael Shoenberger

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Jump jump = new Jump(reader);
        GUI userInterface = new GUI(jump);
        userInterface.Start();
    }
}
