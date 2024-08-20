package org.example.Matrix;

/*
Given a boolean matrix mat[M][N] of size M x N,
modify it such that if a matrix cell mat[i][j] is 1 (or true)
then make all the cells of ith row and jth column as 1.
 e.g
 Input: {{1, 0},
         {0, 0}}
Output: {{1, 1}
         {1, 0}}
Input: {{0, 0, 0},
        {0, 0, 1}}
Output: {{0, 0, 1},
         {1, 1, 1}}

 */
public class BooleanMatrixQ1 {

    static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        //Iterate through each element in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                //If the element is 1, mark its row and column
                // as -1, except for other 1's
                if (matrix[i][j] == 1) {

                    //Mark all elements in same column as -1
                    //except for other 1's
                    int ind = i - 1;
                    while (ind >= 0) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i + 1;
                    while (ind < rows){
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind ++;
                    }
                    //Mark all elements in the same row as -1
                    //except other 1's
                    ind = j - 1;
                    while (ind >= 0) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind--;
                    }
                }
            }
        }

        //Iterate through the matrix again
        //setting -1 to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < 0) {
                    matrix[i][j]= 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 2, 1 },
                        { 3, 4, 5, 2 },
                        { 0, 3, 0, 5 } };

        setZeroes(arr);
        System.out.println("The Final Matrix is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
