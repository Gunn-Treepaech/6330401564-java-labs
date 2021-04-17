/**
 * This PlayerFormV8 program
 * When the user clicks the menu item Open, the program opens the open file dialog.
 * If the user selects an existing file, the program shows the message dialog displaying
 * the name of the file that is selected to open.
 * If the user presses Cancel, the program should show the option message “Open command cancelled by user”.
 * When the user clicks the menu item Save, the program opens the save  file dialog.
 * If the user selects an existing file, the program shows the message dialog displaying the name of
 * the file that is selected to open.
 * If the user presses Cancel, the program should show the option message “Save command cancelled by user”
 * When the user selects the menu Config > Color > {Red, Green, Blue}, the text color of the three text fields should be changed.
 * When the user selects the menu Config > Size > {16, 20, 24)}, the text size of the text area should be changed to {16, 20, 24}.
 *
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 5, 2021
 *
 **/

package treeechan.treepaech.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class PlayerFormV8 extends PlayerFormV7 implements ActionListener {
    protected JFileChooser fc = new JFileChooser();
    protected File selectedOpenFile;
    protected File selectedSaveFile;
    protected int returnValSave;
    protected int returnValOpen;

    public PlayerFormV8(String titleName) {
        super(titleName);
    }

    @Override
    public void addListener() {
        // add listener and shortcut key
        super.addListener();
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        exitItem.addActionListener(this);
        openItem.setMnemonic(KeyEvent.VK_O);
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        openItem.addActionListener(this);
        saveItem.setMnemonic(KeyEvent.VK_S);
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        saveItem.addActionListener(this);

        colorRed.addActionListener(this);
        colorBlue.addActionListener(this);
        colorGreen.addActionListener(this);

        size16.addActionListener(this);
        size20.addActionListener(this);
        size24.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource() == exitItem){
            System.exit(0);
        } else if (e.getSource() == openItem){
            returnValOpen = fc.showOpenDialog(PlayerFormV8.this);
            if (returnValOpen == JFileChooser.APPROVE_OPTION){
                selectedOpenFile = fc.getSelectedFile();
                String msg = "Open file " + selectedOpenFile.getName();
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "Open command cancelled by user");
            }
        } else if (e.getSource() == saveItem){
            returnValSave = fc.showSaveDialog(PlayerFormV8.this);
            if (returnValSave == JFileChooser.APPROVE_OPTION){
                selectedSaveFile = fc.getSelectedFile();
                String msg = "Save file " + selectedSaveFile;
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "Save command cancelled by user");
            }
        } else if (e.getSource() == colorRed){
            name.setForeground(Color.RED);
            nationality.setForeground(Color.RED);
            birth.setForeground(Color.RED);
        } else if (e.getSource() == colorBlue){
            name.setForeground(Color.BLUE);
            nationality.setForeground(Color.BLUE);
            birth.setForeground(Color.BLUE);
        } else if (e.getSource() == colorGreen){
            name.setForeground(Color.GREEN);
            nationality.setForeground(Color.GREEN);
            birth.setForeground(Color.GREEN);
        } else if (e.getSource() == size16){
            final int size = 16;
            noteText.setFont(new Font(noteText.getFont().getName(), Font.PLAIN, size));
        } else if (e.getSource() == size20){
            final int size = 20;
            noteText.setFont(new Font(noteText.getFont().getName(), Font.PLAIN, size));
        } else if (e.getSource() == size24){
            final int size = 24;
            noteText.setFont(new Font(noteText.getFont().getName(), Font.PLAIN, size));
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV8 pfv8 = new PlayerFormV8("Player Form V8");
        pfv8.addComponents();
        pfv8.setFrameFeatures();
        pfv8.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
