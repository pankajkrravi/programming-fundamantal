package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/2/21 10:16 PM
 * Given an array, rotate the array by one position in clock-wise direction.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * A[] = {1, 2, 3, 4, 5}
 * Output:
 * 5 1 2 3 4
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 8
 * A[] = {9, 8, 7, 6, 4, 2, 1, 3}
 * Output:
 * 3 9 8 7 6 4 2 1
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function rotate() which takes the array A[] and its size N as inputs and modify the array.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1<=N<=105
 * 0<=a[i]<=105
 */
public class CyclicallyRotateAnArrayByOne {
    public void rotate(int arr[], int n) {
        for (int i = 1; i < n ; i++) {
            int ref = arr[i];
            arr[i] = arr[0];
            arr[0] = ref;
        }
    }
}
