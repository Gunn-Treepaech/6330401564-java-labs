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
    protected static int gameStatus = 0;
    protected static GuessNumberGameWindowV2 gngwv2;

    public GuessNumberGameWindowV2(String title) {
        super(title);
        gameStatus++;
    }

    public static void createAndShowGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                if (gameStatus >= 1){
                    gngwv2.dispose();
                }
                gngwv2 = new GuessNumberGameWindowV2("GuessNumberGameWindow Version 2");
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
