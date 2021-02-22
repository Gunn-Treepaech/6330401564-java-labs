package treeechan.treepaech.lab6;

class DiceGame extends Game {
    protected int diceRoll;
    protected String answer = "l";

    public DiceGame(){
        genDiceRoll();
    }
    public DiceGame(String answer){
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
        super.setGameName("DiceGame");
        super.setNumOfPlayer(1);
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
