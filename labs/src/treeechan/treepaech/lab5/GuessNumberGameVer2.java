/**
 * This GuessNumberGameVer2 class
 *It is a class with the same properties as class GuessNumberGameVer1
 * Then the class itself has the ability to collect guessed numbers,
 * ask to play again, show all guessed numbers, show some.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 30, 2021
 *
 **/

package treeechan.treepaech.lab5;

import java.util.Scanner;

class GuessNumberGameVer2 extends GuessNumberGameVer1{
    private final int MAX_GUESSES = 20;
    private static int[] guesses;
    private static int numGuesses = 0;

    public GuessNumberGameVer2(){
        super();     // Send variable to GuessNumberGameVer1
        guesses = new int[MAX_GUESSES];  // Set the size of the array
    }
    public GuessNumberGameVer2(int minNum, int maxNum){
        super(minNum, maxNum);    // Send variable to GuessNumberGameVer1
        guesses = new int[MAX_GUESSES];  // Set the size of the array
    }
    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries){
        super(minNum, maxNum, maxTries); // Send variable to GuessNumberGameVer1
        guesses = new int[MAX_GUESSES];  // Set the size of the array
    }
    public void playGames(){
        Scanner txt = new Scanner(System.in);
        String confirmTXT;
        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
        System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");
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
        }
    }
    @Override // Change according to the calling object
    public void playGame(){
        int numLoop = 1;
        int userNumInt;
        int correctNum = super.getMinNum() + (int) (Math.random() * ((super.getMaxNum() - super.getMinNum()) + 1));
        Scanner getNum = new Scanner(System.in);
        String userNum;
        while (numLoop <= super.getMaxTries()){
            System.out.print("Please enter a guess (" + super.getMinNum() + "-" + super.getMaxNum() + "):");
            userNum = getNum.nextLine();
            userNumInt = Integer.parseInt(userNum);
            collectNumbers(userNumInt);
            if (userNumInt < super.getMinNum() || userNumInt > super.getMaxNum()){
                System.out.println("The guess number must be in the range " + super.getMinNum() + " and " + super.getMaxNum());
                // Enter numbers out of range
            } else {
                collectNumbers(userNumInt);
                if (userNumInt != correctNum){
                    if (userNumInt > correctNum){
                        System.out.println("Please type a Lower number! Number of remaining tries:" + (super.getMaxTries() - numLoop));
                        // If  user numbers are less than random numbers
                    } else {
                        System.out.println("Please type a higher number! Number of remaining tries:" + (super.getMaxTries() - numLoop));
                        // If  user numbers are greater than random numbers
                    }
                    numLoop++; // Increase the value of numLoop by 1
                    numGuesses++;
                } else {
                    System.out.println("Congratulations!  That’s correct"); // If  user numbers are equal to random numbers
                    numGuesses++;
                    playGames();
                }
            }
        }
        playGames();
    }
    public void showGuesses(){
        for (int i = 0; i < numGuesses; i++){
            System.out.print(guesses[i] + " ");   // Displays the numbers in the respective array.
        }
        System.out.println(); // Show spaces
        playGames();
    }
    public void showSpecific(){
        Scanner numTries = new Scanner(System.in);
        String numTriesString;
        int numTriesInt;
        do {
            System.out.println("Enter which guess in in the rang (1-" + numGuesses + ")");
            numTriesString = numTries.nextLine();
            numTriesInt = Integer.parseInt(numTriesString);  // Convert to numbers
        } while (numTriesInt < 1 || numTriesInt > numGuesses );
        System.out.println("Guess number " + numTriesInt +" is " + guesses[numTriesInt-1]);
        playGames();
    }
    public static void collectNumbers(int number){
        guesses[numGuesses] = number; // Collect numbers into Array guesses
    }

}
