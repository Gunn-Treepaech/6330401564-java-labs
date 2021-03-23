package treeechan.treepaech.test;

import javax.swing.*;
import java.awt.*;

public class MyCanvas extends JPanel {
    protected int x, y;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        x = getWidth() / 2;
        y = getHeight() / 2;
        String msg = "Manee Jaidee";
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.setColor(Color.BLUE);
        g.drawString(msg, x, y);
    }
}
