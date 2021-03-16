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
    protected JPanel panelTextFieldA, panelTextFieldB, panelTextFieldC;
    protected JPanel panelLabelA, panelLabelB, panelLabelC, panelLabelD;
    public PlayerFormV1(String titleName){
        super(titleName);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        panelTextFieldA = new JPanel();
        panelTextFieldB = new JPanel();
        panelTextFieldC = new JPanel();
        panelLabelA = new JPanel();
        panelLabelB = new JPanel();
        panelLabelC = new JPanel();
        panelLabelD = new JPanel();
        buttonGroup = new ButtonGroup();
        panelPlayerFromV1 = new JPanel(new BorderLayout());
        panelRadioButton = new JPanel();
        panelLabelAndTextField = new JPanel(new GridLayout(0, 2));

        JLabel labelA = new JLabel("Name:");
        JLabel labelB = new JLabel("Nationality:");
        JLabel labelC = new JLabel("Date of Birth (eg.,31-01-1990):");
        JLabel labelD = new JLabel("Gender:");
        JTextField textFieldA = new JTextField(15);
        JTextField textFieldB = new JTextField(15);
        JTextField textFieldC = new JTextField(15);
        JRadioButton itemA = new JRadioButton("Male");
        JRadioButton itemB = new JRadioButton("Female");

        panelRadioButton.add(itemA);
        panelRadioButton.add(itemB);
        buttonGroup.add(itemA);
        buttonGroup.add(itemB);
        itemB.setSelected(true);

        panelLabelA.add(labelA);
        panelLabelAndTextField.add(labelA);
        panelTextFieldA.add(textFieldA);
        panelLabelAndTextField.add(panelTextFieldA);
       // panelLabelAndTextField.add(textFieldA);
        panelLabelB.add(labelB);
        panelLabelAndTextField.add(labelB);
        panelTextFieldB.add(textFieldB);
        panelLabelAndTextField.add(panelTextFieldB);
        //panelLabelAndTextField.add(textFieldB);
        panelLabelC.add(labelC);
        panelLabelAndTextField.add(labelC);
        panelTextFieldC.add(textFieldC);
        panelLabelAndTextField.add(panelTextFieldC);
       // panelLabelAndTextField.add(textFieldC);
        panelLabelD.add(labelD);
        panelLabelAndTextField.add(labelD);

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
