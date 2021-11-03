package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/3/21 1:16 PM
Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

Example 1:

Input:
N = 7
Arr[] = {1, 2, 3, 2, 3, 1, 3}
Output: 3

Example 2:

Input:
N = 7
Arr[] = {5, 7, 2, 7, 5, 2, 5}
Output: 5

Your Task:
You don't need to read input or print anything. Your task is to complete the function getOddOccurrence() which takes arr[] and n as input parameters and returns the exceptional number.

 ***************************************  Amazon Snapdeal ************************
 */
public class ExceptionallyOdd {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        int count =0;
        for (int i=0;i<n;i++){
            count =count^arr[i]; // XOR, if two values are same then it becomes 0
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(new ExceptionallyOdd().getOddOccurrence(new int[]{1,2,3,2,3,1,3},7));
    }
}
