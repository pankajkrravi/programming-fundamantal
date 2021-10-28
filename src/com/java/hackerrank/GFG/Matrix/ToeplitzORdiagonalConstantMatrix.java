package com.java.hackerrank.GFG.Matrix;

/**
 * @Author pankaj
 * @create 10/27/21 4:49 PM
 */
public class ToeplitzORdiagonalConstantMatrix {
    boolean isToepliz(int mat[][], int N, int M) {
/*        // Your code here
        for (int i=0;i<N-1;i++){
            for (int j=i; j<M-1;j++){
                if (i == j && mat[i][j] == mat[i+1][j+1])
                    return true;
            }
        }
        return false;*/
        int i =0,j=0;
        int resp = mat[i][j];
        while (++i<N && ++j <M){
                        // found mismatch
                            if (resp != mat[i][j])
                                return false;
        }
        return true;
    }

    public static void main(String[] args) {
                System.out.println(new ToeplitzORdiagonalConstantMatrix().isToepliz(new int[][]{{6,7,8},{4,6,7},{1,4,6}},3,3));
                System.out.println(new ToeplitzORdiagonalConstantMatrix().isToepliz(new int[][]{{1,2,3},{4,5,6}},2,3));
    }
}
