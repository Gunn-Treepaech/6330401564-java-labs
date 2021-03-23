package treeechan.treepaech.test;

import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow(String title) {
        super(title);
    }
    public void setFrameFeatures() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void createAndShowGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MyWindow window = new MyWindow("My name");
               // MyCanvas canvas = new MyCanvas();
                MyPanel panel = new MyPanel();
                window.setContentPane(panel);
                window.setFrameFeatures();
            }
        });
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
