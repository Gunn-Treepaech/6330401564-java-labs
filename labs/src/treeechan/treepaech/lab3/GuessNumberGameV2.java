package treeechan.treepaech.lab3;

import java.util.Scanner;

public class GuessNumberGameV2 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    public static void main(String[] args){
        genAnswer();
        playGame();

    }
    public static void genAnswer(){
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }
    public static void playGame(){
        int numLoop = 0,triesNum = 2;
        int userNumber;
        int userNumInt;
        Scanner getNum = new Scanner(System.in);
        String userNum;
        System.out.print("Please enter a guess (1—10):");
        userNum = getNum.nextLine();
        userNumInt = Integer.parseInt(userNum);
        while (numLoop <= triesNum){
            if (userNumInt != correctNum){
                if (userNumInt < correctNum){
                    System.out.println("Please type a Lower number! Number of remaining tries:" + (triesNum - numLoop));
                    // If the user's numbers are less than random numbers
                }
                else {
                    System.out.println("Please type a higher number! Number of remaining tries:" + (triesNum - numLoop));
                    // If the user's numbers are greater than random numbers
                }
                numLoop++; // Increase the value of numLoop by 1
            }
            else {
                System.out.println("Congratulations!  That’s correct");
                // If the user's numbers are equal to random numbers
                break;
            }
        }
    }
}