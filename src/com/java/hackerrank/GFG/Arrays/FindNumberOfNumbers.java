package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/1/21 8:48 PM
 * Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.
 * <p>
 * For Example:
 * Input:
 * A[]={11,12,13,14,15}, k=1
 * Output:
 * 6
 * <p>
 * Explanation: Here digit 1 appers
 * the whole array 6 times.
 * Your Task:
 * <p>
 * You don't need to read input or print anything. Complete the function Num() which accepts an integer N and array A as input parameter and return the desire output
 */
public class FindNumberOfNumbers {

    public static int num(int a[], int n, int k) {
        //Your code here
        // 0 to last
        //get element value
        // digit %10 == k
        //count ++
        int count = 0;
        for (int i = 0; i < n; i++) {
            while (a[i] != 0) {
                if (a[i] % 10 == k)
                    count++;
                a[i] =a[i]/10;
            }
        }
        return count;
    }
}
