package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/6/21 4:58 PM
 * Given an array A of N integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,…., n – 1.
 * You are allowed to rearrange the elements of the array.
 * Note: Since output could be large, hence module 109+7 and then print answer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input : Arr[] = {5, 3, 2, 4, 1}
 * Output : 40
 * Explanation:
 * If we arrange the array as 1 2 3 4 5 then
 * we can see that the minimum index will multiply
 * with minimum number and maximum index will
 * multiply with maximum number.
 * So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 = 40 mod(109+7) = 40
 * <p>
 * Example 2:
 * <p>
 * Input : Arr[] = {1, 2, 3}
 * Output : 8
 * <p>
 * <p>
 * Your Task:
 * This is a function problem. The input is already taken care of by the driver code. You only need to complete the function Maximize() that takes an array (arr), sizeOfArray (n), and return the maximum value of an array. The driver code takes care of the printing.
 * <p>
 * ************************************ SAP Labs ****************************
 */
public class MaximizeSumOfAnArray {
    int Maximize(int arr[], int n) {
        // Complete the function
        Arrays.sort(arr);
        long sum = 0;
        int mod = (int)1e9+7;
        for (int i = 0; i < n; i++) {
            sum = (sum + (long)arr[i] * i) % mod;

        }
        return (int) sum;
    }
}
