package com.java.hackerrank.GFG.Matrix;

/**
 * @Author pankaj
 * @create 10/27/21 6:00 PM
 */
public class AdditionOfTwoSquareMatrices {
    public void  Addition(int[][] matrixA, int[][] matrixB) {
        // code here
                for (int i=0;i< matrixA.length;i++){
                    for (int j=0;j<matrixA.length;j++){
                        matrixA[i][j] = matrixA[i][j]+matrixB[i][j];
                    }
                }
    }
}
