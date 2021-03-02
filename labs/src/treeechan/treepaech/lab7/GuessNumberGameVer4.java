package treeechan.treepaech.lab7;

import treeechan.treepaech.lab5.GuessNumberGameVer3;

import java.util.ArrayList;
import java.util.Collections;

public class GuessNumberGameVer4 extends GuessNumberGameVer3 {
    static ArrayList<GuessNumberGameVer4> games = new ArrayList<GuessNumberGameVer4>(0);

    public GuessNumberGameVer4(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
    }

    public static void initGamesList(){
        games.add(new GuessNumberGameVer4(1,10,3));
        games.add(new GuessNumberGameVer4(1,10,5));
        games.add(new GuessNumberGameVer4(1,5,5));

        System.out.println("Unsorted");
        for (GuessNumberGameVer3 game: games){
            System.out.println(game);
        }
    }

    public static void testComparingMaxTries(){
        initGamesList();
        Collections.sort(games, new SortByMaxTries());

        System.out.println("\nSorted by max tries in descending oder");
        for (GuessNumberGameVer3 game : games){
            System.out.println(game);
        }
    }

    public static void testComparingSortByMaxTriesThenRandomRange(){
        initGamesList();
        Collections.sort(games, new SortByMaxTriesThenRandomRange());

        System.out.println("\nSorted by max tries in descending oder");
        for (GuessNumberGameVer3 game : games){
            System.out.println(game);
        }
    }

    public static void main(String[] args) {
        //testComparingMaxTries();
        testComparingSortByMaxTriesThenRandomRange();
    }
}
