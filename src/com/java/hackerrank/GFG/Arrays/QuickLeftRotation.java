package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/6/21 1:14 PM
 * Given an array arr[] of size N and an integer K, the task is to left rotate the array K indexes
 * <p>
 * Example 1:
 * <p>
 * Input: N = 7, K = 2
 * arr[] = {1, 2, 3, 4, 5, 6, 7}
 * Output: 3 4 5 6 7 1 2
 * Explanation: Rotation of the above
 * array by 2 will make the output array .
 * <p>
 * Example 2:
 * <p>
 * Input: N = 6, K = 12
 * arr[] = {1, 2, 3, 4, 5, 6}
 * Output: 1 2 3 4 5 6
 * <p>
 * Your Task:
 * This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function leftRotate() that takes array arr, integer K and integer N as parameters and rotate the given array by d value.
 */
public class QuickLeftRotation {
    static void leftRotate(long arr[], int k, int n) {
        long temp[] = new long[n];
        int mod = k % n;
        for(int i = 0 ; i < n; i++){
            temp[i] = arr[(i+mod) % n];
        }

        for(int i = 0 ; i < n ; i++){
            arr[i]= temp[i];
        }
    }
}
