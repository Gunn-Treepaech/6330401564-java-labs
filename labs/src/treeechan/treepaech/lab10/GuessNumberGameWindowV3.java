package treeechan.treepaech.lab10;

import javax.swing.*;

public class GuessNumberGameWindowV3 extends GuessNumberGameWindowV2{

    public GuessNumberGameWindowV3(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GuessNumberGameWindowV3 gngwv3 = new GuessNumberGameWindowV3("GuessNumberGameWindow Version 3");
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
