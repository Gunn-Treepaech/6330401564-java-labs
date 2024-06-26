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
    protected  JPanel panelPlayerFormV2, panelNoteAndButton;
    protected  JPanel panelNote, panelCombobox;
    protected  JComboBox<String> comboBox;
    protected  String[] selectedItem = {"Beginner", "Amateur", "Professional"};
    protected  JTextArea noteText;
    protected  JScrollPane scroll;
    protected JLabel labelType, labelNote;

    public PlayerFormV2(String titleName){
        super(titleName);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        panelPlayerFormV2 = new JPanel(new BorderLayout());
        panelNoteAndButton = new JPanel(new BorderLayout());
        panelNote = new JPanel();
        panelCombobox = new JPanel(new GridLayout(0,2));
        comboBox = new JComboBox<String>(selectedItem);
        comboBox.setSelectedItem(selectedItem[1]);

    }

    @Override
    public void addComponents() {
        super.addComponents();
        labelType = new JLabel("Player Type:");
        panelCombobox.add(labelType);
        panelCombobox.add(comboBox);
        panelSubContent.add(panelCombobox);
        labelNote = new JLabel("Note:");
        panelNoteAndButton.add(labelNote,BorderLayout.NORTH);
        noteText = new JTextArea(3,35);
        scroll = new JScrollPane(noteText); //Create a scroll pane
        noteText.setLineWrap(true);
        noteText.setWrapStyleWord(true);
        noteText.setText("A game is a structured form of play, usually undertaken for \n");
        noteText.append("entertainment or fun, and sometimes used as an educational tool.\n");
        panelNote.add(scroll);   // Add scroll pane to text area

        panelNoteAndButton.add(scroll, BorderLayout.CENTER);
        panelNoteAndButton.add(panelButton, BorderLayout.SOUTH);
        panelPlayerFormV2.add(panelContent, BorderLayout.NORTH);
        panelPlayerFormV2.add(panelNoteAndButton, BorderLayout.SOUTH);
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
