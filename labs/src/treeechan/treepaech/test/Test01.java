package treeechan.treepaech.test;

import treeechan.treepaech.lab10.PlayerFormV8;
import treeechan.treepaech.lab11.PlayerFormV9;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test01 extends PlayerFormV8 implements ActionListener {

    public Test01(String titleName) {
        super(titleName);
    }

    @Override
    public void handleSubmitButton() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(birth.getText().trim(), formatter);
            System.out.println("88888889");

        } catch (DateTimeException e){
            JOptionPane.showMessageDialog(null, "55555");

        }
     //   super.handleSubmitButton();
    }

    public static void createAndShowGUI() {
        Test01 pfv9 = new Test01("Player Form V9");
        pfv9.addComponents();
        pfv9.setFrameFeatures();
        pfv9.addListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
