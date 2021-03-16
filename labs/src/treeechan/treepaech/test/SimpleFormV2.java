package treeechan.treepaech.test;

import javax.swing.*;

public class SimpleFormV2 extends SimpleFormV1{
    public SimpleFormV2(String title){
        super(title);
    }

    public static void createAndShowGUI() {
        SimpleFormV2 window = new SimpleFormV2("SimpleFormV2");
        window.addComponents();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
