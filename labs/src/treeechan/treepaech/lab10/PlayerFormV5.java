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
        male.setActionCommand("male"); // set name is male
        female.setActionCommand("female"); // set name is female
        name.setName("Name");  // set name is Name
        nationality.setName("Nationality"); // set name is Nationality
        birth.setName("Birthdate");   // set name is Birthdate
        comboBox.setName("Player type");   // set name is Name Player type
    }

    public void addListener(){
        // add listener
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
        // Show when there is a change
        String msg = comboBox.getName() + " is updated to " + comboBox.getSelectedItem();
        JOptionPane.showMessageDialog(null, msg);
    }

    public void handleTextField(JTextField tf) {
        // Show when there is a change and press enter on the TextField.
       String msg = tf.getName() + " is updated to " + tf.getText().trim();
       JOptionPane.showMessageDialog(null, msg);
    }

    public void handleSubmitButton(){
        resultBuffer.append(name.getText().trim()); // Pull text out of name
        resultBuffer.append(" has nationality as ");
        resultBuffer.append(nationality.getText().trim()); // Pull text out of nationality
        resultBuffer.append(", birthdate as ");
        resultBuffer.append(birth.getText().trim()); // Pull text out of birth
        resultBuffer.append(", gender as ");
        resultBuffer.append(buttonGroup.getSelection().getActionCommand()); // Pull text out of RadioButton
        resultBuffer.append(", player type as ");
        resultBuffer.append(comboBox.getSelectedItem()); // Pull text out of selected item

        JOptionPane.showMessageDialog(null, resultBuffer.toString());
    }

    public void handleResetButton(){
        // Empties all text field spaces
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
