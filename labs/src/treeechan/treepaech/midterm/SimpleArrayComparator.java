/**
 * This program SimpleArrayComparator
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 18, 2021
 *
 **/

package treeechan.treepaech.midterm;

public class SimpleArrayComparator {
    public static void main(String[] args) {
        int[] numInt = new int[args.length];
        String[] array = new String[Integer.parseInt(args[0])];
        for (int i = 1; i < args.length; i++){
            array[i] = args[i] + " " + args[i+1];
            i++;
        }


    }
}
