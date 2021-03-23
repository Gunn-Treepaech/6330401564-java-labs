/**
 * This DiceImageCanvas class
 * It is a class that will draw the face of the dice that the program can randomly come.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 23, 2021
 *
 **/

package treeechan.treepaech.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DiceImageCanvas extends JPanel {
    protected int diceNumber;
    protected Graphics2D g2d;
    protected Ellipse2D.Double circleCenter, circleTopRight, circleBottomLeft,
            circleTopLeft, circleBottomRight, circleLeftCenter, circleRightCenter;
    protected Rectangle2D.Double square;
    protected int width = 150, height = 150;
    protected int canvasWidth = 400, canvasHeight = 400;
    protected int circleWidth = 30, circleHeight = 30;
    protected int startSquareX = 125;
    protected int startSquareY = 40;
    protected int margin = 10;
    public DiceImageCanvas(int diceNumber) {
        this.diceNumber = diceNumber;
        this.setSize(canvasWidth,canvasHeight);
        square = new Rectangle2D.Double(startSquareX, startSquareY, width, height);
        createCircles();
    }

    protected void createCircles() {
        // create red on all circles that will be placed on a rectangle
        circleCenter = new Ellipse2D.Double((startSquareX + width / 2.0 ) - (circleWidth / 2.0),
                (startSquareY + height / 2.0) - (circleHeight / 2.0), circleWidth, circleHeight);
        circleTopRight = new Ellipse2D.Double((startSquareX + width) - (margin + circleWidth),
                startSquareY + margin, circleWidth, circleHeight);
        circleBottomLeft = new Ellipse2D.Double(startSquareX + margin,
                (startSquareY + height) - (margin + circleHeight), circleWidth, circleHeight);
        circleTopLeft = new Ellipse2D.Double(startSquareX + margin,
                startSquareY + margin, circleWidth, circleHeight);
        circleBottomRight = new Ellipse2D.Double((startSquareX + width) - (margin + circleWidth),
                (startSquareY + height) - (margin + circleHeight), circleWidth, circleHeight);
        circleLeftCenter = new Ellipse2D.Double(startSquareX + margin,
                (startSquareY + height / 2.0) - (circleHeight / 2.0), circleWidth, circleHeight);
        circleRightCenter = new Ellipse2D.Double((startSquareX + width) - (margin + circleWidth),
                (startSquareY + height / 2.0) - (circleHeight / 2.0), circleWidth, circleHeight);
    }

    protected void drawDiceNumber() {
        // depending on a dice number, place red dots properly on a rectangle
        g2d.setColor(Color.WHITE);
        g2d.fill(square);
        g2d.setColor(Color.RED);
        switch (diceNumber){
            case 1 : g2d.fill(circleCenter);
                     break;
            case 2 : g2d.fill(circleTopRight);
                     g2d.fill(circleBottomLeft);
                     break;
            case 3 : g2d.fill(circleTopRight);
                     g2d.fill(circleBottomLeft);
                     g2d.fill(circleCenter);
                     break;
            case 4 : g2d.fill(circleTopRight);
                     g2d.fill(circleBottomLeft);
                     g2d.fill(circleTopLeft);
                     g2d.fill(circleBottomRight);
                     break;
            case 5 : g2d.fill(circleTopRight);
                     g2d.fill(circleBottomLeft);
                     g2d.fill(circleTopLeft);
                     g2d.fill(circleBottomRight);
                     g2d.fill(circleCenter);
                     break;
            case 6 : g2d.fill(circleTopRight);
                     g2d.fill(circleBottomLeft);
                     g2d.fill(circleTopLeft);
                     g2d.fill(circleBottomRight);
                     g2d.fill(circleLeftCenter);
                     g2d.fill(circleRightCenter);
                     break;
        }
        g2d.setColor(Color.WHITE);
        g2d.draw(square);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2d = (Graphics2D) g;
        drawDiceNumber();
    }
}
