/**
 * This GuessNumberGameImageCanvas class
 * This class will design a program window by adding a number keypad from 1 to 10
 * and the text above and below the window.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 23, 2021
 *
 **/

package treeechan.treepaech.lab9;

import treeechan.treepaech.lab6.GuessNumberGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberGameImageCanvas extends JPanel implements ActionListener {
    protected Font f = new Font("Serif",Font.BOLD, 24); // Set font, thickness, size
    protected GuessNumberGame guessNumberGame = new GuessNumberGame();
    protected JTextField result;
    protected JPanel panelCenter;
    protected JButton number1, number2, number3, number4, number5, number6,
            number7, number8, number9, number10;
    protected GridBagConstraints gbc = new GridBagConstraints();
    protected int startX, startY;
    protected int correctNum, userAnswer;

    public void initComponents(){
        setLayout(new GridBagLayout());
        panelCenter = new JPanel(new GridLayout(0,5));
        result = new JTextField(15);
        result.setEditable(false);
        result.setFont(f);
        number1 = new JButton(new ImageIcon( "images/number1.png"));
        number1.setBackground(Color.WHITE);
        number2 = new JButton(new ImageIcon("images/number2.png"));
        number2.setBackground(Color.WHITE);
        number3 = new JButton(new ImageIcon("images/number3.png"));
        number3.setBackground(Color.WHITE);
        number4 = new JButton(new ImageIcon("images/number4.png"));
        number4.setBackground(Color.WHITE);
        number5 = new JButton(new ImageIcon("images/number5.png"));
        number5.setBackground(Color.WHITE);
        number6 = new JButton(new ImageIcon("images/number6.png"));
        number6.setBackground(Color.WHITE);
        number7 = new JButton(new ImageIcon("images/number7.png"));
        number7.setBackground(Color.WHITE);
        number8 = new JButton(new ImageIcon("images/number8.png"));
        number8.setBackground(Color.WHITE);
        number9 = new JButton(new ImageIcon("images/number9.png"));
        number9.setBackground(Color.WHITE);
        number10 = new JButton(new ImageIcon("images/number10.png"));
        number10.setBackground(Color.WHITE);
    }
    public GuessNumberGameImageCanvas(){
        initComponents();
        addListener();
        JPanel panelNumber1 = new JPanel();
        JPanel  panelNumber2 = new JPanel();
        JPanel  panelNumber3 = new JPanel();
        JPanel  panelNumber4 = new JPanel();
        JPanel  panelNumber5 = new JPanel();
        JPanel  panelNumber6 = new JPanel();
        JPanel  panelNumber7 = new JPanel();
        JPanel  panelNumber8 = new JPanel();
        JPanel  panelNumber9 = new JPanel();
        JPanel  panelNumber10 = new JPanel();
        // Add each keypad to its own panel.
        panelNumber1.add(number1);
        panelNumber2.add(number2);
        panelNumber3.add(number3);
        panelNumber4.add(number4);
        panelNumber5.add(number5);
        panelNumber6.add(number6);
        panelNumber7.add(number7);
        panelNumber8.add(number8);
        panelNumber9.add(number9);
        panelNumber10.add(number10);
        // Add panel to the main panel.
        panelCenter.add(panelNumber1);
        panelCenter.add(panelNumber2);
        panelCenter.add(panelNumber3);
        panelCenter.add(panelNumber4);
        panelCenter.add(panelNumber5);
        panelCenter.add(panelNumber6);
        panelCenter.add(panelNumber7);
        panelCenter.add(panelNumber8);
        panelCenter.add(panelNumber9);
        panelCenter.add(panelNumber10);
        // Add panel to frame to display.
        add(panelCenter);
        gbc.gridx = startX; gbc.gridy = startY + 50;
        add(result,gbc);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        startX = getWidth() / getWidth();
        startY = (getHeight() / getHeight()) + 13;
        String msgTop = "Please guess by clicking at the number:";
        String msgBottom = "Result:";
        System.out.println(getWidth());
        System.out.println(getHeight());
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.setColor(Color.BLUE);
        g.drawString(msgTop, startX + (panelCenter.getWidth() / 3),
                startY + (panelCenter.getHeight() / 14));
        g.drawString(msgBottom, startX + (panelCenter.getWidth() / 4),
                getHeight() - (panelCenter.getHeight() / 5));
    }
    public void addListener(){
        number1.addActionListener(this);
        number2.addActionListener(this);
        number3.addActionListener(this);
        number4.addActionListener(this);
        number5.addActionListener(this);
        number6.addActionListener(this);
        number7.addActionListener(this);
        number8.addActionListener(this);
        number9.addActionListener(this);
        number10.addActionListener(this);
    }
    public void playGame(){
        if (userAnswer == correctNum){
            result.setText("Congratulations!");
        } else {
            result.setText("Sorry You Lose!");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        correctNum = guessNumberGame.getCorrectNum();
        if (e.getSource() == number1){
           this.userAnswer = 1;
           playGame();
        }
        else if (e.getSource() == number2){
            this.userAnswer = 2;
            playGame();
        }
        else if (e.getSource() == number3){
            this.userAnswer = 3;
            playGame();
        }
        else if (e.getSource() == number4){
            this.userAnswer = 4;
            playGame();
        }
        else if (e.getSource() == number5){
            this.userAnswer = 5;
            playGame();
        }
        else if (e.getSource() == number6){
            this.userAnswer = 6;
            playGame();
        }
        else if (e.getSource() == number7){
            this.userAnswer = 7;
            playGame();
        }
        else if (e.getSource() == number8){
            this.userAnswer = 8;
            playGame();
        }
        else if (e.getSource() == number9){
            this.userAnswer = 9;
            playGame();
        }
        else if (e.getSource() == number10){
            this.userAnswer = 10;
            playGame();
        }
    }
}
