package treeechan.treepaech.lab6;

class DiceGame extends Game {
    protected int diceRoll;
    protected String answer = "l";

    public DiceGame(){
        super.setGameName("DiceGame");
        super.setNumOfPlayer(1);
        genDiceRoll();
    }
    public DiceGame(String answer){
        super.setGameName("DiceGame");
        super.setNumOfPlayer(1);
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
        return super.toString() + "Dice Roll : "+ diceRoll +", Player's guess : " + answer;
    }
    public void genDiceRoll(){
        int minNum = 1;
        int maxNum = 6;
        diceRoll = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }
    public void playGame(){
        if (diceRoll <= 3 && answer.equals("l")){
            System.out.println("Congratulations You win.");
        } else if (diceRoll > 3 && answer.equals("h")) {
            System.out.println("Congratulations You win.");
        } else {
            System.out.println("Sorry. You lose.");
        }
    }
}
