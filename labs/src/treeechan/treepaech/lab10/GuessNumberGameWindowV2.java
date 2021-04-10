/**
 * This GuessNumberGameWindowV2 program
 * The behavior of the game is that the user needs to keep guessing the number by clicking
 * at the number buttons until the guessed number is the same as the answer number
 * which is randomly generated in the range [1, 10]
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 5, 2021
 *
 **/

package treeechan.treepaech.lab10;

import treeechan.treepaech.lab9.GuessNumberGameWindow;

import javax.swing.*;

public class GuessNumberGameWindowV2 extends GuessNumberGameWindow {
    protected int gameStatus = 0;
//    protected static GuessNumberGameWindowV2 gngwv2;
    protected JButton playAgain = new JButton("PlayAgain");
    protected JPanel panelPlayAgain = new JPanel();

    public GuessNumberGameWindowV2(String title) {
        super(title);
    }

    @Override
    public void setFrameFeatures() {
        super.setFrameFeatures();
        panelPlayAgain.add(playAgain);
        add(panelPlayAgain);
    }

    public static void playAgain(){
        int userConfirmDialog = JOptionPane.showConfirmDialog(null,
                "Do you want to play the game again?", "Play Game ?", JOptionPane.YES_NO_OPTION);
        // 0=yes, 1=no
        if (userConfirmDialog == 0){
            createAndShowGUI();
        } else if(userConfirmDialog == 1){
            System.exit(0);
        }
    }

    public static void createAndShowGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GuessNumberGameWindowV2 gngwv2 = new GuessNumberGameWindowV2("GuessNumberGameWindow Version 2");
                GuessNumberGameImageCanvasV2 gameImageCanvas = new GuessNumberGameImageCanvasV2();
                gngwv2.setContentPane(gameImageCanvas);
                gngwv2.setFrameFeatures();
            }
        });
    }
    public static void main(String[] args) {
        createAndShowGUI();
    }
}
