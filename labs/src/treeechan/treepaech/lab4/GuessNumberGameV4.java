/**
 * This program GuessNumberGameV3 accepts minimum, maximum, number of tries.
 * This program will randomize 1 number and have the player guess that number.
 * Where players set their own range and maximum number of guesses
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 18, 2021
 *
 **/

package treeechan.treepaech.lab4;

import java.util.Scanner;

public class GuessNumberGameV4 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    static int maxTries = 3;
    static int numGuesses = 0;
    static int[] guesses;
    public static void main(String[] args){
        configGame();
        genAnswer();
        playGames();
    }
    public static void genAnswer(){
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));  // Random 1 number ( min-max )
    }
    public static void configGame(){
        Scanner userNum = new Scanner(System.in);
        Scanner triesNum = new Scanner((System.in));
        String  getTriesNum;
        guesses = new int[1000];
        int minUser,maxUser;
        int deposit ;
        System.out.print("Enter the min and the max values:"); // Get the lowest maximum
        minUser = userNum.nextInt();
        maxUser = userNum.nextInt();
        System.out.print("Enter the number of tries:");  // Get the number of times you can try
        getTriesNum = triesNum.nextLine();
        if (minUser>maxUser){
            deposit = maxUser;
            maxUser = minUser;    // Switch minimum maximum value
            minUser = deposit;
        }
        minNum = minUser;   // change static value
        maxNum = maxUser;
        maxTries = Integer.parseInt(getTriesNum);  // Convert to numbers
    }
    public static void playGames(){
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
                collectNumbers(userNumInt);
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
                    playGame();
                }
            }
            numGuesses++;
        }
        playGame();
    }
    public static void playGame(){
        Scanner txt = new Scanner(System.in);
        String confirmTXT;
        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
        System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");
        confirmTXT = txt.nextLine();
        switch (confirmTXT){
            case "y" : playGames(); // Play again
                break;
            case "q" : System.exit(0);  // Exit the program
                break;
            case "a" : showGuesses();  // Show all answers
                break;
            case "g" : showSpecific(); // Show answers based on the position of the selected answer.
                break;
        }
    }
    public static void collectNumbers(int number){
        guesses[numGuesses] = number; // Collect numbers into Array guesses
    }
    public static void showGuesses(){
        for (int i = 0; i < numGuesses; i++ ){
            System.out.print(guesses[i]+" ");   // Displays the numbers in the respective array.
        }
        System.out.println(); // Show spaces
        playGame();
    }
    public static void showSpecific(){
        Scanner numTries = new Scanner(System.in);
        String numTriesString;
        int numTriesInt;
        do {
            System.out.println("Enter which guess in in the rang (1-" + numGuesses + ")");
            numTriesString = numTries.nextLine();
            numTriesInt = Integer.parseInt(numTriesString);  // Convert to numbers
        } while (numTriesInt < 1 || numTriesInt > numGuesses );
        System.out.println("Guess number " + numTriesInt +" is " + guesses[numTriesInt-1]);
        playGame();
    }
}
