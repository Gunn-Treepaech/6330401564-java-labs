/**
 * This program GuessNumberGameV5 accepts minimum, maximum, number of tries.
 * output format is " Enter numbers out of range <The guess number must be in the range minNum and maxNum>
 *                    If the user's numbers are less than random numbers <Please type a Lower number!>
 *                    If the user's numbers are greater than random numbers <Please type a higher number!>
 *                    If the user's numbers are equal to random numbers <Congratulations!  That’s correct>
 *                    If want to play again? type 'y' to continue or 'q' to quit
 *                    Type 'a' to see all your guesses or 'g' to see a guess on a specific play
 *                    Type 'v' to see average or 'm' to see minimum or 'x‘ to see maximum of all. your guesses"
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 19, 2021
 *
 **/

package treeechan.treepaech.lab4;

import java.util.Scanner;

public class GuessNumberGameV5 {
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
                    numGuesses++;
                } else {
                    System.out.println("Congratulations!  That’s correct"); // If  user numbers are equal to random numbers
                    numGuesses++;
                    playGame();
                }
            }
        }
        playGame();
    }
    public static void playGame(){
        Scanner txt = new Scanner(System.in);
        String confirmTXT;
        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
        System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");
        System.out.println("Type 'v' to see average or 'm' to see minimum or 'x‘ to see maximum of all. your guesses");
        confirmTXT = txt.nextLine();
        switch (confirmTXT){
            case "y" : playGames(); // Play again
                       genAnswer();
                break;
            case "q" : System.exit(0);  // Exit the program
                break;
            case "a" : showGuesses();  // Show all answers
                break;
            case "g" : showSpecific(); // Show answers based on the position of the selected answer.
                break;
            case "m" : guessMin();   // Show the lowest guessed value.
                break;
            case "x" : guessMax(); // Show maximum guessed value
                break;
            case "v" : guessAverage();  // Shows the average of all answers.
                break;
        }
    }
    public static void collectNumbers(int number){
        guesses[numGuesses] = number; // Collect numbers into Array guesses
    }
    public static void showGuesses(){
        for (int i = 0; i < numGuesses; i++ ){
            System.out.print(guesses[i] + " ");   // Displays the numbers in the respective array.
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
        System.out.println("Guess number " + numTriesInt +" is " + guesses[numTriesInt - 1]);
        playGame();
    }
    public static void guessAverage(){
        float sum = 0;
        float average;
        for (int j = 0; j < numGuesses; j++){
            sum += guesses[j]; // Sum the values of all answers.
        }
        average = sum / numGuesses;
        System.out.println("Average = " + average);  // Shows the average of all answers.
        playGame();
    }
    public static int[] sortNumbers(){
        int depositMin;
        int[] copyArray;
        copyArray = guesses;
        for (int i = 0; i < numGuesses; i++){
            if (copyArray[i] < copyArray[i + 1]){
                depositMin = copyArray[i];
                copyArray[i] = copyArray[i + 1];    // Sort the numbers in the array.
                copyArray[i + 1] = depositMin;
            }
        }
        return copyArray;
    }
    public static void guessMin(){
        int[] copyArray;
        copyArray = sortNumbers();
        System.out.println("Min = " + copyArray[numGuesses - 1]); // Show maximum guessed value
        playGame();

    }
    public static void guessMax() {
        int[] copyArray;
        copyArray = sortNumbers();
        System.out.println("Max = " + copyArray[0]); // Show the lowest guessed value.
        playGame();
    }
}
