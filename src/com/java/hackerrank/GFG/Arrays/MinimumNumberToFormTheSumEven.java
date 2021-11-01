package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/1/21 10:29 PM
 */
public class MinimumNumberToFormTheSumEven {

    long minNum(long A[], int N) {
        // Your code goes here
            long sum=0;
        for (int i=0;i<N;i++){
                sum+= A[i];
            }   if (sum%2 ==0)
                return 2;
        return  1;
    }
}
