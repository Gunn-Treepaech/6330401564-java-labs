/**
 * This GuessNumberGameVer1 class
 * Is a class that returns a string, plays a number guessing game.
 * Set variable value minNum, maxNum, maxTries
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 30, 2021
 *
 **/

package treeechan.treepaech.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    private int minNum = 1;
    private int maxNum = 10;
    private int maxTries = 3;
    private static int numOfGames = 0;

    @Override // Change according to the calling object
    public String toString() {
        String txt;
        txt = "GuessNumberGame with min number as " + minNum + " max number as "
                + maxNum + " number of tries " + maxTries;
        return txt;
    }
    public int getMinNum(){
        return minNum;  // Send back minNum
    }
    public void setMinNum(int minNum){
        this.minNum = minNum;  // Change the minNum variable
    }
    public  int getMaxNum(){
        return maxNum;   // Send back maxNum
    }
    public void setMaxNum(int maxNum){
        this.maxNum = maxNum;  // Change the maxNum variable
    }
    public  int getMaxTries() {
        return maxTries; // Send back maxTries
    }
    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;  // Change the maxTries variable
    }
    public GuessNumberGameVer1(){
        numOfGames++;
    }
    public GuessNumberGameVer1(int minNum, int maxNum){
        this.minNum = minNum; // Change the minNum variable
        this.maxNum = maxNum; // Change the maxNum variable
        numOfGames++;
    }
    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries){
        this.minNum = minNum; // Change the minNum variable
        this.maxNum = maxNum; // Change the maxNum variable
        this.maxTries = maxTries; // Change the maxTries variable
        numOfGames++;
    }
    public static int getNumOfGames(){
        return numOfGames; // Send back numOfGames
    }
    public void playGame(){
        Scanner getNum = new Scanner(System.in);
        int numLoop = 1;
        int userNumInt;
        int correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        String userNum;
        while (numLoop <= maxTries){
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            userNum = getNum.nextLine();
            userNumInt = Integer.parseInt(userNum);
            if (userNumInt != correctNum){
                if (userNumInt > correctNum){
                    System.out.println("Please type a Lower number! Number of remaining tries:" + (maxTries - numLoop));
                    // If  user numbers are less than random numbers
                } else {
                    System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - numLoop));
                    // If  user numbers are greater than random numbers
                }
                numLoop++; // Increase the value of numLoop by 1
            } else {
                System.out.println("Congratulations!  That’s correct");
                // If  user numbers are equal to random numbers
                break;
            }
        }
    }
}
