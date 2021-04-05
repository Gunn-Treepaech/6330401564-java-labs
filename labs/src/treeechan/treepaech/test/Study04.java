package treeechan.treepaech.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Study04 extends  Study041 implements ItemListener {
    JLabel result;
    JTextArea resultLans;
    JScrollPane resultLansPane;
    final static String newline = "\n";
    public Study04(String title) {
        super(title);
    }

    public static void main(String[] args) {
        Study04 window = new Study04("JCheckboxAction Demo");
        window.addCheckBoxes();
        window.addResultComps();
        window.addListeners();
        window.setFrameFeatures();
    }

    public void addListeners() {
        php.addItemListener(this);
        javascript.addItemListener(this);
        cPlusPlus.addItemListener(this);
        java.addItemListener(this);
    }

    public void addResultComps() {
        setLayout(new BorderLayout());
        JPanel qPanel = new JPanel(new GridLayout(2,1));
        qPanel.add(question);
        qPanel.add(boxes);
        JPanel aPanel = new JPanel(new BorderLayout());
        result = new JLabel("Result:");
        resultLans = new JTextArea();
        resultLans.setFont(new Font("SansSerif", Font.BOLD, 20));
        resultLans.setLineWrap(true);
        resultLansPane = new JScrollPane(resultLans);
        resultLansPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        resultLansPane.setPreferredSize(new Dimension(450,200));
        aPanel.add(result, BorderLayout.NORTH);
        aPanel.add(resultLansPane, BorderLayout.CENTER);
        add(qPanel, BorderLayout.NORTH);
        add(aPanel, BorderLayout.CENTER);
    }

    public void itemStateChanged(ItemEvent e) {
        // get the checkbox that the user clicks
        // type casting to JCheckBox so that
        // we can use the methods of JCheckBox
        // such as getText to get the checkbox name
        JCheckBox source = (JCheckBox) e.getItemSelectable();
        if (e.getStateChange() == ItemEvent.SELECTED) {
            resultLans.append("You know well about " +
                    source.getText() + newline);
        } else {
            resultLans.append("You don't know well about " +
                    source.getText() + newline);
        }
    }
}
