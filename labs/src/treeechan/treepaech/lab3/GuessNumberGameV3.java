/**
 * This program GuessNumberGameV3 accepts minimum, maximum, number of tries.
 * ts output format is " Enter numbers out of range <The guess number must be in the range minNum and maxNum>
 *                       If the user's numbers are less than random numbers <Please type a Lower number!>
 *                       If the user's numbers are greater than random numbers <Please type a higher number!>
 *                       If the user's numbers are equal to random numbers <Congratulations!  That’s correct>
 *                       If want to play again? type 'y' to continue or 'q' to quit "
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 11, 2021
 *
 **/

package treeechan.treepaech.lab3;

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    static int maxTries = 3;
    public static void main(String[] args){
        configGame();
        genAnswer();
        playGame();
    }
    public static void genAnswer(){
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));  // Random 1 number ( min-max )
    }
    public static void configGame(){
        Scanner userNum = new Scanner(System.in);
        Scanner triesNum = new Scanner((System.in));
        int minUser, maxUser, getTriesNum ;
        int deposit ;
        System.out.print("Enter the min and the max values:"); // Get the lowest maximum
        minUser = userNum.nextInt();
        maxUser = userNum.nextInt();
        System.out.print("Enter the number of tries:");  // Get the number of times you can try
        getTriesNum = triesNum.nextInt();
        if (minUser>maxUser){
            deposit = maxUser;
            maxUser = minUser;    // Switch minimum maximum value
            minUser = deposit;
        }
        minNum = minUser;   // change static value
        maxNum = maxUser;
        maxTries = getTriesNum; // Convert to numbers
    }
    public static void playGame(){
        int numLoop = 1;
        int userNumInt;
        Scanner getNum = new Scanner(System.in);
        String userNum;
        while (numLoop <= maxTries){
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            userNum = getNum.nextLine();
            userNumInt = Integer.parseInt(userNum);
            if (userNumInt < minNum || userNumInt > maxNum){
                System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                // Enter numbers out of range
            } else {
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
                    playGames();
                }
            }
        }
        playGames();
    }
    public static void playGames(){
        Scanner txt = new Scanner(System.in);
        String confirmTXT;
        String confirm = "y";
        System.out.print("If want to play again? type 'y' to continue or 'q' to quit:");
        confirmTXT = txt.nextLine();
        if (confirmTXT.equals(confirm)){
            playGame(); // Play the game again
            genAnswer();
        } else {
            System.exit(0);  // Stop the program
        }
    }
}

