package treeechan.treepaech.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Study extends JFrame implements ActionListener {
    protected JButton okButton;
    protected JTextField outPut, textFieldShow;
    protected JPanel panelMain, panelContent;
    protected int num;
    protected String text;

    public Study(String title) {
        super(title);
    }

    public void addListener(){
        okButton.addActionListener(this);
    }

    public void addComponents(){
        panelMain = new JPanel();
        panelContent  = new JPanel(new BorderLayout());
        okButton = new JButton("OK");
        outPut = new JTextField(15);
        textFieldShow = new JTextField(15);

        panelContent.add(okButton, BorderLayout.WEST);
        panelContent.add(outPut, BorderLayout.CENTER);
        panelContent.add(textFieldShow, BorderLayout.SOUTH);

        panelMain.add(panelContent);
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
        Study msw = new Study("633040156-4");
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
        text = outPut.getText().trim();
        outPut.setText("");
        textFieldShow.setText(text);
    }
}
