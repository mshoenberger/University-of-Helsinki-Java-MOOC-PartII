package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(300,400));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
        
        // Create your app here
    }
    
    private void createComponents(Container container){
        BoxLayout programLayout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(programLayout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox affirm = new JCheckBox("Yes!");
        JCheckBox deny = new JCheckBox("No!");
        
        container.add(affirm);
        container.add(deny);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton noLogic = new JRadioButton("No reason.");
        JRadioButton logicFun = new JRadioButton("Because it is fun!");
        
        ButtonGroup userSelection = new ButtonGroup();
        userSelection.add(noLogic);
        userSelection.add(logicFun);
        
        container.add(noLogic);
        container.add(logicFun);
        
        container.add(new JButton("Done!"));
        
    }


    public JFrame getFrame() {
        return frame;
    }
}
