package com.java.hackerrank.GFG.collection;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 10/30/21 10:43 AM
Given an array arr[] of size, N. Find the subarray with maximum XOR. A subarray is a contiguous part of the array.

Example 1:
Input:
N = 4
arr[] = {1,2,3,4}
Output: 7
Explanation:
The subarray {3,4} has maximum xor
value equal to 7.
 */
public class MaximumXORSubarray {

    static int maxSubarrayXOR(int N, int arr[]){
        // code here
            int resp=0;
          if (N  ==2) {
              if (arr[0] > arr[1])
                  resp= arr[0];
              else
                  resp= arr[1];
          }else {
              Arrays.sort(arr);
              resp = arr[N - 2] + arr[N - 1];
          }
        return  resp;
    }

    public static void main(String[] args) {
        System.out.print(maxSubarrayXOR(4,new int[]{1,2,3,4}));
    }
}
