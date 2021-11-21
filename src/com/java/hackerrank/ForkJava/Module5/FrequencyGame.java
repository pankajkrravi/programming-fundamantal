package com.java.hackerrank.ForkJava.Module5;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/21/21 11:53 PM
Given an array A of size N. The elements of the array consists of positive integers. You have to find the largest element with minimum frequency.

Input Format: First line of input contains number of testcases T. For each testcase there will be two lines. First line contains N, next line contains N elements separated by spaces.

Output Format: For each testcase, print the largest element with minimum frequency.

User Task:
Your task is to complete the provided function LargButMinFreq(A, n) which accepts array A and n. Hence you have to return the largest element with minimum frequency.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
1
5
2 2 5 50 1

Output:
50

Explanation :
Testcase 1: All elements are having frequency 1 except 2. 50 is the maximum element with minimum frequency.

Note: use HashMap to compute the element and its frequency.
 */
public class FrequencyGame {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        int count=0;
        Arrays.sort(arr);

        for(int i=n-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                return arr[i];
            }
        }
        return 0;
    }
}
