package treeechan.treepaech.lab10;

import java.awt.event.ActionListener;

public class GuessNumberGameImageCanvasV3 extends GuessNumberGameImageCanvasV2 implements ActionListener {
    protected int numPress = 0;
    final protected int gameMaxTries = 3;

    @Override
    public void playGame() {
        super.playGame();
        numPress++;
        if (numPress == gameMaxTries){
           number1.setEnabled(false);
           number2.setEnabled(false);
           number3.setEnabled(false);
           number4.setEnabled(false);
           number5.setEnabled(false);
           number6.setEnabled(false);
           number7.setEnabled(false);
           number8.setEnabled(false);
           number9.setEnabled(false);
           number10.setEnabled(false);
           result.setText("No more tries");
        }
    }
}
