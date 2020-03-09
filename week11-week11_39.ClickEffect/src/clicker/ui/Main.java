package clicker.ui;

import javax.swing.SwingUtilities;
import clicker.applicationlogic.PersonalCalculator;
import clicker.applicationlogic.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new PersonalCalculator();
        UserInterface ui = new UserInterface(calc);
        SwingUtilities.invokeLater(ui);
        

    }
}
