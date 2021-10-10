package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/9/21 11:49 AM
 */
public class Mean {
    static int mean(int N , int[] A) {
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum= sum+A[i];
        }
        return sum/N;
    }
}
