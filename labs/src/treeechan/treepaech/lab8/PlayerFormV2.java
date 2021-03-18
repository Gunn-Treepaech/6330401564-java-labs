/**
 * This PlayerFormV2 program
 * This program will look similar to the program PlayerFormV1
 * but it will be added, you will be able to select Player Type and below will have a note.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 14, 2021
 *
 **/

package treeechan.treepaech.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV2 extends PlayerFormV1{
    protected JPanel panelPlayerFormV2, panelNoteAndButton, panelCombobox;
    protected JPanel panelNote;
    protected JComboBox<String> comboBox;

    public PlayerFormV2(String titleName){
        super(titleName);
    }

    @Override
    public void addComponents() {
        panelCombobox = new JPanel();
        panelNote = new JPanel();
        panelNoteAndButton = new JPanel(new BorderLayout());
        super.addComponents();
        panelPlayerFormV2 = new JPanel(new BorderLayout());
        String[] selectedItem = {"Beginner", "Amateur", "Professional"};
        JLabel labelType = new JLabel("Player Type:");
        panelLabelAndTextField.add(labelType);
        comboBox = new JComboBox<String>(selectedItem);
     //   comboBox.setPreferredSize(new Dimension(170, 20));
        comboBox.setSelectedItem(selectedItem[1]);
      //  panelCombobox.add(comboBox);
        panelLabelAndTextField.add(comboBox);

        JLabel labelNote = new JLabel("Note:");
        panelNoteAndButton.add(labelNote,BorderLayout.NORTH);
        JTextArea noteText = new JTextArea(3,35);
        JScrollPane scroll = new JScrollPane(noteText);
        noteText.setLineWrap(true);
        noteText.setWrapStyleWord(true);
        noteText.setText("A game is a structured form of play, usually undertaken for \n");
        noteText.append("entertainment or fun, and sometimes used as an educational tool.\n");
        panelNote.add(scroll);
        panelPlayerFormV2.add(panelLabelAndTextField,BorderLayout.NORTH);
        panelNoteAndButton.add(panelNote,BorderLayout.CENTER);
        panelNoteAndButton.add(panelMySimpleWindowMain,BorderLayout.SOUTH);
        panelPlayerFormV2.add(panelNoteAndButton,BorderLayout.SOUTH);
        setContentPane(panelPlayerFormV2);
    }

    public static void createAndShowGUI() {
        PlayerFormV2 msw = new PlayerFormV2("Player Form V2");
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
