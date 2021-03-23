package treeechan.treepaech.test;

import treeechan.treepaech.lab9.GuessNumberGameImageCanvas;
import treeechan.treepaech.lab9.GuessNumberGameWindow;

import javax.swing.*;

public class Study02 extends JFrame{
        public Study02(String title) {
            super(title);
        }
        public void setFrameFeatures() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(100, 100);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }
        public static void createAndShowGUI() {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    Study02 sty = new Study02("633040156-4");
                    Study021 study = new Study021();
                    sty.setContentPane(study);
                    sty.setFrameFeatures();
                }
            });
        }
        public static void main(String[] args) {
            createAndShowGUI();
        }
}
