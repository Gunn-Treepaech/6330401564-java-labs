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
        for (int row = 0; row < rowDimension; row++){
           for (int column = 0; column < columnDimension; column++){
               matrix[row][column] = number.nextInt();  // Get the number of digits in the matrix.
           }
        }
    }
    public static void showMatrix(){
        System.out.println("Showing original matrix:");
        for (int row = 0; row < rowDimension; row++){
            for (int column = 0; column < columnDimension; column++){
                System.out.print(matrix[row][column] + " "); // Show the numbers in the matrix.
            }
            System.out.println(); // Show spaces
        }
    }
    public static void showMatrixByColumn(){
        System.out.print("Show matrix by columns : ");
        for (int column = 0; column < columnDimension; column++){
            for (int row = 0; row < rowDimension; row++){
                System.out.print(matrix[row][column] + " "); // Display the numbers in the matrix sorted by columns.
            }
        }
        System.out.println();
    }
    public static void showMatrixByRow(){
        System.out.print("Show matrix by rows : ");
        for (int row = 0; row < rowDimension; row++){
            for (int column = 0; column < columnDimension; column++){
                System.out.print(matrix[row][column] + " "); // Show numbers in a matrix that are arranged by rows.
            }
        }
        System.out.println();
    }
    public static void showMatrixByColumnBackward(){
        // Displays the numbers in a matrix that are arranged from behind by rows.
        System.out.print("Show matrix by columns backward : ");
        for (int column = columnDimension - 1; column >= 0; column--){
            for (int row = rowDimension - 1; row >= 0; row--){
                System.out.print(matrix[row][column] + " "); //
            }
        }
        System.out.println();
    }
    public static void showMatrixByRowBackward(){
        // Displays the numbers in a matrix that are arranged from behind by columns
        System.out.print("Show matrix by rows backward : ");
        for (int row = rowDimension - 1; row >= 0; row--){
            for (int column = columnDimension-1; column >= 0; column--){
                System.out.print(matrix[row][column] + " ");
            }
        }
        System.out.println();
    }
    public static void showMatrixByRowZigzag(){
        int zigzagNum;
        System.out.print("Show matrix by rows zigzag : ");
        for (int row = 0; row < rowDimension; row++){
            zigzagNum = row % 2;
            if (zigzagNum != 0){
                // Show from back to front
                for (int column = columnDimension - 1; column >= 0; column--) {
                    System.out.print(matrix[row][column] + " ");
                }
            } else {
                for (int column = 0; column < columnDimension; column++) {
                    System.out.print(matrix[row][column] + " ");
                }
            }
        }
    }
}
