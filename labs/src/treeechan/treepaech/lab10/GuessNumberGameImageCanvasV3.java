/**
 * This GuessNumberGameImageCanvasV3 class
 * It is a class, which is the same as GuessNumberGameImageCanvasV2,
 * but will be added to the test of the maximum number of tries.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 9, 2021
 *
 **/


package treeechan.treepaech.lab10;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GuessNumberGameImageCanvasV3 extends GuessNumberGameImageCanvasV2 implements ActionListener {
    protected int numPress = 0;
    final protected int gameMaxTries = 3;

    @Override
    public void playGame() {
        super.playGame();
        // Count the number of presses
        numPress++;
        if (userAnswer != correctNum){
            if (numPress == gameMaxTries){
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
                result.setText("No more tries");
                playAgain();
            }
        }
    }

    @Override
    public void playAgain(){
        int userConfirm= JOptionPane.showConfirmDialog(null,
                "Do you want to play the game again?", "Play Game Again ?", JOptionPane.YES_NO_OPTION);
        // 0=yes, 1=no
        if (userConfirm== 0){
            GuessNumberGameWindowV3.createAndShowGUI();
        } else if(userConfirm == 1){
            System.exit(0);
        }
    }
}
