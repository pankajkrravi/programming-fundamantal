package com.java.hackerrank.DaysOfCoding.day3;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/30/21 3:17 PM
 * Given an array of size N, find the smallest positive integer value that cannot be represented as sum of some elements from the array.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 6
 * array[] = {1, 10, 3, 11, 6, 15}
 * Output:
 * 2
 * Explanation:
 * 2 is the smallest integer value that cannot
 * be represented as sum of elements from the array.
 * Example 2:
 * <p>
 * Input:
 * N = 3
 * array[] = {1, 1, 1}
 * Output:
 * 4
 * Explanation:
 * 1 is present in the array.
 * 2 can be created by combining two 1s.
 * 3 can be created by combining three 1s.
 * 4 is the smallest integer value that cannot be
 * represented as sum of elements from the array.
 * <p>
 * Your Task:
 * You dont need to read input or print anything. Complete the function smallestpositive() which takes the array and N as input parameters and returns the smallest positive integer value that cannot be represented as sum of some elements from the array.
 * <p>
 * <p>
 * Expected Time Complexity: O(N * Log(N))
 * Expected Auxiliary Space: O(1)
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 106
 * 1 ≤ array[i] ≤ 109
 * Array may contain duplicates.
 */
public class SmallestPositiveIntegerthatcannotberepresentedasSum {
    long smallestpositive(long[] array, int n) {
        // Your code goes here
        Arrays.sort(array);
        long result = 1;
        int i = 0;
        while (i < n && array[i] <= result) {
            result = result + array[i++];
        }
        return result;
    }
}
// ======================= VVI =====================