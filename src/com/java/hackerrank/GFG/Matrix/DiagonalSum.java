package com.java.hackerrank.GFG.Matrix;

/**
 * @Author pankaj
 * @create 10/27/21 8:33 PM
 * For example, for a 2 x 2 matrix, the sum of diagonal elements of the matrix {1,2,3,4} will be equal to 5.
 * 1     2
 * 3    4
 * Sum = 1+4 = 5
 * dd only those elements of the matrix for which row number and column number is same, like 1st row and 1st column, 2nd row and 2nd column and so on(i==j).
 */
public class DiagonalSum {
    public int DiagonalSum(int[][] matrix) {
            int sd1 = 0 , sd2 = 0;
            int j = 0 , len = matrix.length - 1 , j1 = 0;
            for(int i = 0; i < matrix.length; i++){
                j = i;
                sd1 = sd1 + matrix[i][j];
                j1 = len - j;
                sd2 = sd2 + matrix[i][j1];
            }
            return sd1 + sd2;
        }
    }

       /* int diagonalSum=0;
        for ( int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                if (i==j) {
                    diagonalSum = diagonalSum + matrix[i][j];
                }
            }
        }
        return diagonalSum;
    }*/

