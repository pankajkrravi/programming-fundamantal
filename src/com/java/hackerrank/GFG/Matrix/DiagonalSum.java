package com.java.hackerrank.GFG.Matrix;

/**
 * @Author pankaj
 * @create 10/27/21 8:33 PM
For example, for a 2 x 2 matrix, the sum of diagonal elements of the matrix {1,2,3,4} will be equal to 5.
1     2
3    4
Sum = 1+4 = 5
dd only those elements of the matrix for which row number and column number is same, like 1st row and 1st column, 2nd row and 2nd column and so on(i==j).
 */
public class DiagonalSum {
    public int DiagonalSum(int[][] matrix) {
        // code here
        int diagonalSum=0;
        for ( int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                if (i==j) {
                    diagonalSum = diagonalSum + matrix[i][j];
                }
            }
        }
        return diagonalSum;
    }
}
