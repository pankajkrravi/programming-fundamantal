package com.java.hackerrank.ForkJava.Module5;

import java.util.HashSet;

/**
 * @Author pankaj
 * @create 11/21/21 11:55 PM
You are given an array A of size N, and you are also given a sum. You need to find if two numbers in A exists that have sum equal to the given sum.

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains three lines of input. The first line contains N denoting the size of the array A. The second line contains N elements of the array. The third line contains element sum.

Output Format:
For each testcase, in a new line, print the required output.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function sumExists().

Constraints:
1 <= T <= 100
1 <= N <= 1000
1 <= Ai <= 106

Examples:
Input:
1
10
1 2 3 4 5 6 7 8 9 10
14
Output:
1
 */
public class PairSumExistenceRevisited {
    public static int sumExists(int arr[], int n, int sum)
    {
        // your code here
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(sum-arr[i])){
                return 1;
            }
            else{
                hs.add(arr[i]);
            }
        }
        return 0;
    }
}
