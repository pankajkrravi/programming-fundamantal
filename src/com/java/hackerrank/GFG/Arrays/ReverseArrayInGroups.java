package com.java.hackerrank.GFG.Arrays;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 11/1/21 6:10 PM
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.



Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.


Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9


Your Task:
You don't need to read input or print anything. The task is to complete the function reverseInGroups() which
takes the array, N and K as input parameters and modifies the array in-place.

 ***********************  Adobe ************************************/
public class ReverseArrayInGroups {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int a=n;
        int b=0;
        while(a>k){
            reverse(arr,b,b+k-1);
            b+=k;
            a-=k;
        }
        reverse(arr,b,n-1);
    }
    void reverse(ArrayList<Integer> a, int m, int c){
        while(m<c){
            int s=a.get(m);
            a.set(m,a.get(c));
            a.set(c,s);
            m++;
            c--;
        }
    }
}
