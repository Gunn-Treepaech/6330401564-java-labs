/**
 * This program DiceGameMethod
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 18, 2021
 *
 **/

package treeechan.treepaech.midterm;

import java.util.Scanner;

public class DiceGameMethod {
    static int MAX_NUMBER_RANDOM = 3;
    static String answer;
    static int sumNumberOfRandom = 0;
    static int[] randomNum = new int[MAX_NUMBER_RANDOM];
    public static void main(String[] args) {
        getAnswer();
        playDiceGame();
    }
    public static void getAnswer(){
        int minNum = 1, maxNum = 6;
        for (int i = 0; i < MAX_NUMBER_RANDOM; i++){
            randomNum[i] = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
            sumNumberOfRandom += randomNum[i];
        }
        if (sumNumberOfRandom <= 10){
            answer = "l";
        } else {
            answer = "h";
        }
    }
    public static void playDiceGame(){
        Scanner userGuess = new Scanner(System.in);
        String userGuessString;
        System.out.println("Enter your guess (h for height and l for low) : ");
        userGuessString = userGuess.nextLine();
        System.out.print("Dices roll : ");
        for (int i = 0; i < MAX_NUMBER_RANDOM; i++){
            System.out.print(randomNum[i]);
            if (i == MAX_NUMBER_RANDOM-1){
                break;
            }else {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Total : " + sumNumberOfRandom);
        if (userGuessString.equals(answer)){
            System.out.println("Congratulations You win.");
        } else {
            System.out.println("Sorry. You lose.");
        }
    }
}
