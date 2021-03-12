/**
 * This SortByMaxTries class
 * It is a class that takes the MaxTries of each game a player creates and compares.
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

class SortByMaxTries implements Comparator<GuessNumberGameVer3> {
    @Override
    public int compare(GuessNumberGameVer3 a, GuessNumberGameVer3 b){
        return b.getMaxTries() - a.getMaxTries();
    }
}
