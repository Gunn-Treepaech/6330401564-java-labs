/**
 * This  GuessNumberGame program receives a number of numbers.
 * ts output format is " If the user's numbers are less than random numbers <Please type a Lower number!>
 *                       If the user's numbers are greater than random numbers <Please type a higher number!>
 *                       If the user's numbers are equal to random numbers <Congratulations!  That’s correct> "
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 10, 2021
 *
 **/

package treeechan.treepaech.lab3;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args){
        Scanner userNumS = new Scanner(System.in);
        String userNum;
        int maxNum = 10;
        int minNum = 1;
        int numLoop = 0, triesNum = 2;
        int randomNum,userNumInt;
        randomNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1)); // Random 1 number ( 1-10 )
        while (numLoop <= triesNum){
            System.out.print("Please enter a guess (1—10):");
            userNum = userNumS.nextLine();   // receives a number
            userNumInt = Integer.parseInt(userNum); // Convert  into numbers
            if (userNumInt != randomNum){
                if (userNumInt > randomNum){
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
