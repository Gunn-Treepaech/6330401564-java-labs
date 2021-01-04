package treeechan.treepaech.lab2;

/**
 * This ChangeMachine program  is to accept four arguments: Coin amount 1 baht, Coin amount 2 baht
 * , Coin amount 5 baht , Coin amount 10 baht
 * ts output format is " 1000-bill : <Bank amount 1000 baht> , 500-bill : <Bank amount 500 baht>
 * ,100-bill : <Bank amount 100 baht>, 20-bill : <Bank amount 20 baht>
 *  ,Money remain : <remain>"
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 3, 2021
 *
 **/

public class ChangeMachine {
    public static void main(String[] args){
        if (args.length == 4 ){
            int[] n = new int[4];

            for(int i = 0; i < 4 ; i++){
                n[i] = Integer.parseInt(args[i]);  // Converted from text to numbers
            }

             if (n[0] >= 0 & n[1] >= 0 & n[2] >= 0 & n[3] >= 0){
                 int sum = n[0] + (n[1] * 2) + (n[2] * 5) + (n[3] * 10);  // Calculate total money
                 int n1000,n500,n100,n20,remain;
                 System.out.println("1-bath cions : "+ args[0]);
                 System.out.println("2-bath cions : "+ n[1]);
                 System.out.println("5-bath cions : "+ n[2]);
                 System.out.println("10-bath cions : "+ n[3]);
                 System.out.println("Total amount : "+ sum);   //  Total money

                 n1000 = sum / 1000;                 // Calculate bill 1000 baht
                 n500 = (sum % 1000) / 500;           // Calculate bill 500 baht
                 n100 = (sum % 1000 % 500) / 100;      // Calculate bill 100 baht
                 n20 = (sum % 1000 % 500 % 100) / 20;   // Calculate bill 20 baht
                 remain = sum % 1000 % 500 % 100 % 20; // Calculate remaining balance

                 System.out.println("1000-bill : "+ n1000);
                 System.out.println("500-bill : "+ n500);
                 System.out.println("100-bill : "+ n100);
                 System.out.println("20-bill : "+ n20);
                 System.out.println("Money remain : "+ remain);
             }
             else   {
                 System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <1B-baht coins> ** NoN negative **");
                 // When there is a negative value
             }
        }
        else   {
            System.err.println("ChangeMachine <1-baht coins> <2-baht coins> <5-baht coins> <1B-baht coins>");
            // When all the arguments have not been added or the specified number has not been reached
        }
    }
}
