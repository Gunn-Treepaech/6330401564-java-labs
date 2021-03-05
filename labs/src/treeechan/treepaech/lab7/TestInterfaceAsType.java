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

import treeechan.treepaech.lab6.HighLowGame;
import treeechan.treepaech.lab6.MonopolyGame;
import treeechan.treepaech.lab6.UseDice;
import treeechan.treepaech.lab6.DiceGame;

import java.util.ArrayList;

public class TestInterfaceAsType {
    static ArrayList<String> listNum = new ArrayList<String>(0);
    public static int compareRollDice(UseDice a, UseDice b){
        int aNum = a.rollDice();
        int bNum = b.rollDice();
        if (aNum < bNum){
            listNum.add(String.valueOf(bNum - aNum));
            return -1;
        } else if (aNum > bNum){
            listNum.add(String.valueOf(aNum - bNum));
            return 1;
        } else {
            listNum.add(String.valueOf(bNum));
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<UseDice> games = new ArrayList<UseDice>(0);
        games.add(new HighLowGame());
        games.add(new HighLowGame(3));
        games.add(new HighLowGame(4, "h"));
        games.add(new MonopolyGame());
        games.add(new MonopolyGame(3));

        for (int i = 0; i <= 3; i++){
            if (compareRollDice(games.get(i), games.get(i+1)) < 0){
                System.out.printf(listNum.get(i));
                System.out.printf("Game(%d):%s has dice roll less than Game(%d):%s\n",i,
                        listNum.get(i),i+1,listNum.get(i+1));
                System.out.printf("Game(%d): rollDice method returns %d\n",i,
                        Integer.parseInt(listNum.get(i+1)) - Integer.parseInt(listNum.get(i)));
            }else if (compareRollDice(games.get(i), games.get(i+1)) > 0){
                System.out.printf("Game(%d):%s has dice roll greater than Game(%d):%s\n",i,listNum.get(i),i+1,listNum.get(i+1));
                System.out.printf("Game(%d): rollDice method returns %d\n",i,0);
            } else {
                System.out.printf("Game(%d):%s has dice roll equal to Game(%d):%s\n",i,listNum.get(i),i+1,listNum.get(i+1));
                System.out.printf("Game(%d): rollDice method returns %s\n",i,2);
            }
        }

    }
}
