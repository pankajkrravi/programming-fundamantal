package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/8/21 9:09 PM
 * Given an array Arr of size N, the array contains numbers in range from 0 to K-1 where K is a positive integer and K <= N. Find the maximum repeating number in this array. If there are two or more maximum repeating numbers return the element having least value.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4, K = 3
 * Arr[] = {2, 2, 1, 2}
 * Output: 2
 * Explanation: 2 is the most frequent
 * element.
 * Example 2:
 * <p>
 * Input:
 * N = 6, K = 3
 * Arr[] = {2, 2, 1, 0, 0, 1}
 * Output: 0
 * Explanation: 0, 1 and 2 all have same
 * frequency of 2.But since 0 is smallest,
 * you need to return 0.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function maxRepeating() which takes the array of integers arr, n and k as parameters and returns an integer denoting the answer.
 * <p>
 * ************************  Accolite Amazon *************************8
 */
public class MaximumRepeatingNumber {
    int maxRepeating(int[] arr, int n, int k) {
        // code here
        int h[] = new int[k];
        for(int i=0;i<n;i++)
        {
            h[arr[i]]++;
        }

        int res = 0;
        int freq = Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            if(h[i] > freq)
            {
                res = i;
                freq = h[i];
            }
        }
        return res;
    }
}
