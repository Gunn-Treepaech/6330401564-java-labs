/**
 * This MySimpleWindow program
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 14, 2021
 *
 **/

package treeechan.treepaech.lab8;

import javax.swing.*;

public class MySimpleWindow extends JFrame {
    protected JPanel panelButton,panelMySimpleWindowMain;
    protected JButton buttonA,buttonB;

    public MySimpleWindow(String titleName){
        super(titleName);
    }
    public void addComponents(){
        panelMySimpleWindowMain = new JPanel();
        panelButton = new JPanel();
        buttonA = new JButton("Reset");
        buttonB = new JButton("Submit");
        panelButton.add(buttonA);
        panelButton.add(buttonB);
        panelMySimpleWindowMain.add(panelButton);
        setContentPane(panelMySimpleWindowMain);
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
