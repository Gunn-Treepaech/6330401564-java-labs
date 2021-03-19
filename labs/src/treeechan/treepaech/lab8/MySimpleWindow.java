/**
 * This MySimpleWindow program
 * This program brings up a Windows, Window with two buttons is Reset and Submit.
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
    protected JButton resetButton, submitButton;

    public MySimpleWindow(String titleName){
        super(titleName);
    }

    public void addComponents(){
        panelMySimpleWindowMain = new JPanel();
        panelButton = new JPanel();
        resetButton = new JButton("Reset"); //Create a button name Reset
        submitButton = new JButton("Submit");
        panelButton.add(resetButton);   // Add a button to panelButton
        panelButton.add(submitButton);  // Add a button to panelButton
        panelMySimpleWindowMain.add(panelButton);
        setContentPane(panelMySimpleWindowMain);
    }

    public void setFrameFeatures(){
        setLocationRelativeTo(null); // Puts it in the middle of the screen.
        setVisible(true); // Make it visible.
        pack();   // Making it visible.
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Make the press exit will close the program.
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
