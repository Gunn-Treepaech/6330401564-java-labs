/**
 * This  TestGuessNumberGenerator program
 * Is the program that will execute the class GuessNumberGameVer1 and GuessNumberGameVer2
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 30, 2021
 *
 **/

package treeechan.treepaech.lab5;

public class TestGuessNumberGenerator {
    public static void main(String[] args) {
        testConstructors();
        // testSetterGetterMethods();
        //testPlayGame();
    }
    public static void testConstructors(){
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 10);
        GuessNumberGameVer1 gng3 = new GuessNumberGameVer1(5, 10, 5);
        System.out.println(gng1); // When expanding will be gng1.toString
        gng1.playGame();
        System.out.println(gng2); // When expanding will be gng2.toString
        gng2.playGame();
        System.out.println(gng3); // When expanding will be gng3.toString
        gng3.playGame();
    }
    public static void testSetterGetterMethods(){
        GuessNumberGameVer1 gng = new GuessNumberGameVer1();
        System.out.println("The fist guess number game is");
        System.out.println(gng);
        System.out.println("Now, the number of game is " + GuessNumberGameVer1.getNumOfGames());
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 20);
        System.out.println("Creating another guess number game");
        System.out.println("Now, the number of game is " + GuessNumberGameVer1.getNumOfGames());

        gng.setMinNum(2);
        gng.setMaxNum(5);
        gng.setMaxTries(2);
        System.out.println("GuessNumberGame with new settings");
        System.out.println(gng);
        System.out.println("GuessNumberGame with getting methods");
        System.out.println("Min num is " + gng.getMinNum() + ", Max num is "
                + gng.getMaxNum() + ", and max tries is " + gng.getMaxTries());
    }
    public static void testPlayGame(){
        GuessNumberGameVer2 gng = new GuessNumberGameVer2(5, 10, 4);
        gng.playGame();
    }
}
