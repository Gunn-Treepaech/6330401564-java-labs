package treeechan.treepaech.lab3;

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    static int maxTries = 3;
    public static void main(String[] args){

    }
    public static void genAnswer(){
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }
    public static void configGame(){
        Scanner userMax = new Scanner(System.in);
        Scanner usreMin = new Scanner(System.in);
        String getMin, getMax;

    }
}
