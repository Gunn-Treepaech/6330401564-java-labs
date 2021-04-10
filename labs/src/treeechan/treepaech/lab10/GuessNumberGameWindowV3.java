/**
 * This GuessNumberGameImageCanvasV3 class
 * The behavior of the game is that the user needs to keep guessing the number by clicking
 * at the number buttons until the guessed number is the same as the answer number
 * which is randomly generated in the range [1, 10] but the player will be enforced with the max number of tries.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 9, 2021
 *
 **/

package treeechan.treepaech.lab10;

import javax.swing.*;

public class GuessNumberGameWindowV3 extends GuessNumberGameWindowV2{
    protected static GuessNumberGameWindowV3 gngwv3;

    public GuessNumberGameWindowV3(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                if (gameStatus == 1){
                    gngwv3.dispose();
                }
                gngwv3 = new GuessNumberGameWindowV3("GuessNumberGameWindow Version 3");
                GuessNumberGameImageCanvasV3 gameImageCanvas = new GuessNumberGameImageCanvasV3();
                gngwv3.setContentPane(gameImageCanvas);
                gngwv3.setFrameFeatures();
            }
        });
    }
    public static void main(String[] args) {
        createAndShowGUI();
    }
}
