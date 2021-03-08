/**
 * This MonopolyGame class
 * This is a class that sets the number of players and the amount of money for each player.
 * This class will only draw the dice 2 times only.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 28, 2021
 *
 **/

package treeechan.treepaech.lab6;

import java.util.Arrays;

public class MonopolyGame extends DiceGame implements UseDice, UseBoard, HasRule { ;
    protected int[] cash;
    protected final int numOfDice = 2;

    public MonopolyGame(){
        this.setGameName("Monopoly Game");
        this.setNumOfPlayer(2);
        genCash();  // Add money to the cash array
        rollDice(); // Roll the dice
    }
    public MonopolyGame(int numOfPlayer){
        this.setGameName("Monopoly Game");
        this.setNumOfPlayer(numOfPlayer);
        genCash();  // Add money to the cash array
        rollDice(); // Roll the dice
    }
    public void genCash(){
        cash = new int[numOfPlayer];
        for (int i =0; i < numOfPlayer; i++){
            cash[i] = 1500;
        }
    }
    public String getCash() {
        String msg = cash[0] + " ";
        for (int i = 1; i < numOfPlayer; i++){
            msg += cash[i] + " ";
        }
        return msg;
    }
    public void setCash(int[] cash) {
        this.cash = cash;
    }
    @Override
    public void setUpBoard() {
        System.out.println("Setting up monopoly board");
    }
    @Override
    public String gameRules() {
        return null;
    }
    @Override
    public int rollDice() {
        int randomNum;
        int minNum = 1, maxNum = 6;
        int sumNumberOfRandom = 0;
        for (int i = 0; i < numOfDice; i++){
            randomNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1)); // Randomize numbers from 1 to 6.
            sumNumberOfRandom += randomNum; // Add a random number
          //  System.out.println("Game MN - "+ randomNum + " : " + i);
        }
        super.diceRoll = sumNumberOfRandom; // Change the value diceRoll
        return diceRoll;
    }
    @Override
    public void playGame() {
        System.out.println("Playing Monopoly Game");
    }
    @Override
    public String toString() {
        String msg;
        msg = "Game Name : " + gameName + ", Number of player : " + numOfPlayer + ", ";
        return msg;
    }

}
