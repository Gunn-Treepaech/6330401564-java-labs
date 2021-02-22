/**
 * This Game class
 * It is a class that can display the name of the games the player will play
 * and the number of players will play.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 22, 2021
 *
 **/

package treeechan.treepaech.lab6;

abstract class Game {
    protected String gameName;
    protected int numOfPlayer;
    public Game(){
        this.gameName = "unknown game"; // set nameName to "unknown game"
        this.numOfPlayer = 0;     // set numOfPlayer to 0
    }
    public Game(String gameName, int numOfPlayer){
        this.gameName = gameName;
        this.numOfPlayer = numOfPlayer;
    }
    public int getNumOfPlayer() {
        return numOfPlayer;
    }
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    public String getGameName() {
        return gameName;
    }
    public void setNumOfPlayer(int numOfPlayer) {
        this.numOfPlayer = numOfPlayer;
    }
    @Override
    public String toString() {
        String msg;
        msg = "Game Name : " + gameName + ", Number of player : " + numOfPlayer + ", ";
        return msg;
    }
    abstract void playGame();
}
