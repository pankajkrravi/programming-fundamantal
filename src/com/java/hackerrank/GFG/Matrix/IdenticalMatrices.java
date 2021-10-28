package com.java.hackerrank.GFG.Matrix;

/**
 * @Author pankaj
 * @create 10/27/21 5:47 PM
 * two square matrices Grid1 and Grid2 with the same dimensions(NxN). Check whether they are identical or not.
 * <p>
 * Input:
 * N=2
 * Grid1=[[1,2],[3,4]]
 * Grid2=[[1,2],[3,4]]
 * Output:
 * 1
 * Explanation:
 * Both the matrices are identical,
 * so the answer is 1.
 */
public class IdenticalMatrices {
    int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) {
        // code here
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Grid1[i][j] != Grid2[i][j])
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new IdenticalMatrices().areMatricesIdentical(2, new int[][]{{1, 2}, {3, 4}}, new int[][]{{1, 2}, {3, 4}}));
    }
}
