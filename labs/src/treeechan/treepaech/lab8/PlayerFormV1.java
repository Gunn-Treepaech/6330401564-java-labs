/**
 * This PlayerFormV1 program
 * The program will pop up a window with two buttons: Reset, Submit
 * and there will be fields to fill in the following
 * information: Name, Nationality, Date of Birth, then there will be a box to select the gender.
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

public class PlayerFormV1 extends MySimpleWindow{
    protected JPanel panelMainFromV1, panelJRadioButton, panelContent;
    protected JPanel panelName, panelNationality, panelBirth;
    protected JPanel panelFrom, panelGender, panelSubContent;
    protected JLabel labelName, labelNationality, labelBirth, labelGender;
    protected JTextField name, nationality, birth;
    protected JRadioButton male, female;
    protected ButtonGroup buttonGroup;

    public PlayerFormV1(String titleName){
        super(titleName);
    }

    public void initComponents(){
        panelMainFromV1 = new JPanel(new BorderLayout());
        panelFrom = new JPanel(new GridLayout(0, 2));
        panelGender = new JPanel(new GridLayout(0, 2));
        panelContent = new JPanel(new BorderLayout());
        panelSubContent = new JPanel(new GridLayout(0,1));
        panelName = new JPanel();
        panelNationality = new JPanel();
        panelBirth = new JPanel();
        panelJRadioButton = new JPanel();

        labelName = new JLabel("Name:"); //Create a label that contains the word Name.
        labelName.setBounds(0,0,15,10);
        labelNationality = new JLabel("Nationality:");
        labelNationality.setBounds(0,1,15,10);
        labelBirth = new JLabel("Date of Birth (eg.,31-01-1990):");
        labelGender = new JLabel("Gander:");
        name = new JTextField(15);
        nationality = new JTextField(15);
        birth = new JTextField(15);
        male = new JRadioButton("Male");  //Create a radiobutton name "Male"
        female = new JRadioButton("Female");
        buttonGroup = new ButtonGroup();

    }

    @Override
    public void addComponents() {
        super.addComponents();
        initComponents();
        panelJRadioButton.add(male);
        panelJRadioButton.add(female);
        buttonGroup.add(male);
        buttonGroup.add(female);
        female.setSelected(true);  // Makes it select female at the beginning.

        panelFrom.add(labelName);
        panelFrom.add(name);
        panelFrom.add(labelNationality);
        panelFrom.add(nationality);
        panelFrom.add(labelBirth);
        panelFrom.add(birth);

        panelGender.add(labelGender);
        panelGender.add(panelJRadioButton);

        panelSubContent.add(panelGender);

        panelContent.add(panelFrom, BorderLayout.CENTER);
        panelContent.add(panelSubContent, BorderLayout.SOUTH);

        panelMainFromV1.add(panelContent, BorderLayout.NORTH);
        panelMainFromV1.add(panelButton, BorderLayout.SOUTH);
        setContentPane(panelMainFromV1);
    }

    public static void createAndShowGUI() {
        PlayerFormV1 msw = new PlayerFormV1("Player Form V1");
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
