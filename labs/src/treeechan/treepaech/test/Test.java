package treeechan.treepaech.test;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Test {
    public static void main(String[] args)  {
        WritFile();
        ReadFile();
    }
    public static void WritFile(){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            // myWriter.write("5");
            for (int i = 0; i <= 10;i++){
                myWriter.append(String.valueOf(i) + "\n");
            }
            myWriter.append(" app");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void ReadFile(){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) { // FileNotFoundException ถ้าไม่มีไฟล์
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
