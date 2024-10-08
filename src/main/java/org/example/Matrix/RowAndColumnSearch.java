package org.example.Matrix;

/*
Given an N X N matrix and an integer X,
find the position of X in the matrix if it is present.
Otherwise, print “Element not found”.
Every row and column of the matrix is sorted in increasing order.
 */
public class RowAndColumnSearch {

    static int search(int[][] mat, int n, int x) {
        if (n == 0)
            return -1;

        //traverse through the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (mat[i][j] == x) {
                    System.out.println("Element found at (" + i + ", " + j + ")\n");
                    return 1;
                }
        }
        System.out.println(" Element not found");
        return 0;
    }

    public static void main(String[] args) {
        int mat [][] = {{ 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(mat, 4, 50);

    }
}
