package treeechan.treepaech.lab8;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected JPanel panelButton,panelMain;
    protected JButton buttonA,buttonB;

    public MySimpleWindow(String titleName){
        super(titleName);
    }
    public void addComponents(){
        panelMain = new JPanel();
        panelButton = new JPanel();
        buttonA = new JButton("Reset");
        buttonB = new JButton("Submit");
        panelButton.add(buttonA);
        panelButton.add(buttonB);
        panelMain.add(panelButton);
        setContentPane(panelMain);
    }
    public void setFrameFeatures(){
        setSize(500, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void createAndShowGUI(){
        MySimpleWindow msw = new MySimpleWindow("MySimpleWindow");
        msw.addComponents();
        msw.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }
}
