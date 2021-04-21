package treeechan.treepaech.examv2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class TestExamV2  {

    public static void createAndShowGUIExamA(){
        ExamA examA = new ExamA("ExamA by Treepaech 156-4");
        examA.addComponents();
        examA.setFrameFeatures();
    }

    public static void createAndShowGUIExamB(){
        ExamB examB = new ExamB("ExamB by Treepaech 156-4");
        examB.addComponents();
        examB.setFrameFeatures();
        examB.addListener();
    }

    public static void createAndShowGUIExamC(){
        ExamC examC = new ExamC("ExamC by Treepaech 156-4");
        examC.addComponents();
        examC.setFrameFeatures();
        examC.addListener();
    }

    public static void createAndShowGUIExamD(){
        ExamD examD = new ExamD("ExamD by Treepaech 156-4");
        examD.addComponents();
        examD.setFrameFeatures();
        examD.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               // createAndShowGUIExamA();
               // createAndShowGUIExamB();
                createAndShowGUIExamC();
               // createAndShowGUIExamD();
            }
        });

    }
}

class ExamA extends JFrame{
    protected JButton cancelButton, submitButton;
    protected JPanel mainPanel, panelStudentId, panelWeight, panelContent, panelButton;
    protected JPanel panelLabelTop;
    protected JTextField studentId, weight;
    protected JLabel labelStudentId, labelWeight, labelTop;

    public ExamA(String titleName) {
        super(titleName);
    }

    public void initComponents(){
        cancelButton = new JButton("Cancel");
        submitButton = new JButton("Submit");
        studentId = new JTextField(15);
        weight = new JTextField(15);
        labelTop = new JLabel("I, Treepaech, do not cheat in this exam");
        labelStudentId = new JLabel("StudentId");
        labelWeight = new JLabel("Weight");

        mainPanel = new JPanel(new BorderLayout());
        panelContent = new JPanel(new GridLayout(0,2));
        panelButton = new JPanel();
        panelStudentId = new JPanel();
        panelWeight = new JPanel();
        panelLabelTop = new JPanel();
    }


    public void addComponents() {
        initComponents();
        panelStudentId.add(studentId);
        panelWeight.add(weight);
        panelButton.add(cancelButton);
        panelButton.add(submitButton);
        panelContent.add(labelStudentId);
        panelContent.add(panelStudentId);
        panelContent.add(labelWeight);
        panelContent.add(panelWeight);
        panelLabelTop.add(labelTop);

        mainPanel.add(panelLabelTop, BorderLayout.NORTH);
        mainPanel.add(panelContent, BorderLayout.CENTER);
        mainPanel.add(panelButton, BorderLayout.SOUTH);
        setContentPane(mainPanel);
    }

    public void setFrameFeatures() {
        setLocationRelativeTo(null); // Puts it in the middle of the screen.
        setVisible(true); // Make it visible.
        pack();   // Making it visible.
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Make the press exit will close the program.
    }
}

class ExamB extends ExamA implements ActionListener {
    protected StringBuffer resultBuffer;

    public ExamB(String titleName) {
        super(titleName);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        studentId.setName("StudentId");
        weight.setName("Weight");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resultBuffer = new StringBuffer();
        if (e.getSource() == submitButton){
            handleSubmitButton();
        } else if (e.getSource() == cancelButton){
            handleCancelButton();
        } else if (e.getSource() instanceof JTextField){
            JTextField tf = (JTextField) e.getSource();
            handleTextField(tf);
        }

    }

    public void handleTextField(JTextField tf) {
        String msg = tf.getName() + " is updated to " + tf.getText().trim();
        JOptionPane.showMessageDialog(null, msg);
    }

    public void handleCancelButton() {
        studentId.setText("");
        weight.setText("");
    }

    public void handleSubmitButton() {
        resultBuffer.append(studentId.getText().trim());
        resultBuffer.append(" has weight as ");
        resultBuffer.append(weight.getText().trim());
        JOptionPane.showMessageDialog(null, resultBuffer.toString());
    }

    public void addListener(){
        cancelButton.addActionListener(this);
        submitButton.addActionListener(this);
        studentId.addActionListener(this);
        weight.addActionListener(this);
    }
}

class ExamC extends ExamB implements ActionListener {

    public ExamC(String titleName) {
        super(titleName);
    }

    @Override
    public void handleSubmitButton() {
        try {
            double test = Double.parseDouble(weight.getText().trim());
            if (test > 150.00){
                String msg = weight.getName() + " should not be greater tan 150.00";
                JOptionPane.showMessageDialog(null,msg);
            } else if ( test < 40){
                String msg = weight.getName() + " should not be less tan 40.0";
                JOptionPane.showMessageDialog(null,msg);
            } else {
                super.handleSubmitButton();
            }

        } catch (Exception e){
            String msg = weight.getName() + " should be double";
            JOptionPane.showMessageDialog(null, msg);
        }
    }

    @Override
    public void handleTextField(JTextField tf) {
        if (!weight.getText().trim().equals("")){
            try {
                double test = Double.parseDouble(weight.getText().trim());
                if (test > 150.00){
                    String msg = weight.getName() + " should not be greater tan 150.00";
                    JOptionPane.showMessageDialog(null,msg);
                } else if ( test < 40){
                    String msg = weight.getName() + " should not be less tan 40.0";
                    JOptionPane.showMessageDialog(null,msg);
                } else {
                    super.handleTextField(tf);
                }

            } catch (Exception e){
                String msg = weight.getName() + " should be double";
                JOptionPane.showMessageDialog(null, msg);
            }
        } else {
            super.handleTextField(tf);
        }
    }
}

class ExamD extends ExamC implements ActionListener {
    protected JMenuBar menuBar;
    protected JMenuItem save, open, quit;
    protected JMenu file;
    protected JFileChooser fc = new JFileChooser();
    protected File selectedOpenFile , selectedSaveFile;

    public ExamD(String titleName) {
        super(titleName);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        menuBar = new JMenuBar();
        file = new JMenu("File");
        save = new JMenuItem("Save");
        open = new JMenuItem("Open");
        quit = new JMenuItem("Quit");
    }

    @Override
    public void addComponents() {
        super.addComponents();
        file.add(save);
        file.add(open);
        file.add(quit);
        menuBar.add(file);
        this.setJMenuBar(menuBar);
    }

    @Override
    public void addListener() {
        super.addListener();
        quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        save.addActionListener(this);
        open.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource() == quit){
            System.exit(0);
        } else if (e.getSource() == save){
            int returnValSave  = fc.showSaveDialog(ExamD.this);
            if (returnValSave == JFileChooser.APPROVE_OPTION){
                selectedSaveFile = fc.getSelectedFile();
                String msg = "Save file " + selectedSaveFile;
                JOptionPane.showMessageDialog(null, msg);
                fileWriter();
            }
        } else if (e.getSource() == open){
            int returnValOpen = fc.showOpenDialog(ExamD.this);
            if (returnValOpen == JFileChooser.APPROVE_OPTION){
                selectedOpenFile = fc.getSelectedFile();
                readFile();
            }
        }
    }

    public void fileWriter() {
        try {
            PrintWriter file = new PrintWriter(selectedSaveFile);
            // add the text of each textField into a file.
            file.println(studentId.getText().trim());
            file.println(weight.getText().trim());
            file.close();
        } catch (IOException e){
            e.printStackTrace(System.err);
        }
    }

    public void readFile() {
        int line = 1;
        try {
            Scanner dataReader = new Scanner(selectedOpenFile);
            // Check if you still have the next line
            while (dataReader.hasNextLine()) {
                String data = dataReader.nextLine();
                if (line == 1){
                    studentId.setText(data);
                } else {
                    weight.setText(data);
                }
                line++;
            }
            dataReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
        }
    }
}
