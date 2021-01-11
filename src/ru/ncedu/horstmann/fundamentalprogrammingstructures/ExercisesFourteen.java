package ru.ncedu.horstmann.fundamentalprogrammingstructures;

import java.util.Scanner;

/**
 * This class ExercisesFourteen
 * Exercises 14
 * Write a program that reads a two-dimensional array of integers and determines
 * whether it is a magic square (that is, whether the sum of all
 * rows, all columns, and the diagonals is the same). Accept lines of input
 * that you break up into individual integers, and stop when the user enters
 * a blank line. For example, with the input
 * @version 1.0, 4 Jan 2021
 * @author Vladislav Semenovykh
 */
public class ExercisesFourteen {
    private int[][] twoDimensionalArray;
    private int sumDiag;
    private int sumRow;
    private int sumCol;
    private int N;

    /**
     * Method to get add values in array
     * @return two-dimensional array
     */
    public int[][] enterArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number row: ");
        int nRow = in.nextInt();
        System.out.print("Input number col: ");
        int nCol = in.nextInt();
        this.N = nRow;
        this.twoDimensionalArray = new int[nRow][nCol];
        System.out.println("Enter value array: ");
        int valueArray;
        for(int i = 0; i < nRow; i++){
            for(int j = 0; j < nCol; j++){
                valueArray = in.nextInt();
                this.twoDimensionalArray[i][j] = valueArray;
            }
        }
        in.close();
        return this.twoDimensionalArray;
    }

    /**
     *This the method print two-dimensional array
     */
    public void printMatrix () {
        for (int[] array : twoDimensionalArray) {
            for (int x : array) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
        System.out.println("");
    }

    /**
     * @return true if second diagonal sum is equal to a first diagonal sum, otherwise false
     */
    public boolean diagonalMatrices(){
        for (int i = 0; i < N; i++)
            this.sumDiag += twoDimensionalArray[i][i];
        // second diagonal
        int sumTwo=0;
        for (int i = 0; i < N; i++)
            sumTwo = sumTwo + twoDimensionalArray[i][N-1-i];
        if(this.sumDiag!=sumTwo) return false;
        return true;
    }

    /**
     * @return true if each column is equal to a simple sum, otherwise false
     * */
    public boolean comparisonOfColumns(){
        for (int i = 0; i < N; i++) {
            this.sumCol = 0;
            for (int j = 0; j < N; j++)
                this.sumCol += twoDimensionalArray[j][i];
            /*check if each column sum is equal to a simple diagonal sum*/
            if (sumDiag !=  sumCol) return false;
        }
        return true;
    }

    /**
     * @return true if each row sum is equal to a simple diagonal sum, otherwise false
     */
    public boolean comparingStrings(){
        for (int i = 0; i < N; i++) {
            this.sumRow = 0;
            for (int j = 0; j < N; j++)
                this.sumRow += twoDimensionalArray[i][j];
            /*check if each sum of the row is equal to the simple diagonal sum*/
            if (sumRow != sumDiag) return false;
        }
        return true;
    }

    /**
     * The method that determines whether a given matrix is a magic square
     * @return true if this matrix is a magic square, otherwise false
     */
    public boolean magicSquare() {
        if(comparingStrings()) return true;
        if(comparisonOfColumns()) return true;
        if(diagonalMatrices()) return true;
        return false;
    }

    /**
     * Method is print result
     */
    public void printResult(){
        if ((magicSquare())) {
            System.out.println("It's a magic square!");
        } else {
            System.out.println("It's not a magic square!");
        }
    }
}
