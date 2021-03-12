package treeechan.treepaech.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV1 extends MySimpleWindow{
    protected JPanel panelLabelAndTextField,panelMainPlayerFrom,panelJRadioButton;
    protected int gridLayoutRow = 4;
    protected int gridLayoutCol = 2;
    public PlayerFormV1(String titleName){
        super(titleName);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        panelMainPlayerFrom = new JPanel(new BorderLayout());
        panelJRadioButton = new JPanel();
        panelLabelAndTextField = new JPanel();
        panelLabelAndTextField.setLayout(new GridLayout(gridLayoutRow,gridLayoutCol));
        JLabel labelA = new JLabel("Name:");
        panelLabelAndTextField.add(labelA);
        JTextField textFieldA = new JTextField(15);
        panelLabelAndTextField.add(textFieldA);
        JLabel labelB = new JLabel("Nationality:");
        panelLabelAndTextField.add(labelB);
        JTextField textFieldB = new JTextField(15);
        panelLabelAndTextField.add(textFieldB);
        JLabel labelC = new JLabel("Date of Birth (eg.,31-01-1990):");
        panelLabelAndTextField.add(labelC);
        JTextField textFieldC = new JTextField(15);
        panelLabelAndTextField.add(textFieldC);
        JLabel labelD = new JLabel("Gender:");
        panelLabelAndTextField.add(labelD);
        JRadioButton itemA = new JRadioButton("Male");
        JRadioButton itemB = new JRadioButton("Female");
        panelJRadioButton.add(itemA);
        panelJRadioButton.add(itemB);
        panelLabelAndTextField.add(panelJRadioButton);
        panelMainPlayerFrom.add(panelLabelAndTextField,BorderLayout.CENTER);
        panelMainPlayerFrom.add(panelMain,BorderLayout.SOUTH);
        setContentPane(panelMainPlayerFrom);

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
