package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator){
        this.calculator = calculator;
    }
    

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        BoxLayout appInterface = new BoxLayout(container, BoxLayout.Y_AXIS);
        frame.setLayout(appInterface);
        
        JLabel numberLabel = new JLabel("0");
        container.add(numberLabel);
        
        JButton increaseValue = new JButton("Click!");
        ClickListener clickWatch = new ClickListener(this.calculator ,numberLabel);
        increaseValue.addActionListener(clickWatch);

        container.add(increaseValue);
        
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
