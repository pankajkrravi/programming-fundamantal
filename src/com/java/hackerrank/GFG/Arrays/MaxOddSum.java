package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/9/21 3:22 PM
 * Given an array of integers, check whether there is a subsequence with odd sum and if yes, then finding the maximum odd sum. If no subsequence contains odd sum, print -1.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N=4
 * arr[] = {4, -3, 3, -5}
 * Output: 7
 * Explanation:
 * The subsequence with maximum odd
 * sum is 4 + 3 = 7
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N=5
 * arr[] = {2, 5, -4, 3, -1}
 * Output: 9
 * Explanation:
 * The subsequence with maximum odd
 * sum is 2 + 5 + 3 + -1 = 9
 * <p>
 * Your Task:
 * Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function findMaxOddSubarraySum() that takes array arr and integer N as parameters and returns the desired value.
 */
public class MaxOddSum {
    long findMaxOddSubarraySum(long arr[], long n) {
        boolean isOdd = false;
        long sum = 0;
        long min_odd = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0)
                sum = sum + arr[i];

            if (arr[i] % 2 != 0) {
                isOdd = true;
                if (min_odd > Math.abs(arr[i]))
                    min_odd = Math.abs(arr[i]);
            }
        }

        if (isOdd == false)
            return -1;

        if (sum % 2 == 0)
            sum = sum - min_odd;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new MaxOddSum().findMaxOddSubarraySum(new long[]{2, 5, -4, 3, -1}, 5));
    }
}
