/**
 * This HighLowGame class
 *This class is a class that allows the player to guess whether the dice score is either low or height.
 *Less than or equal to 3 will be low, but if number greater than 3 will be height.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 28, 2021
 *
 **/

package treeechan.treepaech.lab6;

class HighLowGame extends DiceGame implements HasRule, UseDice  {
    protected int numOfDice;

    public HighLowGame(){
        setGameName( "High-Low Game");
        setNumOfPlayer(1);
        this.numOfDice = 3;
        rollDice();
    }
    public HighLowGame(int numOfDice){
        setGameName( "High-Low Game");
        setNumOfPlayer(1);
        this.numOfDice = numOfDice;
        rollDice();
    }
    public HighLowGame(int numOfDice , String answer){
        super(answer);
        setGameName( "High-Low Game");
        setNumOfPlayer(1);
        this.numOfDice = numOfDice;
        rollDice();
    }
    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }
    public int getNumOfDice() {
        return numOfDice;
    }
    @Override
    public void gameRules() {

    }
    @Override
    public void rollDice() {
        int MAX_NUMBER_RANDOM = numOfDice;
        int[] randomNum = new int[MAX_NUMBER_RANDOM];
        int minNum = 1, maxNum = 6;
        int sumNumberOfRandom = 0;
        for (int i = 0; i < MAX_NUMBER_RANDOM; i++){
            randomNum[i] = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
            sumNumberOfRandom += randomNum[i];
        }
        super.diceRoll = sumNumberOfRandom;
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
