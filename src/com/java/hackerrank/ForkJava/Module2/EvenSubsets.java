package com.java.hackerrank.ForkJava.Module2;

/**
 * @Author pankaj
 * @create 11/18/21 10:30 PM
As we mentioned earlier, bitwise operations can be used to find number of subsets. Here, we will use that.

Given an array A of N elements. The task is to count all the subsets whose sum is even.

Input Format:
For each testcase, first line of input contains number of testcases T. For each testcase, there will be two lines, first of which containing N and next line contains N space seperated positive integers.

Output Format:
For each testcase, print the count of subsets whose sum of all elements is even.

Constraints:
1 <= T <= 100
1 <= N <= 10
1 <= A[i] <= 10

User Task:
Your task is to complete the function countSumSubsets() which counts all the subsets in which sum of all the elements is even.

Example:
Input:
1
3
1 2 3

Output:
3

Explanation:
Testcase 1: Three subsets are there whose sum of elements is even. Subsets are (3, 2, 1), (1, 3), (2).*/
public class EvenSubsets {
    static int countSumSubsets(int arr[],int n)
    {

        int sl = (int)Math.pow(2,n);
        int count = 0;

        for(int i = 1; i < sl; i++) {
            int sum = 0;
            for(int j = 0 ; j < n; j++) {
                if((i & (1 << j)) == 1) {
                    sum += arr[j];
                }
            }
            if(sum%2 == 0) {
                count++;
            }
        }

        return count;

    }

}
