/**
 * This HighLowGame class
 * It is a class that will play a game for guessing the sum of dice random numbers.
 * Where players can set a random number of dice according to their preferences
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 28, 2021
 *
 **/

package treeechan.treepaech.lab6;

public class HighLowGame extends DiceGame implements HasRule, UseDice  {
    protected int numOfDice;

    public HighLowGame(){
        this.setGameName( "High-Low Game");
        this.setNumOfPlayer(1);
        this.numOfDice = 3;
        rollDice(); // Roll the dice
    }
    public HighLowGame(int numOfDice){
        this.setGameName( "High-Low Game");
        this.setNumOfPlayer(1);
        this.numOfDice = numOfDice;
        rollDice(); // Roll the dice
    }
    public HighLowGame(int numOfDice , String answer){
        super(answer);
        this.setGameName( "High-Low Game");
        this.setNumOfPlayer(1);
        this.numOfDice = numOfDice;
        rollDice(); // Roll the dice
    }
    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }
    public int getNumOfDice() {
        return numOfDice;
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
            //System.out.println("Game HL - "+ randomNum + " : " + i);
        }
        super.diceRoll = sumNumberOfRandom; // Change the value diceRoll
        return diceRoll;
    }
    @Override
    public void playGame() {
        int AnswerInt = (numOfDice*6 - numOfDice + 1)/2 + numOfDice - 1;
        if (diceRoll <= AnswerInt && answer.equalsIgnoreCase("l")){
            System.out.println("Congratulations You win."); // show when the players answered correctly.
        } else if (diceRoll > AnswerInt && answer.equalsIgnoreCase("h")) {
            System.out.println("Congratulations You win.");  // show when the players answered correctly.
        } else {
            System.out.println("Sorry. You lose."); // shows when the players do not answer correctly.
        }
    }
    @Override
    public String toString() {
        return super.toString() + " Number of dice is " + numOfDice;
    }
}
