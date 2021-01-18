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
        String[] arrayString = new String[10];
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number of row then number of column of a matrix:");
        rowDimension = number.nextInt();
        columnDimension = number.nextInt();
        while (rowDimension <= 0 || columnDimension <= 0){
            System.out.println("Number of row and column must be positive");
            rowDimension = number.nextInt();
            columnDimension = number.nextInt();
        }
        matrix = new int[rowDimension][columnDimension];
        System.out.println("Enter your matrix by row.");
        for (int i = 0; i < rowDimension; i++){
           for (int j = 0; j < columnDimension; j++){
               matrix[i][j] = number.nextInt();
           }
        }
    }
    public static void showMatrix(){
        System.out.println("Showing original matrix:");
        for (int i = 0; i < rowDimension; i++){
            for (int j = 0; j < columnDimension; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void showMatrixByColumn(){
        System.out.print("Show matrix by columns : ");
        for (int i = 0; i < columnDimension; i++){
            for (int j = 0; j < rowDimension; j++){
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println();
    }
    public static void showMatrixByRow(){
        System.out.print("Show matrix by rows : ");
        for (int i = 0; i < rowDimension; i++){
            for (int j = 0; j < columnDimension; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void showMatrixByColumnBackward(){
        System.out.print("Show matrix by columns backward : ");
        for (int i = columnDimension-1; i >= 0; i--){
            for (int j = rowDimension-1; j >= 0; j--){
                System.out.print(matrix[j][i] + " ");
            }
        }
        System.out.println();
    }
    public static void showMatrixByRowBackward(){
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
