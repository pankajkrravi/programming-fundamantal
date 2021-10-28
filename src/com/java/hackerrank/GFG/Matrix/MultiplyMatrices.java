package com.java.hackerrank.GFG.Matrix;

/**
 * @Author pankaj
 * @create 10/27/21 12:47 PM
 ******************* Paytm **************************/
public class MultiplyMatrices {
    public static void multiply(int A[][], int B[][], int C[][], int N) {
                    for (int i=0;i<N;i++){
                        for (int j=0;j<N;j++){
                               C[i][j] =A[i][j]*B[i][j];
                               System.out.print(C[i][j]+" ");
                        }
                        System.out.println();
                    }
    }

    public static void main(String[] args) {
        multiply(new int[][]{{7, 8}, {2 , 9}},new int[][]{{14, 5}, {5, 18}},new int[2][2],2);
    }
}
