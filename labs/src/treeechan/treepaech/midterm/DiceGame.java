/**
 * This program DiceGame
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 18, 2021
 *
 **/

package treeechan.treepaech.midterm;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int MAX_NUMBER_RANDOM = 3;
        Scanner userGuess = new Scanner(System.in);
        String userGuessString;
        int[] randomNum = new int[MAX_NUMBER_RANDOM];
        int minNum = 1, maxNum = 6;
        int sumNumberOfRandom = 0;
        int numCheck = 10;
        System.out.println("Enter your guess (h for height and l for low) : ");
        userGuessString = userGuess.nextLine();
        for (int i = 0; i < MAX_NUMBER_RANDOM; i++){
            randomNum[i] = minNum + (int) (Math.random() * ((maxNum - minNum) + 1)); // สุ่มตัวเลขจาก ( 1-6 )
            sumNumberOfRandom += randomNum[i]; // บวกตัวเลขที่สุ่มได้
        }
        System.out.print("Dices roll : ");
        for (int i = 0; i < MAX_NUMBER_RANDOM; i++){
            System.out.print(randomNum[i]);
            if (i == MAX_NUMBER_RANDOM-1){
                break; // ถ้าเป็นตัวสุดท้ายให้ออกจากลูป
            }else {
                System.out.print(", "); // ไม่ใช่ให้พิมพ์ , ต่อท้าย
            }
        }
        System.out.println();
        System.out.println("Total : " + sumNumberOfRandom); // แสดงผลรวมของเลขที่สุ่ม
        if (sumNumberOfRandom <= numCheck && userGuessString.equals("h") ){
            System.out.println("Sorry. You lose.");  // ถ้าทายผิดจะแสดง
        } else {
            System.out.println("Congratulations You win."); // ทายถูกจะแสดง
        }

    }
}
