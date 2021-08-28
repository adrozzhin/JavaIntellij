package com.syntax.Repl;

public class Repl132 {

    static int[][] reduce10(int[][]a) {
        int rows = a.length;
        int col = a[rows-1].length;
        int [][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = a[i][j] - 10;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        int[][] array = reduce10(a);
        //print the elements from new array
        for (int row[] : array) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
