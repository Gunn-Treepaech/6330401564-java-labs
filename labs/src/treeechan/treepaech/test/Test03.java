package treeechan.treepaech.test;

import treeechan.treepaech.lab6.DiceGame;
import treeechan.treepaech.lab6.Game;

import java.util.ArrayList;

public class Test03 {
    static ArrayList<Game> a = new ArrayList<Game>(0);
    public static void main(String[] args) {
        a.add(new DiceGame());
    }
}
