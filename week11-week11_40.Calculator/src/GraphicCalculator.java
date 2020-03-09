
import java.awt.Dimension;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.*;
import java.awt.GridLayout;

public class GraphicCalculator implements Runnable {
    
    private JFrame frame;
    
    private JTextField output;
    private JTextField input;
    
    private JButton clearButton;
    private JButton addButton;
    private JButton subtractButton;
    
    private CalculatorLogic logic;
    
    public GraphicCalculator(CalculatorLogic logic){
        this.logic = logic;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400,200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout appLayout = new GridLayout(3,1);
        container.setLayout(appLayout);
        
        this.output = new JTextField("0");
        output.setEnabled(false);
        container.add(output);
        
        this.input = new JTextField("");
        container.add(input);
        
        container.add(createControls());
    }
    
    private JPanel createControls(){
        JPanel controls = new JPanel(new GridLayout(1,3));
        
        this.clearButton = new JButton("z");
        this.clearButton.setEnabled(false);
        ClearActionListener clearListen = new ClearActionListener(this);
        this.clearButton.addActionListener(clearListen);
                
        this.addButton = new JButton("+");
        AdditionActionListener addListen = new AdditionActionListener(this);
        this.addButton.addActionListener(addListen);
        
        this.subtractButton = new JButton("-");
        SubtractionActionListener subListen = new SubtractionActionListener(this);
        this.subtractButton.addActionListener(subListen);
        
        controls.add(this.addButton);
        controls.add(this.subtractButton);
        controls.add(this.clearButton);
        
        return controls;
    }
    
    public CalculatorLogic getLogic(){
        return this.logic;
    }
    
    public JTextField getOutput(){
        return this.output;
    }
    
    public JTextField getInput(){
        return this.input;
    }
    
    public JButton getClearButton(){
        return this.clearButton;
    }
    
    public boolean isValidInput(){
        try{
            Integer.parseInt(this.input.getText());
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
