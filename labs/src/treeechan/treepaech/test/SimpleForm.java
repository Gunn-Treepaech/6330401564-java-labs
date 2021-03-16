package treeechan.treepaech.test;

import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    JPanel buttonsPanel, namePanel, addrPanel;
    public SimpleForm() {
        super("642-28-5829");
    }

    public void addComponents() {
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTxt = new JTextField("Kanda", 15);
        JPanel mainPanel = (JPanel) this.getContentPane();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JLabel addrLabel = new JLabel("Address:");
        JTextArea addrTxtArea = new JTextArea(4, 12);
        JScrollPane addrScrollPane = new JScrollPane(addrTxtArea);

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
        addrPanel.add(addrLabel);
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
    }

    public static void main(String[] args) {
        SimpleForm window = new SimpleForm();
        window.addComponents();
        window.setFrameFeatures();
    }
}
