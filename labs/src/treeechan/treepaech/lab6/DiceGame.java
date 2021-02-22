/**
 * This DiceGame class
 *This class is a class that allows the player to guess whether the dice score is either low or height.
 *Less than or equal to 3 will be low, but if number greater than 3 will be height.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 22, 2021
 *
 **/

package treeechan.treepaech.lab6;

class DiceGame extends Game {
    protected int diceRoll;
    protected String answer;

    public DiceGame(){
        super("DiceGame",1);
        this.answer = "l";
        genDiceRoll();
    }
    public DiceGame(String answer){
        super("DiceGame",1);
        genDiceRoll();
        this.answer = answer;
    }
    public int getDiceRoll() {
        return diceRoll;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getAnswer() {
        return answer;
    }
    @Override
    public String toString() {
        return super.toString() + "Dice Roll : " + diceRoll + ", Player's guess : " + answer;
    }
    public void genDiceRoll(){
        int minNum = 1;
        int maxNum = 6;
        diceRoll = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        // Randomize numbers from 1 to 6.
    }
    public void playGame(){
        if (diceRoll <= 3 && answer.equalsIgnoreCase("l")){
            System.out.println("Congratulations You win."); // show when the players answered correctly.
        } else if (diceRoll > 3 && answer.equalsIgnoreCase("h")) {
            System.out.println("Congratulations You win.");  // show when the players answered correctly.
        } else {
            System.out.println("Sorry. You lose."); // shows when the players do not answer correctly.
        }
    }
}
