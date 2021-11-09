package com.java.hackerrank.GFG.Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author pankaj
 * @create 11/8/21 9:53 PM
 * You are given an array Arr of size N. Find the sum of distinct elements in an array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {1, 2, 3, 4, 5}
 * Output: 15
 * Explanation: Distinct elements are 1, 2, 3
 * 4, 5. So sum is 15.
 * Example 2:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {5, 5, 5, 5, 5}
 * Output: 5
 * Explanation: Only Distinct element is 5.
 * So sum is 5.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function findSum() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
 * <p>
 * ************************* Oxigen Wallet ********************************
 */
public class SumOfDistinctElements {
    int findSum(int arr[], int n) {
        // code here
        // find distinct element
        // do sum
        int sum = 0;
        Set<Integer> distinct = new HashSet<>();
        for (int i = 0; i < n; i++) {
            distinct.add(arr[i]);
        }
        for (int value : distinct) {
            sum = sum + value;
        }
        return sum;
    }
}
// ================== fix it =============== now