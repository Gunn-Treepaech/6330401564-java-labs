/**
 * This SortByMaxTriesThenRandomRange class
 * It is a class that takes MaxTries of each game that the player generates and compares,
 * then compares the random range.
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:March 5, 2021
 *
 **/

package treeechan.treepaech.lab7;

import treeechan.treepaech.lab5.GuessNumberGameVer3;
import java.util.Comparator;

class SortByMaxTriesThenRandomRange implements Comparator<GuessNumberGameVer3> {
    @Override
    public int compare(GuessNumberGameVer3 a, GuessNumberGameVer3 b){
        int maxTriesCompare = new SortByMaxTries().compare(a,b);
        int rangeCompare = new SortByRange().compare(a,b);

        if (rangeCompare == 0){
            return ((maxTriesCompare == 0) ? rangeCompare : maxTriesCompare);
        } else {
            return rangeCompare;
        }
    }

}
