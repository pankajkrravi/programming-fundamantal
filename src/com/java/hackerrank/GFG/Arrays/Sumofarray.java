package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 6:18 PM
 */
public class Sumofarray {
    public long getSum(long a[], long n)
    {
        // Your code goes here
            int i=0;
            long sum=0;
            while (i<n) {
                sum =sum+a[i];
                i++;
            }
            return sum;
    }
}
