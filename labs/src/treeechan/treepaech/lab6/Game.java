package treeechan.treepaech.lab6;

abstract class Game {
    protected String gameName;
    protected int numOfPlayer;
    public Game(){
        this.gameName = "unknown game";
        this.numOfPlayer = 0;
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
