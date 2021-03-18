package treeechan.treepaech.test;

import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    protected JPanel buttonsPanel, namePanel, addrPanel, mainPanel;
    protected JLabel nameLabel, addrLabel;
    protected JTextField nameTxt;
    protected JButton okButton, cancelButton;
    protected JTextArea addrTxtArea;
    protected JScrollPane addrScrollPane;

    public SimpleForm(String title) {
        super(title);
    }

    public void addComponents() {
        nameLabel = new JLabel("Name:");
        nameTxt = new JTextField("Kanda", 15);
        mainPanel = (JPanel) this.getContentPane();
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        addrLabel = new JLabel("Address:");
        addrTxtArea = new JTextArea(4, 12);
        addrScrollPane = new JScrollPane(addrTxtArea);

        mainPanel.setLayout(new BorderLayout());

        namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTxt);

        addrPanel = new JPanel();
        addrTxtArea.setLineWrap(true);
        addrTxtArea.setWrapStyleWord(true);
        addrTxtArea.setText("Lorem Ipsum is simply dummy text of the printing and");
        addrTxtArea.append("typesetting industry. Lorem Ipsum has been the industry\'s");
        addrTxtArea.append("standard dummy text ever since the 1500s, when an unknown");
        addrTxtArea.append("printer took a galley of type and scrambled it to make a type");
        addrTxtArea.append("specimen book. It has survived not only five centuries");
   //     addrPanel.add(addrLabel);
        addrPanel.add(addrScrollPane);

        buttonsPanel = new JPanel();
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);


        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(addrPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
    }

    public void setFrameFeatures() {
        //  window.add(buttonsPanel);
        //  window.setContentPane(buttonsPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void createAndShowGUI() {
        SimpleForm window = new SimpleForm("SimpleForm");
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
