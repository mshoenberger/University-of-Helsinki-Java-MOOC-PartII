package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400,600));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        GridLayout appLayout = new GridLayout(3,1);
        container.setLayout(appLayout);
        
        JTextField topStorage = new JTextField("I was copied here from the JTextArea");
        JButton copyButton = new JButton("Copy!");
        JLabel bottomCopied = new JLabel();
        
        ActionEventListener copySystem = new ActionEventListener(topStorage, bottomCopied);
        copyButton.addActionListener(copySystem);        
        
        container.add(topStorage);
        container.add(copyButton);
        container.add(bottomCopied);
        

    }
    
    public JFrame getFrame(){
        return frame;
    }
}
