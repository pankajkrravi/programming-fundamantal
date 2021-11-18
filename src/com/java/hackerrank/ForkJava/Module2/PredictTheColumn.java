package com.java.hackerrank.ForkJava.Module2;

/**
 * @Author pankaj
 * @create 11/18/21 6:37 PM
 * <p>
 * Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 3
 * 1 1 0
 * 1 1 0
 * 1 1 0
 * <p>
 * Output:
 * 2
 * <p>
 * Explanation:
 * 2nd column (0-based indexing) is having 3 zeros which is maximum.
 * Example 2:
 * <p>
 * Input:
 * 3
 * 0 1 0
 * 0 0 1
 * 0 1 0
 * <p>
 * Output:
 * 0
 * <p>
 * Explanation:
 * 0th column (0-based indexing) is having 3 zeros which is maximum.
 * <p>
 * Constraints:
 * 1 <= N <= 102
 * 0 <= A[i][j] <= 1
 * User Task:
 * Your task is to complete the function columnWithMaxZero() which should return the column number with maximum number of zeros. If more than one column exists, print the one which comes first.
 */
public class PredictTheColumn {
    static int columnWithMaxZero(int a[][], int n) {
        // Your code here
        // find the column with maximum number of 0s.
        int max = 0,column=-1;
        for (int c = 0; c < n; c++) {
            int count = 0;
            for (int r = 0; r < n; r++) {
                if (a[r][c] == 0){
                    count++;
                }
            }if (max <count){
                max = count;
                column =c;
            }
        }
        return column;
    }
}
