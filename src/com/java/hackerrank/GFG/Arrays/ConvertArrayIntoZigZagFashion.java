package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/3/21 6:50 PM
 * <p>
 * Given an array Arr (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion. The converted array should be in form a < b > c < d > e < f. The relative order of elements is same in the output i.e you have to iterate on the original array only.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 7
 * Arr[] = {4, 3, 7, 8, 6, 2, 1}
 * Output: 3 7 4 8 2 6 1
 * Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * Arr[] = {1, 4, 3, 2}
 * Output: 1 4 2 3
 * Explanation: 1 < 4 > 2 < 3
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function zigZag() which takes the array of integers arr and n as p
 * <p>
 * **************************** Amazon Paytm Adobe *********************
 */
public class ConvertArrayIntoZigZagFashion {
    void zigZag(int A[], int N) {
        // code here
        for (int i = 1; i < N; i += 2) {
            if (i <= N && A[i] < A[i - 1]) {
                int temp = A[i - 1];
                A[i - 1] = A[i];
                A[i] = temp;
            }  if (i < N - 1 && A[i] < A[i + 1]) {
                int temp = A[i + 1];
                A[i + 1] = A[i];
                A[i] = temp;
            }
        }
    }
}
