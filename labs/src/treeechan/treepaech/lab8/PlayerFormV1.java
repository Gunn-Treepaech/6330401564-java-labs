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
    protected JPanel panelLabelAndTextField,panelPlayerFromV1,panelRadioButton;
    protected ButtonGroup buttonGroup;
    protected JPanel panelName, panelNationality, panelBirth;
    protected JPanel panelLabelName, panelLabelNationality, panelLabelBirth, panelLabelGender;
    protected JLabel labelName, labelNationality, labelBirth, labelGender;
    protected JTextField name, nationality, birth;
    protected JRadioButton radioButtonMale, radioButtonFemale;

    public PlayerFormV1(String titleName){
        super(titleName);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        panelName = new JPanel();
        panelNationality = new JPanel();
        panelBirth = new JPanel();
        panelLabelName = new JPanel();
        panelLabelNationality = new JPanel();
        panelLabelBirth = new JPanel();
        panelLabelGender = new JPanel();
        buttonGroup = new ButtonGroup();
        panelPlayerFromV1 = new JPanel(new BorderLayout());
        panelRadioButton = new JPanel();
        panelLabelAndTextField = new JPanel(new GridLayout(0, 2));
        labelName = new JLabel("Name:");
        labelNationality = new JLabel("Nationality:");
        labelBirth = new JLabel("Date of Birth (eg.,31-01-1990):");
        labelGender = new JLabel("Gender:");
        name = new JTextField(15);
        nationality = new JTextField(15);
        birth = new JTextField(15);
        radioButtonMale = new JRadioButton("Male");
        radioButtonFemale = new JRadioButton("Female");

        panelRadioButton.add(radioButtonMale);
        panelRadioButton.add(radioButtonFemale);
        buttonGroup.add(radioButtonMale);
        buttonGroup.add(radioButtonFemale);
        radioButtonFemale.setSelected(true);

       // panelLabelName.add(labelName);
        panelLabelAndTextField.add(labelName);
        panelName.add(name);
        panelLabelAndTextField.add(panelName);
       // panelLabelNationality.add(labelNationality);
        panelLabelAndTextField.add(labelNationality);
        panelNationality.add(nationality);
        panelLabelAndTextField.add(panelNationality);
      //  panelLabelBirth.add(labelBirth);
        panelLabelAndTextField.add(labelBirth);
        panelBirth.add(birth);
        panelLabelAndTextField.add(panelBirth);
      //  panelLabelGender.add(labelGender);
        panelLabelAndTextField.add(labelGender);

        panelLabelAndTextField.add(panelRadioButton);
        panelLabelAndTextField.add(panelRadioButton);
        panelPlayerFromV1.add(panelLabelAndTextField,BorderLayout.CENTER);
        panelPlayerFromV1.add(panelMySimpleWindowMain,BorderLayout.SOUTH);
        setContentPane(panelPlayerFromV1);
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
