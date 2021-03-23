/**
 * This DiceGameWindow program
 * It is a program that will display the pages of the dice
 * according to the number of dice that have been randomized
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 23, 2021
 *
 **/

package treeechan.treepaech.lab9;

import treeechan.treepaech.lab6.DiceGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceGameWindow extends JFrame implements ActionListener {
    protected DiceImageCanvas diceImageCanvas;
    protected DiceGame diceGame;
    protected int diceRoll;
    protected JPanel buttonsPanel;
    protected JButton rollButton, highButton, lowButton;

    public DiceGameWindow(String title) {
        super(title);
        diceGame = new DiceGame();
        diceRoll = diceGame.getDiceRoll(); // Take out the random dice value.
        diceImageCanvas = new DiceImageCanvas(diceRoll);
    }

    public void setFrameFeatures() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void addComponents() {
        buttonsPanel = new JPanel(new FlowLayout());
        rollButton = new JButton("Roll");
        highButton = new JButton("High");
        lowButton = new JButton("Low");
        buttonsPanel.add(highButton);
        buttonsPanel.add(lowButton);
        buttonsPanel.add(rollButton);

        this.setLayout(new BorderLayout());
        this.add(buttonsPanel, BorderLayout.NORTH);
        this.add(diceImageCanvas, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        DiceGameWindow dgw = new DiceGameWindow("DiceGameWindow Version 1");
        dgw.addComponents();
        dgw.addListener();
        dgw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public void addListener(){
        rollButton.addActionListener(this);
        highButton.addActionListener(this);
        lowButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rollButton){
            dispose();
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
            diceGame.playGame();
        }
        else if (e.getSource() == highButton){
            diceGame.setAnswer("h");
        }
        else if (e.getSource() == lowButton){
            diceGame.setAnswer("l");
        }

    }
}
