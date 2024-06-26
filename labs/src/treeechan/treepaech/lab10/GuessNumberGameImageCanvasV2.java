/**
 * This GuessNumberGameImageCanvasV2 class
 * It is a class which is the same as GuessNumberGameImageCanvasV1 but will be added to detect which button the player press
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 5, 2021
 *
 **/

package treeechan.treepaech.lab10;

import treeechan.treepaech.lab9.GuessNumberGameImageCanvas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberGameImageCanvasV2 extends GuessNumberGameImageCanvas implements ActionListener {
    GuessNumberGameImageCanvasV2(){
        addListener();
        result.setText("");
    }
    public void addListener(){
        // add listener
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
            // set button can not enabled
            number1.setEnabled(false);
            number2.setEnabled(false);
            number3.setEnabled(false);
            number4.setEnabled(false);
            number5.setEnabled(false);
            number6.setEnabled(false);
            number7.setEnabled(false);
            number8.setEnabled(false);
            number9.setEnabled(false);
            number10.setEnabled(false);
            result.setText("Congratulations!");
            playAgain();

        } else if (userAnswer >= correctNum){
            result.setText("Lower");
        } else {
            result.setText("Higher");
        }
    }

    public void playAgain(){
        int userConfirm = JOptionPane.showConfirmDialog(null,
                "Do you want to play the game again?", "Play Game Again ?", JOptionPane.YES_NO_OPTION);
        // 0=yes, 1=no
        if (userConfirm == 0){
            GuessNumberGameWindowV2.createAndShowGUI();
        } else if(userConfirm == 1){
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        correctNum = guessNumberGame.getCorrectNum();
        // set user answer
        if (e.getSource() == number1){
           this.userAnswer = 1;
        }
        else if (e.getSource() == number2){
            this.userAnswer = 2;
        }
        else if (e.getSource() == number3){
            this.userAnswer = 3;
        }
        else if (e.getSource() == number4){
            this.userAnswer = 4;
        }
        else if (e.getSource() == number5){
            this.userAnswer = 5;
        }
        else if (e.getSource() == number6){
            this.userAnswer = 6;
        }
        else if (e.getSource() == number7){
            this.userAnswer = 7;
        }
        else if (e.getSource() == number8){
            this.userAnswer = 8;
        }
        else if (e.getSource() == number9){
            this.userAnswer = 9;
        }
        else if (e.getSource() == number10){
            this.userAnswer = 10;
        }
        playGame();
    }
}
