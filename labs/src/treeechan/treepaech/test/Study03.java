package treeechan.treepaech.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Study03 extends JFrame implements ActionListener{
    protected JButton okButton, cancelButton;
    protected JLabel nameLabel;
    protected JTextField outPut, textFieldShow;
    protected JPanel panelMain, panelButton, panelName;
    protected String text;

    public Study03(String title) {
        super(title);
    }

    public void addListener(){
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    public void addComponents(){
        panelMain = new JPanel();
        panelName = new JPanel();
        panelButton = new JPanel();
        panelMain.setLayout(new BorderLayout());
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        nameLabel = new JLabel("Name:");
        outPut = new JTextField(15);
        textFieldShow = new JTextField(15);

        panelName.add(nameLabel);
        panelName.add(outPut);

        panelButton.add(okButton);
        panelButton.add(cancelButton);

        panelMain.add(panelName, BorderLayout.NORTH);
        panelMain.add(panelButton, BorderLayout.CENTER);
        panelMain.add(textFieldShow, BorderLayout.SOUTH);

        setContentPane(panelMain);
    }

    public void setFrameFeatures(){
        setLocationRelativeTo(null);
        setSize(500, 500);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void createAndShowGUI() {
        Study03 msw = new Study03("633040156-4");
        msw.addComponents();
        msw.addListener();
        msw.setFrameFeatures();
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       if (e.getSource() == okButton){
           text = outPut.getText().trim();
           outPut.setText("");
           textFieldShow.setText(text);
       }
       else if (e.getSource() == cancelButton){
           outPut.setText("");
       }

    }
}
