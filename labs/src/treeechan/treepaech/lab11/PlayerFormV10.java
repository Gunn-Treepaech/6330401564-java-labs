/**
 * This PlayerFormV10 program
 * this program you will be able to save the player data in the player from to file
 * and read the data from file to fill the form.
 * When a file is selected from the open file menu item, the program reads the data in
 * the file to fill in the form. The file will have one line each for name, nationality, date of birth,
 * gender and player type. For games, there could be up to three lines, one line for each game.
 * When the user selected save the file menu item, the program should output the
 * data in the form to file. name, nationality, date of birth, gender and player type should be
 * output in one line for each field. For Games, you should output each game name in their own
 * line.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:April 17, 2021
 *
 **/

package treeechan.treepaech.lab11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerFormV10 extends PlayerFormV9 implements ActionListener {
    protected ArrayList<String> dataList;

    public PlayerFormV10(String titleName) {
        super(titleName);
    }

    public void setAnswer(){
        int[] IndexSelected = new int[3];
        int index = 0;
        try {
            for (int i =0; i < dataList.size(); i++){
                if (i < listTextField.size()){
                    // set the text into TextField
                    listTextField.get(i).setText(dataList.get(i));
                } else if (i == listTextField.size()){
                    // set selected gender
                    if (dataList.get(i).equalsIgnoreCase("male")){
                        male.setSelected(true);
                    }
                } else if (i == listTextField.size() + 1){
                    ComboBoxModel<String> model =  comboBox.getModel();
                    for (int j = 0; j < model.getSize(); j++){
                        // Check which position is selected.
                        if (comboBox.getItemAt(j).equalsIgnoreCase(dataList.get(i))){
                            comboBox.setSelectedIndex(j);
                        }
                    }
                } else {
                    for (int c = 0; c< gameList.getModel().getSize();c++){
                        // Check which position is selected.
                        if (gameList.getModel().getElementAt(c).equalsIgnoreCase(dataList.get(i))){
                            IndexSelected[index] = c;
                            index++;
                        }
                    }
                }
            }
            // Set selection
            int[] selected = new int[index];
            for (int n = 0; n < index; n++){
                selected[n] = IndexSelected[n];
            }
            gameList.setSelectedIndices(selected);
        } catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace(System.err);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource() == openItem){
            if (returnValOpen == JFileChooser.APPROVE_OPTION){
                readFile();
                setAnswer();
            }
        } else if (e.getSource() == saveItem){
            if (returnValSave == JFileChooser.APPROVE_OPTION){
                fileWriter();
            }
        }
    }

    public void fileWriter(){
        try {
            PrintWriter file = new PrintWriter(selectedSaveFile);
            // add the text of each textField into a file.
            for (JTextField textField : listTextField){
                file.println(textField.getText().trim());
            }
            // add selected gender into a file
            file.println(buttonGroup.getSelection().getActionCommand());
            // add selected player type into a file
            file.println(comboBox.getSelectedItem());
            ArrayList<String> userSelected = (ArrayList<String>) gameList.getSelectedValuesList();
            // add selected game into a file
            for (String s : userSelected) {
                file.println(s);
            }
            // close file
            file.close();
        } catch (IOException e){
            e.printStackTrace(System.err);
        }
    }

    public void readFile(){
        dataList = new ArrayList<String>();
        try {
            Scanner dataReader = new Scanner(selectedOpenFile);
            // Check if you still have the next line
            while (dataReader.hasNextLine()) {
                String data = dataReader.nextLine();
                // add data to ArrayList
                dataList.add(data);
            }
            dataReader.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace(System.err);
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV10 pfv10 = new PlayerFormV10("Player Form V10");
        pfv10.addComponents();
        pfv10.setFrameFeatures();
        pfv10.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
