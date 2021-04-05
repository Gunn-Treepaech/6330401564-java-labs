/**
 * This GuessNumberGameWindowV2 program
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

    public GuessNumberGameWindowV2(String title) {
        super(title);
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
