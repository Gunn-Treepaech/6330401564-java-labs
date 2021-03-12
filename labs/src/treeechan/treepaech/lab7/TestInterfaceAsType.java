/**
 * This TestInterfaceAsType program
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 5, 2021
 *
 **/

package treeechan.treepaech.lab7;

import treeechan.treepaech.lab6.*;

import java.util.ArrayList;

public class TestInterfaceAsType {
    public static int compareRollDice(DiceGame a, DiceGame b){
        if (a.getDiceRoll() < b.getDiceRoll()){
            return -1;
        } else if (a.getDiceRoll() > b.getDiceRoll()){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<DiceGame> games = new ArrayList<DiceGame>(0);
        games.add(new HighLowGame()); //3
        games.add(new HighLowGame(3));
        games.add(new HighLowGame(4, "h"));
        games.add(new MonopolyGame()); //2
        games.add(new MonopolyGame(3)); //2

        for (int i = 0; i <= 3; i++){
            if (compareRollDice(games.get(i),games.get(i+1)) < 0){
                System.out.printf("Game(%d):%s has dice roll less than Game(%d):%s\n"
                        ,i,games.get(i).getDiceRoll(),i+1,games.get(i+1).getDiceRoll());
                UseDice newGame = (UseDice) games.get(i);
                System.out.printf("Game(%d): rollDice method returns %d\n",i,newGame.rollDice());
            } else if (compareRollDice(games.get(i),games.get(i+1)) > 0){
                System.out.printf("Game(%d):%s has dice roll greater than Game(%d):%s\n"
                        ,i,games.get(i).getDiceRoll(),i+1,games.get(i+1).getDiceRoll());
                UseDice newGame = (UseDice) games.get(i);
                System.out.printf("Game(%d): rollDice method returns %d\n",i,newGame.rollDice());
            } else {
                System.out.printf("Game(%d):%s has dice roll equal to Game(%d):%s\n"
                        ,i,games.get(i).getDiceRoll(),i+1,games.get(i+1).getDiceRoll());
                UseDice newGame = (UseDice) games.get(i);
                System.out.printf("Game(%d): rollDice method returns %s\n",i,newGame.rollDice());
            }
        }
    }
}
