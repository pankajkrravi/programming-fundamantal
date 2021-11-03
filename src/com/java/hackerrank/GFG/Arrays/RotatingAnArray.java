package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/3/21 12:16 PM
 * Given an array of size N. The task is to rotate array by D elements where D ≤ N.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 7
 * Arr[] = {1, 2, 3, 4, 5, 6, 7}
 * D = 2
 * Output: 3 4 5 6 7 1 2
 * Explanation:
 * Rotate by 1: [2, 3, 4, 5, 6, 7, 1]
 * Rotate by 2: [3, 4, 5, 6, 7, 1, 2]
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * Arr[] = {1, 3, 4, 2}
 * D = 3
 * Output: 2 1 3 4
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function leftRotate() which takes the array of integers arr[], its size n and d as input parameters and rotates arr[] in-place without using any extra memory.
 * <p>
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 105
 * 1 ≤ Arr[i] ≤ 1000
 * 0 ≤ D ≤ N
 * ***********************************  Codenation ***************************
 */
public class RotatingAnArray {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        int cloneArray[] = arr.clone();
            for (int i= 0;i<n;i++){
                arr[(i+n-d)%n] =cloneArray[i];
            }
    }
}
