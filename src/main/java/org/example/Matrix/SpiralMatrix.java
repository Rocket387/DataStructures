package org.example.Matrix;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix, the task is to print all elements
of the matrix in spiral form.
 */
public class SpiralMatrix {

    // Function performs spiral traversal of given matrix
    public static List<Integer> spiralOrder(int[][] matrix) {

        // Number of rows in the matrix
        int m = matrix.length;

        // Number of columns in the matrix
        int n = matrix[0].length;

        //List to store the spiral order elements
        List<Integer> result = new ArrayList<>();

        //empty matrix
        if (m == 0)
            return result;

        //2D array to keep track of visited cells
        boolean[][] seen = new boolean[m][n];

        //Arrays representing directions to traverse
        // right, down, left, up

        //change in row index for each direction
        int [] dr = {0,1,0,-1};

        //change in column index for each direction
        int []dc = {1,0,-1,0};

        //initial position in the matrix
        int r = 0, c = 0;

        //initial direction index (0 = right)
        int di = 0;

        //iterate though elements in matrix
        for (int i = 0; i < m * n; ++i) {

            //add current element to result list
            result.add(matrix[r][c]);

            //mark current cell as visited
            seen[r][c] = true;

            //calculate the next cell coordinates based on
            //current direction
            int newR = r + dr[di];
            int newC = c + dc[di];

            //Check the next cell is within bounds and not seen

            //visited
            if (0 <= newR && newR < m && 0 <= newC && newC < n
                    && !seen[newR][newC]) {

                //move to the next row
                r = newR;

                //move to next column
                c = newC;
            } else {

                //change direction (clockwise)
                di = (di + 1) % 4;

                //move to the next row according to new direction
                r += dr[di];

                //move to next column according to new direction
                c += dc[di];
            }
        }

        //returns list containing spiral order elements
        return result;
    }

    public static void main(String[] args) {

        int mat[][] = {{1,    2,   3,   4},
                      {5,    6,   7,   8},
                      {9,   10,  11,  12},
                      {13,  14,  15,  16 }};

        //function call to get spiral order traversal
        List<Integer> result = spiralOrder(mat);

        //print result elements
        for (int num : result) {
            System.out.println(num + "");
        }

    }
}
