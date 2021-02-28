/**
 * This TestGame2 class
 * It is a class that calls the classes HighLowGame and MonopolyGame in order to play the game
 * or configure the game to play.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 28, 2021
 *
 **/

package treeechan.treepaech.lab6;

public class TestGame2 {
    public static void main(String[] args) {
        HighLowGame game1 = new HighLowGame();
        System.out.println(game1);
        game1.playGame();
        HighLowGame game2 = new HighLowGame(3);
        System.out.println(game2);
        game2.playGame();
        HighLowGame game3 = new HighLowGame(4,"h");
        System.out.println(game3);
        game3.playGame();
        MonopolyGame game4 = new MonopolyGame();
        System.out.println(game4);
        game4.playGame();
        MonopolyGame game5 = new MonopolyGame(3);
        System.out.println(game5);
        game5.setUpBoard();
        game5.playGame();
        System.out.println("roll dice " + game5.getDiceRoll());
        System.out.print("show cash " + game5.getCash());
    }
}
