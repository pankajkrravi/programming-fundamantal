package com.java.hackerrank.GFG.companyTag;

/**
 * @Author pankaj
 * @create 1/13/22 4:03 PM
 * You are given an integer N. You need to convert all zeroes of N to 5.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 1004
 * Output: 1554
 * Explanation: There are two zeroes in 1004
 * on replacing all zeroes with "5", the new
 * number will be "1554".
 * Example 2:
 * <p>
 * Input:
 * N = 121
 * Output: 121
 * Explanation: Since there are no zeroes in
 * "121", the number remains as "121".
 * Your Task:
 * Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.
 * <p>
 * Expected Time Complexity: O(K) where K is the number of digits in N
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1 <= n <= 10000
 */
public class ReplaceAll0swith5 {
    int convertfive(int num) {
        return Integer.parseInt(String.valueOf(num).replaceAll("0", "5"));
    }
}