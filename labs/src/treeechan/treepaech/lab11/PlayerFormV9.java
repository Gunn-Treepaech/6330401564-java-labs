/**
 * This PlayerFormV9 program
 * If the name is empty, when the submit button is pressed,
 * the error message be displayed. The error message should be “Name is empty”
 * Similarly, if the nationality and the date of birth are empty,
 * the error messages “Nationality is empty” and “Birthdate is empty” respectively.
 * the date should be input in the format dd-MM-yyyy where dd is date of the month,
 * MM is month of the year and yyyy is the year. If the date is input incorrectly
 * the program display an error message as
 * "Please enter date in the format dd-MM-yyyy such as 31-02-2021"
 * If no game is selected the error message be displayed as
 * "You have not selected any game"
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 15, 2021
 *
 **/

package treeechan.treepaech.lab11;

import treeechan.treepaech.lab10.PlayerFormV8;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PlayerFormV9 extends PlayerFormV8 implements ActionListener {
    protected ArrayList<JTextField> listTextField = new ArrayList<JTextField>();

    public PlayerFormV9(String titleName) {
        super(titleName);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        // Import JTextField into ArrayList.
        listTextField.add(name);
        listTextField.add(nationality);
        listTextField.add(birth);
    }

    @Override
    public void handleSubmitButton() {
        // Check to see if JTextField has any spaces.
        if (name.getText().isEmpty() || nationality.getText().isEmpty() || birth.getText().isEmpty()){
            for (JTextField testTextField : listTextField) {
                if (testTextField.getText().trim().isEmpty()) {
                    resultBuffer.append(testTextField.getName());
                    resultBuffer.append(" is empty.");
                    resultBuffer.append("\n");
                }
            }
            JOptionPane.showMessageDialog(null, resultBuffer.toString());
        } else if (gameList.getSelectedValuesList().isEmpty()){
            // If the player has not selected any game.
            String msg = "You have not selected any game";
            JOptionPane.showMessageDialog(null, msg);
        } else {
            try {
                // Convert to form "dd-MM-yyyy".
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate date = LocalDate.parse(birth.getText().trim(), formatter);
                super.handleSubmitButton();
            } catch (DateTimeException e) {
                // If unable to convert.
                String msg = "Please enter date in the format dd-MM-yyyy such as 31-02-2021";
                JOptionPane.showMessageDialog(null, msg);
            }

        }
    }

    public static void createAndShowGUI() {
        PlayerFormV9 pfv9 = new PlayerFormV9("Player Form V9");
        pfv9.addComponents();
        pfv9.setFrameFeatures();
        pfv9.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
