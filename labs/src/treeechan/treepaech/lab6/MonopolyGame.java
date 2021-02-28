package treeechan.treepaech.lab6;

import java.util.Arrays;

class MonopolyGame extends DiceGame implements UseDice, UseBoard, HasRule { ;
    protected int[] cash;
    protected final int numOfDice = 2;

    public MonopolyGame(){
        setGameName("Monopoly Game");
        setNumOfPlayer(2);
        genCash();
        rollDice();
    }
    public MonopolyGame(int numOfPlayer){
        setGameName("Monopoly Game");
        setNumOfPlayer(numOfPlayer);
        genCash();
        rollDice();
    }
    public void genCash(){
        cash = new int[numOfPlayer];
        for (int i =0; i < numOfPlayer; i++){
            cash[i] = 1500;
        }
    }
    public String getCash() {
        return  Arrays.toString(cash);
    }
    public void setCash(int[] cash) {
        this.cash = cash;
    }
    @Override
    public void setUpBoard() {
        System.out.println("Setting up monopoly board");
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
        System.out.println("Playing Monopoly Game");
    }
    @Override
    public String toString() {
        String msg;
        msg = "Game Name : " + gameName + ", Number of player : " + numOfPlayer + ", ";
        return msg;
    }

}
