/**
 * This PlayerFormV8 program
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
    protected JFileChooser fc;

    public PlayerFormV8(String titleName) {
        super(titleName);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        fc = new JFileChooser();
    }

    @Override
    public void addListener() {
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
        if (e.getSource() == exitItem){
            System.exit(0);
        } else if (e.getSource() == openItem){
            int returnVal = fc.showOpenDialog(PlayerFormV8.this);
            if (returnVal == JFileChooser.APPROVE_OPTION){
                File selectedFile = fc.getSelectedFile();
                String msg = "Open file " + selectedFile.getName();
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "Open command cancelled by user");
            }
        } else if (e.getSource() == saveItem){
            int returnVal = fc.showSaveDialog(PlayerFormV8.this);
            if (returnVal == JFileChooser.APPROVE_OPTION){
                File selectedFile = fc.getSelectedFile();
                String msg = "Save file " + selectedFile;
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
