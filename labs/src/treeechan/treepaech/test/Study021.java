package treeechan.treepaech.test;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Study021 extends JPanel {
    protected Ellipse2D.Double circle;
    protected Rectangle2D.Double square;
    protected Graphics2D g2d;

    public Study021(){
        circle = new Ellipse2D.Double(10,10,50,50);
        square = new Rectangle2D.Double((circle.getWidth() / 2) + 5,(circle.height / 2) + 5,10,10);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2d = (Graphics2D) g;
        g2d.setColor(Color.CYAN);
        g2d.fill(square);
        g2d.setColor(Color.RED);
        g2d.draw(circle);
    }
}
