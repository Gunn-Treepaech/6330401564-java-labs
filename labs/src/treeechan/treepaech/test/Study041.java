package treeechan.treepaech.test;

import javax.swing.*;
import java.awt.*;

public class Study041 extends JFrame{
    JLabel question;
    JPanel boxes;
    JCheckBox cPlusPlus, php, javascript, java;
    public  Study041(String title) {
        super(title);
    }
    public static void main(String[] args) {
        Study041 window = new  Study041("JCheckbox Demo");
        window.addCheckBoxes();
        window.setFrameFeatures();
    }
    public void addCheckBoxes() {
        setLayout(new GridLayout(2,1));
        question = new JLabel("Which languages do you know well?");
        boxes = new JPanel(new FlowLayout());
        cPlusPlus = new JCheckBox("C++");
        php = new JCheckBox("PHP");
        java = new JCheckBox("Java");
        javascript = new JCheckBox("Javascript");
        boxes.add(cPlusPlus);
        boxes.add(php);
        boxes.add(java);
        boxes.add(javascript);
        add(question);
        add(boxes);
    }
    public void setFrameFeatures() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocation(100,100);
        setVisible(true);
    }
}
