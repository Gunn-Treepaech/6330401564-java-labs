package treeechan.treepaech.lab7;

import treeechan.treepaech.lab5.GuessNumberGameVer3;
import java.util.Comparator;

class SortByMaxTriesThenRandomRange implements Comparator<GuessNumberGameVer3> {
    @Override
    public int compare(GuessNumberGameVer3 a, GuessNumberGameVer3 b){
        int maxTriesCompare = new SortByMaxTries().compare(a,b);
        int maxNumCompare = new SortByMaxNum().compare(a,b);

        if (maxNumCompare == 0){
            return ((maxTriesCompare == 0) ? maxNumCompare : maxTriesCompare);
        } else {
            return maxNumCompare;
        }
    }

}
