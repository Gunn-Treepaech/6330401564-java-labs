/**
 * This program DiceGameMethod2 accepts
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 18, 2021
 *
 **/

package treeechan.treepaech.midterm;

import java.util.Arrays;
import java.util.Scanner;

public class DiceGameMethod2 {
    static int MAX_NUMBER_RANDOM = 3;
    static String answer;
    static int[] randomNum = new int[MAX_NUMBER_RANDOM];
    static int[] allRandom = new int[100];
    static int numOfRandom = 0;

    public static void main(String[] args) {
        getAnswer();
        playDiceGame();
        sortNumOfRandom();
    }
    public static void getAnswer(){
        int minNum = 1, maxNum = 6;
        int sumNumberOfRandom = 0;
        for (int i = 0; i < MAX_NUMBER_RANDOM; i++){
            randomNum[i] = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
            allRandom[numOfRandom] = randomNum[i];
            numOfRandom++;
        }
        if (sumNumberOfRandom() <= 10){
            answer = "l";
        } else {
            answer = "h";
        }
    }
    public static int sumNumberOfRandom(){
        int sumNumberOfRandom = 0;
        for (int i = 0; i < MAX_NUMBER_RANDOM; i++){ ;
            sumNumberOfRandom += randomNum[i];
        }
        return sumNumberOfRandom;
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
        System.out.println("Total : " + sumNumberOfRandom());
        if (userGuessString.equals(answer)){
            System.out.println("Congratulations You win.");
        } else {
            System.out.println("Sorry. You lose.");
        }
        playGames();
    }
    public static void playGames(){
        Scanner userAnswer = new Scanner(System.in);
        String userAnswerString;
        System.out.println("Enter g to play again, q to quite, x for maximum, n for minimum, and v for average");
        userAnswerString = userAnswer.nextLine();
        switch (userAnswerString){
            case "g" : getAnswer();
                       playDiceGame();
                       break;
            case "q" : System.exit(0);
                       break;
            case "x" : System.out.println("Maximum = " + sortNumOfRandom()[sortNumOfRandom().length-1]);
                       playGames();
                       break;
            case "n" : System.out.println("Minimum = " + sortNumOfRandom()[0]);
                       playGames();
                       break;
            case "v" : average();
                       break;
        }
    }
    public static int[] sortNumOfRandom(){
        int[] copyNumOfRandom = new int[numOfRandom];
        for (int i = 0; i < numOfRandom; i++){
            copyNumOfRandom[i] = allRandom[i];
        }
        Arrays.sort(copyNumOfRandom);
        return copyNumOfRandom;
    }
    public static void average(){
        double averageNum;
        double sumAllRandom = 0;
        for (int i = 0; i < numOfRandom; i++){
            sumAllRandom += allRandom[i];
        }
        averageNum = sumAllRandom/numOfRandom;
        System.out.printf("%.0f : %d",sumAllRandom, numOfRandom);
        System.out.println();
        System.out.printf("Average = %.2f", averageNum);
        System.out.println();
        playGames();
    }
}
