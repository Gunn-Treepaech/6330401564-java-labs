/**
 * This TestGamesUsingPolymorphism program
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 5, 2021
 *
 **/

package treeechan.treepaech.lab7;

import treeechan.treepaech.lab6.DiceGame;
import treeechan.treepaech.lab6.Game;
import treeechan.treepaech.lab6.GuessNumberGame;
import java.util.ArrayList;

public class TestGamesUsingPolymorphism {
    public static void main(String[] args) {
        ArrayList<Game> objectList = new ArrayList<Game>(0);
        objectList.add(new DiceGame());
        objectList.add(new DiceGame("h"));
        objectList.add(new GuessNumberGame());
        objectList.add(new DiceGame("l"));
        objectList.add(new GuessNumberGame(1,6,1));

        for (Game game : objectList ){
            System.out.println(game);
            game.playGame();
        }
    }
}
