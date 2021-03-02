package treeechan.treepaech.lab7;

import treeechan.treepaech.lab5.GuessNumberGameVer3;
import java.util.Comparator;

class SortByMaxTries implements Comparator<GuessNumberGameVer3> {
    public int compare(GuessNumberGameVer3 a, GuessNumberGameVer3 b){
        return b.getMaxTries() - a.getMaxTries();
    }


}
