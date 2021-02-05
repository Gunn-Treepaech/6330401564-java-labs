/**
 * This GuessNumberGameVer3 class
 *It is a class with the same properties as class GuessNumberGameVer2
 * Then the class itself has the ability to collect guessed numbers,
 * ask to play again, show all guessed numbers, show some.
 * show MaxNumberOfGuess, show MinNumberOfGuess, show Average
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 30, 2021
 *
 **/

package treeechan.treepaech.lab5;

import java.util.Scanner;

class GuessNumberGameVer3 extends GuessNumberGameVer2 {
    @Override
    public void playGame() {
        super.playGame();
    }
    public GuessNumberGameVer3(){
        super();     // Send variable to GuessNumberGameVer2
        guesses = new int[MAX_GUESSES];  // Set the size of the array
    }
    public GuessNumberGameVer3(int minNum, int maxNum){
        super(minNum, maxNum);    // Send variable to GuessNumberGameVer2
        guesses = new int[MAX_GUESSES];  // Set the size of the array
    }
    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries){
        super(minNum, maxNum, maxTries); // Send variable to GuessNumberGameVer2
        guesses = new int[MAX_GUESSES];  // Set the size of the array
    }
    public  void showSpecific(){
        Scanner numTries = new Scanner(System.in);
        String numTriesString;
        int numTriesInt;
        do {
            System.out.println("Enter which guess in in the rang (1-" + numGuesses + ")");
            numTriesString = numTries.nextLine();
            numTriesInt = Integer.parseInt(numTriesString);  // Convert to numbers
        } while (numTriesInt < 1 || numTriesInt > numGuesses );
        System.out.println("Guess number " + numTriesInt +" is " + guesses[numTriesInt - 1]);
        playGames();
    }
    public void guessAverage(){
        float sum = 0;
        float average;
        for (int j = 0; j < numGuesses; j++){
            sum += guesses[j]; // Sum the values of all answers.
        }
        average = sum / numGuesses;
        System.out.println("Average = " + average);  // Shows the average of all answers.
        playGames();
    }
    public  int[] sortNumbers(){
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
    public void guessMin(){
        int[] copyArray;
        copyArray = sortNumbers();
        System.out.println("Min = " + copyArray[numGuesses - 1]); // Show maximum guessed value
        playGames();

    }
    public void guessMax() {
        int[] copyArray;
        copyArray = sortNumbers();
        System.out.println("Max = " + copyArray[0]); // Show the lowest guessed value.playGames();
        playGames();
    }
    @Override
    public  void playGames(){
        Scanner txt = new Scanner(System.in);
        String confirmTXT;
        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
        System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");
        System.out.println("Type 'v' to see average or 'm' to see minimum or 'x‘ to see maximum of all. your guesses");
        confirmTXT = txt.nextLine();
        switch (confirmTXT){
            case "y" : playGame(); // Play again
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
}
