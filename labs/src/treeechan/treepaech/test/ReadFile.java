package treeechan.treepaech.test;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    static ArrayList<String> sometimeDo = new ArrayList<String>();
    static ArrayList<String> timeDoSometime = new ArrayList<String>();
    static ArrayList<String> dateDoSometime = new ArrayList<String>();
    protected static int indexSometime;
    public static void main(String[] args) {
        fileToArray();
        int checkOverlap = check();
        if (checkOverlap == 0){
            JOptionPane.showMessageDialog(null,"There are things that must be done today.");
        }
    }
    public static void fileToArray(){
        try {
            File dataSomeTime = new File("D:\\\\sometimedata.txt");
            Scanner myReader = new Scanner(dataSomeTime);
            while (myReader.hasNextLine()) {
                String[] a;
                String data = myReader.nextLine();
                a = data.split("-");
                sometimeDo.add(a[0]);
                timeDoSometime.add(a[1]);
                dateDoSometime.add(a[2]);
            }
            myReader.close();
        } catch (FileNotFoundException e) { // FileNotFoundException ถ้าไม่มีไฟล์
            System.out.println("An error occurred.");
        }
    }
    public static int check(){
        String check = "d";
        String checkI = "d";
        int checkTimeAndDate = 5;
        for (int i = 0; i < timeDoSometime.size(); i++){
            if (check.equalsIgnoreCase(timeDoSometime.get(i))){
                if (checkI.equalsIgnoreCase(dateDoSometime.get(i))){
                    checkTimeAndDate = 0;
                    indexSometime = i;
                } else {
                    checkTimeAndDate = 1;
                    indexSometime = i;
                }
            }
        }
        return checkTimeAndDate;
    }
}
