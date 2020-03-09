package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.setColor(Color.BLACK);
        graphics.fillRect(75, 50, 50, 50);
        graphics.fillRect(250, 50, 50, 50);
        graphics.fillRect(20, 200, 50, 50);
        graphics.fillRect(320, 200, 50, 50);
        graphics.fillRect(70, 250, 250, 50);

    }
}
