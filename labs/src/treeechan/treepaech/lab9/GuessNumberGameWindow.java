/**
 * This GuessNumberGameWindow program
 * It is a program that will draw one random number from 1-10.
 * The player can guess the number that the program randomly by pressing the number button t
 * hat the player wants.
 * The result for the player's answer will be displayed. In the text fields below.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 23, 2021
 *
 **/

package treeechan.treepaech.lab9;

import javax.swing.*;

public class GuessNumberGameWindow extends JFrame {
    public GuessNumberGameWindow(String title) {
        super(title);
    }
    public void setFrameFeatures() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void createAndShowGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GuessNumberGameWindow gngw = new GuessNumberGameWindow("GuessNumberGameWindow Version 1");
                GuessNumberGameImageCanvas gameImageCanvas = new GuessNumberGameImageCanvas();
                gngw.setContentPane(gameImageCanvas);
                gngw.setFrameFeatures();
            }
        });
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
