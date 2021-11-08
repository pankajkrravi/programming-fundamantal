package com.java.hackerrank.GFG.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/8/21 9:49 PM
You are given two arrays, A and B, of equal size N. The task is to find the minimum value of A[0] * B[0] + A[1] * B[1] +…+ A[N-1] * B[N-1], where shuffling of elements of arrays A and B is allowed.


Example 1:

Input:
N = 3
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23
Explanation:
1*6+1*5+3*4 = 6+5+12
= 23 is the minimum sum


Example 2:

Input:
N = 5
A[] = {6, 1, 9, 5, 4}
B[] = {3, 4, 8, 2, 4}
Output:
80
Explanation:
2*9+3*6+4*5+4*4+8*1
=18+18+20+16+8
= 80 is the minimum sum


Your Task:
You don't need to read input or print anything. Your task is to complete the function minValue() which takes the arrays A[], B[] and its size N as inputs and returns the minimum sum.



Expected Time Complexity: O(N. log(N))
Expected Auxiliary Space: O(1)
 */
public class MinimizeTheSumOfProduct {
    public long minValue(long a[], long b[], long n)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n/2;i++){
            long temp = b[i];
            b[i] = b[(int)n-i-1];
            b[(int)n-i-1] = temp;
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += (a[i]*b[i]);
        }
        return sum;
    }
}
