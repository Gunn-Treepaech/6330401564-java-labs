package treeechan.treepaech.lab7;

import treeechan.treepaech.lab5.GuessNumberGameVer3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GuessNumberGameVer4 extends GuessNumberGameVer3 {
    static ArrayList<GuessNumberGameVer3> games = new ArrayList<GuessNumberGameVer3>(0);

    public static void initGamesList(){
        games.add(new GuessNumberGameVer3(1,10,3));
        games.add(new GuessNumberGameVer3(1,10,5));
        games.add(new GuessNumberGameVer3(1,5,5));

        System.out.println("Unsorted");
        for (GuessNumberGameVer3 game: games){
            System.out.println(game);
        }
    }

    public static void testComparingMaxTries(){
        initGamesList();


        System.out.println("\nSorted by max tries in descending oder");
        for (GuessNumberGameVer3 game : games){
            System.out.println(game);
        }
    }

    public static void main(String[] args) {
        testComparingMaxTries();
    }
}
