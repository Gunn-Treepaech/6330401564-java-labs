package treeechan.treepaech.lab6;

import java.util.Scanner;

class GuessNumberGame extends Game{
    protected int minNum = 1;
    protected int maxNum = 10;
    protected int maxTries = 3;
    protected static int numOfGames = 0;
    protected int correctNum;

    @Override // Change according to the calling object
    public String toString() {
        return super.toString() + "Min is " + minNum + ", Max is " + maxNum
                + ", Number of tries is " + maxTries;
    }
    public int getMinNum(){
        return minNum;  // Send back minNum
    }
    public void setMinNum(int minNum){
        this.minNum = minNum;  // Change the minNum variable
    }
    public  int getMaxNum(){
        return maxNum;   // Send back maxNum
    }
    public void setMaxNum(int maxNum){
        this.maxNum = maxNum;  // Change the maxNum variable
    }
    public  int getMaxTries() {
        return maxTries; // Send back maxTries
    }
    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;  // Change the maxTries variable
    }
    public GuessNumberGame(){
        super.setGameName("GuessNumberGame");
        super.setNumOfPlayer(1);
        numOfGames++;
    }
    public GuessNumberGame(int minNum, int maxNum){
        super.setGameName("GuessNumberGame");
        super.setNumOfPlayer(1);
        this.minNum = minNum; // Change the minNum variable
        this.maxNum = maxNum; // Change the maxNum variable
        numOfGames++;
    }
    public GuessNumberGame(int minNum, int maxNum, int maxTries){
        super.setGameName("GuessNumberGame");
        super.setNumOfPlayer(1);
        this.minNum = minNum; // Change the minNum variable
        this.maxNum = maxNum; // Change the maxNum variable
        this.maxTries = maxTries; // Change the maxTries variable
        numOfGames++;
    }
    public static int getNumOfGames(){
        return numOfGames; // Send back numOfGames
    }
    public void playGame(){
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        Scanner getNum = new Scanner(System.in);
        int numLoop = 1;
        int userNumInt;
        String userNum;
        while (numLoop <= maxTries){
            System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
            userNum = getNum.nextLine();
            userNumInt = Integer.parseInt(userNum);
            if (userNumInt != correctNum){
                if (userNumInt > correctNum){
                    System.out.println("Please type a Lower number! Number of remaining tries:" + (maxTries - numLoop));
                    // If  user numbers are less than random numbers
                } else {
                    System.out.println("Please type a higher number! Number of remaining tries:" + (maxTries - numLoop));
                    // If  user numbers are greater than random numbers
                }
                numLoop++; // Increase the value of numLoop by 1
            } else {
                System.out.println("Congratulations!  That’s correct");
                // If  user numbers are equal to random numbers
                break;
            }
        }
    }

}
