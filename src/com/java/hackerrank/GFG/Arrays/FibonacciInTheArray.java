package com.java.hackerrank.GFG.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 11/9/21 7:42 PM
Given an array arr of size N, the task is to count the number of elements of the array which are Fibonacci numbers

Example 1:

Input: N = 9, arr[] = {4, 2, 8, 5, 20, 1,
40, 13, 23}
Output: 5
Explanation: Here, Fibonacci series will
be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
Numbers that are present in array are
2, 8, 5, 1, 13
Example 2:

Input: N = 4, arr[] = {4, 7, 6, 25}
Output: 0
Explanation: No Fibonacci number in
this array.


Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function checkFib() that takes array arr and integer N as parameters and returns the desired output.
 */
public class FibonacciInTheArray {
    int checkFib(long a[] ,int n)
    {
        long max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max, a[i]);
        }

        List<Long> list = new ArrayList<>();
        list.add(0l);
        list.add(1l);
        while(list.get(list.size()-1) <= max)
        {
            list.add(list.get(list.size()-1) + list.get(list.size()-2));
        }

        int count = 0;

        for(int i=0;i<n;i++)
        {
            if(list.contains(a[i]))
                count++;
        }
        return count;
    }
}
