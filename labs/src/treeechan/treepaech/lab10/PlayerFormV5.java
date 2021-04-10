/**
 * This PlayerFormV5 program
 * When the user enters the top three text fields and clicks the Submit button
 * then the program displays the message in the message dialog as shown
 * "<name> has nationality as <nationality>, birthdate as <birt date>, gender as <gender>,
 * player type as <player type>".
 * When the user clicks the Reset button, the program resets the name, nationality, and date of birth text fields.
 * When the user changes any text field (name, nationality, or date of birth) and click Enter
 * the program displays the message dialog that that text field is updated.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 5, 2021
 *
 **/

package treeechan.treepaech.lab10;

import treeechan.treepaech.lab8.PlayerFormV4;

import javax.swing.*;
import java.awt.event.*;

public class PlayerFormV5 extends PlayerFormV4 implements ActionListener {
    protected StringBuffer resultBuffer;

    public PlayerFormV5(String titleName) {
        super(titleName);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        male.setActionCommand("male");
        female.setActionCommand("female");
        name.setName("Name");
        nationality.setName("Nationality");
        birth.setName("Birthdate");
        comboBox.setName("Player type");
    }

    public void addListener(){
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        name.addActionListener(this);
        nationality.addActionListener(this);
        birth.addActionListener(this);
        male.addActionListener(this);
        female.addActionListener(this);
        comboBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        resultBuffer = new StringBuffer();

        if (src == submitButton){
            handleSubmitButton();
        } else if (src == resetButton){
            handleResetButton();
        } else if (src instanceof JTextField){
            JTextField tf = (JTextField) src;
            handleTextField(tf);
        } else if (src == comboBox){
            handleComboBox();
        }
    }

    public void handleComboBox() {
        String msg = comboBox.getName() + " is updated to " + comboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null, msg);
    }

    public void handleTextField(JTextField tf) {
       String msg = tf.getName() + " is updated to " + tf.getText().trim();
       JOptionPane.showMessageDialog(null, msg);
    }

    public void handleSubmitButton(){
        resultBuffer.append(name.getText().trim());
        resultBuffer.append(" has nationality as ");
        resultBuffer.append(nationality.getText().trim());
        resultBuffer.append(", birthdate as ");
        resultBuffer.append(birth.getText().trim());
        resultBuffer.append(", gender as ");
        resultBuffer.append(buttonGroup.getSelection().getActionCommand());
        resultBuffer.append(", player type as ");
        resultBuffer.append(comboBox.getSelectedItem());

        JOptionPane.showMessageDialog(null, resultBuffer.toString());
    }

    public void handleResetButton(){
        name.setText("");
        nationality.setText("");
        birth.setText("");
    }

    public static void createAndShowGUI() {
        PlayerFormV5 pfv5 = new PlayerFormV5("Player Form V5");
        pfv5.addComponents();
        pfv5.setFrameFeatures();
        pfv5.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
