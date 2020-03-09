
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
/**
 *
 * @author Neptrocity
 */
public class ClearActionListener implements ActionListener {
    
    private JTextField output;
    private JTextField input;
    private JButton clearButton;
    private CalculatorLogic logic;
    private GraphicCalculator calc;
    
    public ClearActionListener(GraphicCalculator calcUI){
        this.output = calcUI.getOutput();
        this.input = calcUI.getInput();
        this.clearButton = calcUI.getClearButton();
        this.logic = calcUI.getLogic();
        this.calc = calcUI;
    }

    @Override 
    public void actionPerformed(ActionEvent ae){
        this.logic.resetValue();
        this.output.setText("" + this.logic.getValue());
        this.clearButton.setEnabled(false);
        this.input.setText("");
    }

}
