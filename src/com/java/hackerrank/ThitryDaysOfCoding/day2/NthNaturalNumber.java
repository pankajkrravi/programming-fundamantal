package com.java.hackerrank.ThitryDaysOfCoding.day2;

/**
 * @Author pankaj
 * @create 11/30/21 2:38 PM
 * Given a positive integer N. You have to find Nth natural number after removing all the numbers containing digit 9.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 8
 * Output:
 * 8
 * Explanation:
 * After removing natural numbers which contains
 * digit 9, first 8 numbers are 1,2,3,4,5,6,7,8
 * and 8th number is 8.
 * Example 2:
 * <p>
 * Input:
 * N = 9
 * Output:
 * 10
 * Explanation:
 * After removing natural numbers which contains
 * digit 9, first 9 numbers are 1,2,3,4,5,6,7,8,10
 * and 9th number is 10.
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Complete the function findNth() which accepts an integer N as input parameter and return the Nth number after removing all the numbers containing digit 9.
 * <p>
 * <p>
 * Expected Time Complexity: O(logN)
 * Expected Auxiliary Space: O(1)
 * <p>
 * *************************************** Google *****************************
 */
public class NthNaturalNumber {
    long findNth(long N) {
        //code here
        long res = 0;
        long tem = 1;
        while (N > 0) {
            res += tem * (N % 9);
            N /= 9;
            tem *= 10;
        }
        return res;
    }
}
 // ------------ too imp ---------------