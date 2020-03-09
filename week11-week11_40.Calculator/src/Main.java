

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        CalculatorLogic logicalCalc = new CalculatorLogic();
        SwingUtilities.invokeLater(new GraphicCalculator(logicalCalc));
    }
}
