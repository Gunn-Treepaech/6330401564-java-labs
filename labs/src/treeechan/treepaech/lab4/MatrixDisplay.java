/**
 * This program MatrixDisplay accepts Number of Row, Number of Column , Number in Matrix
 * output format is " Enter number of row then number of column of a matrix: <rowDimension><columnDimension>
 *                    Enter your matrix by row <Get the number of digits in the matrix>
 *                    Showing original matrix: <showMatrix>
 *                    Show matrix by columns : <showMatrixByRow>
 *                    Show matrix by rows : <showMatrixByColumn>
 *                    Show matrix by columns backward : <showMatrixByRowBackward>
 *                    Show matrix by rows backward : <showMatrixByColumnBackward>
 *                    Show matrix by rows zigzag : <showMatrixByRowZigzag>"
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 19, 2021
 *
 **/

package treeechan.treepaech.lab4;

import java.util.Scanner;

public class MatrixDisplay {
    static int[][] matrix;
    static int rowDimension, columnDimension;
    public static void main(String[] args){
        inputMatrix();
        showMatrix();
        showMatrixByRow();
        showMatrixByColumn();
        showMatrixByRowBackward();
        showMatrixByColumnBackward();
        showMatrixByRowZigzag();
    }
    public static void inputMatrix(){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number of row then number of column of a matrix:");
        rowDimension = number.nextInt();  // Gets the value of a number of row
        columnDimension = number.nextInt(); // Gets the value of a number of column
        while (rowDimension <= 0 || columnDimension <= 0){
            // When the value of the row or column Is less than or equal to 0
            System.out.println("Number of row and column must be positive");
            rowDimension = number.nextInt();
            columnDimension = number.nextInt();
        }
        matrix = new int[rowDimension][columnDimension]; // Create an array based on the number of rows and columns.
        System.out.println("Enter your matrix by row.");
        for (int i = 0; i < rowDimension; i++){
           for (int j = 0; j < columnDimension; j++){
               matrix[i][j] = number.nextInt();  // Get the number of digits in the matrix.
           }
        }
    }
    public static void showMatrix(){
        System.out.println("Showing original matrix:");
        for (int i = 0; i < rowDimension; i++){
            for (int j = 0; j < columnDimension; j++){
                System.out.print(matrix[i][j] + " "); // Show the numbers in the matrix.
            }
            System.out.println(); // Show spaces
        }
    }
    public static void showMatrixByColumn(){
        System.out.print("Show matrix by columns : ");
        for (int i = 0; i < columnDimension; i++){
            for (int j = 0; j < rowDimension; j++){
                System.out.print(matrix[j][i] + " "); // Display the numbers in the matrix sorted by columns.
            }
        }
        System.out.println();
    }
    public static void showMatrixByRow(){
        System.out.print("Show matrix by rows : ");
        for (int i = 0; i < rowDimension; i++){
            for (int j = 0; j < columnDimension; j++){
                System.out.print(matrix[i][j] + " "); // Show numbers in a matrix that are arranged by rows.
            }
        }
        System.out.println();
    }
    public static void showMatrixByColumnBackward(){
        // Displays the numbers in a matrix that are arranged from behind by rows.
        System.out.print("Show matrix by columns backward : ");
        for (int i = columnDimension-1; i >= 0; i--){
            for (int j = rowDimension-1; j >= 0; j--){
                System.out.print(matrix[j][i] + " "); //
            }
        }
        System.out.println();
    }
    public static void showMatrixByRowBackward(){
        // Displays the numbers in a matrix that are arranged from behind by columns
        System.out.print("Show matrix by rows backward : ");
        for (int i = rowDimension-1; i >= 0; i--){
            for (int j = columnDimension-1; j >= 0; j--){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void showMatrixByRowZigzag(){
        System.out.print("Show matrix by rows zigzag : ");
        for (int i = 0; i < rowDimension; i++){
            if (i == 1){
                // Show from back to front
                for (int j = columnDimension - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = 0; j < columnDimension; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
