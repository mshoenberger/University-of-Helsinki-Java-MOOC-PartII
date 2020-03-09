
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
/**
 *
 * @author Neptrocity
 */
public class AdditionActionListener implements ActionListener {
    
    private JTextField output;
    private JTextField input;
    private JButton clearButton;
    private CalculatorLogic logic;
    private GraphicCalculator calc;
    
    public AdditionActionListener(GraphicCalculator calcUI){
        this.output = calcUI.getOutput();
        this.input = calcUI.getInput();
        this.clearButton = calcUI.getClearButton();
        this.logic = calcUI.getLogic();
        this.calc = calcUI;
    }

    @Override 
    public void actionPerformed(ActionEvent ae){
        if(this.calc.isValidInput()){
            int valueToAdd = Integer.parseInt(this.input.getText());
            this.logic.addValue(valueToAdd);
            this.output.setText("" + this.logic.getValue());
            this.input.setText("");
            
            if(this.logic.getValue() ==0){
                this.clearButton.setEnabled(false);
            }else{
                this.clearButton.setEnabled(true);
            }
            
        }else{
            this.input.setText("");
        }  
    }

}
