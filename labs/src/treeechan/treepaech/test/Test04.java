package treeechan.treepaech.test;

import treeechan.treepaech.lab8.MySimpleWindow;

import javax.swing.*;
import java.awt.*;

public class Test04 extends MySimpleWindow {
    protected JPanel panelFromV1, panelJRadioButton, panelContent;
    protected JPanel panelName, panelNationality, panelBirth, panelGander;
    protected JLabel labelName, labelNationality, labelBirth, labelGender;
    protected JTextField name, nationality, birth;
    protected JRadioButton male, female;
    protected ButtonGroup buttonGroup;
    protected GridBagConstraints gbc = new GridBagConstraints();

    public Test04(String titleName) {
        super(titleName);
    }
    public void initComponents(){
        panelFromV1 = new JPanel(new BorderLayout());
        panelJRadioButton = new JPanel();
        panelContent = new JPanel(new GridLayout(0,1));
        panelName = new JPanel();
        panelNationality = new JPanel();
        panelBirth = new JPanel();
        panelGander = new JPanel();

        labelName = new JLabel("Name:                                            ");
        labelName.setHorizontalAlignment(SwingConstants.LEFT);
        labelNationality = new JLabel("Nationality:                                   ");
        labelNationality.setHorizontalAlignment(SwingConstants.LEFT);
        labelBirth = new JLabel("Date of Birth (eg.,31-01-1990):");
        labelBirth.setHorizontalAlignment(SwingConstants.LEFT);
        labelGender = new JLabel("Gander:                                                      ");
        name = new JTextField(15);
        nationality = new JTextField(15);
        birth = new JTextField(15);
        male = new JRadioButton("Male");
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

        panelName.add(labelName);
        panelName.add(name);
        panelContent.add(panelName);

        panelNationality.add(labelNationality);
        panelNationality.add(nationality);
        panelContent.add(panelNationality);

        panelBirth.add(labelBirth);
        panelBirth.add(birth);
        panelContent.add(panelBirth);

        panelGander.add(labelGender);
        panelGander.add(panelJRadioButton);
        panelContent.add(panelGander);

        panelFromV1.add(panelContent, BorderLayout.CENTER);
        panelFromV1.add(panelButton, BorderLayout.SOUTH);
        setContentPane(panelFromV1);
    }

    public static void createAndShowGUI() {
        Test04 window = new Test04("Test04");
        window.addComponents();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
