package com.java.hackerrank.GFG.companyTag;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author pankaj
 * @create 1/16/22 11:54 PM
 * Given an array of N positive integers, print k largest elements from the array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5, k = 2
 * arr[] = {12,5,787,1,23}
 * Output: 787 23
 * Explanation: First largest element in
 * the array is 787 and the second largest
 * is 23.
 * Example 2:
 * <p>
 * Input:
 * N = 7, k = 3
 * arr[] = {1,23,12,9,30,2,50}
 * Output: 50 30 23
 * Explanation: Three Largest element in
 * the array are 50, 30 and 23.
 * Your Task:
 * Complete the function kLargest() that takes the array, N and K as input parameters and returns a list of k largest element in descending order.
 * <p>
 * Expected Time Complexity: O(N log K)
 * Expected Auxiliary Space: O(K)
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 104
 * K ≤ N
 * 1 ≤ array[i] ≤ 105
 */
public class KLargestElements {
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        // code here
        {
            Arrays.sort(arr);
            ArrayList<Integer> l = new ArrayList<Integer>();
            for (int i = n - 1; i >= (n - k); i--) {
                l.add(arr[i]);
            }
            return l;
        }
    }
}
