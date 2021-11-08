package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/8/21 10:05 PM
Like people, numbers are also friends with each other. Friendliness between any two numbers a and b is defined as the absolute difference between the two. Lower is this number more friendly the numbers are. Now you are given an array of numbers and you are required to find the friendliness of this array. This can be calculated as the sum of the friendliness of each element in the array with its closest friend in the same array.

Example 1:

Input:
N=3
arr[] = { 4,1,5 }
Output: 5
Explanation: Sum of absolute differences is
|4-5| + |1-4| + |5-4| = 5
Example 2:

Input:
N=3
arr[] = { 1,1,1 }
Output: 0
Explanation: Sum of absolute differences is
|1-1| + |1-1| + |1-1| = 0

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function sumOfMinAbsDifferences() that takes array arr and integer N as parameters and return the value of friendliness for the given array.
 */
public class FriendlyArray {
    long sumOfMinAbsDifferences(long arr[] ,int n)
    {

        long sum=0;
        Arrays.sort(arr);
        sum+= Math.abs(arr[0]-arr[1]);
        for(int i=1;i<n-1;i++){
            long x = arr[(int)i-1];
            long y = arr[(int)i+1];
            long z = arr[(int)i];
            long diff1 = Math.abs(x-z);
            long diff2 = Math.abs(y-z);
            sum+= Math.min(diff1, diff2);
        }
        sum+= Math.abs(arr[n-2]-arr[n-1]);
        return sum;

    }
}
