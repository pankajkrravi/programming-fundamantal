package com.java.hackerrank.GFG.Matrix;

/**
 * @Author pankaj
 * @create 10/27/21 8:53 PM
 * matrix Grid[][] of size NxN. Calculate the absolute difference between the sums of its diagonals.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N=3
 * Grid=[[1,2,3],[4,5,6],[7,8,9]]
 * Output:
 * 0
 * Explanation:
 * Sum of primary diagonal = 1+5+9 = 15.
 * Sum of secondary diagonal = 3+5+7 = 15.
 * Difference = |15 - 15| = 0.
 */
public class FindDifferenceBetweenSumOfDiagonals {
    int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int pDiagonal = 0, sDiagonal = 0;
        // PDiagonal Logic
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j)
                    pDiagonal = pDiagonal + Grid[i][j];
                else if (i == N- j - 1)
                    sDiagonal =sDiagonal+Grid[i][j];
            }
        }

        return pDiagonal-sDiagonal;
    }
}