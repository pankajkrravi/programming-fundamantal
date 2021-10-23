package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 6:32 PM
 */
public class JavaArraysAverage1 {
    String average(int A[], int N) {
            double sum=0;
            int i=0;
            while (i<N){
                sum =sum +A[i];
                i++;
            }
            return String.format("%.2f",sum/N);
    }

    public static void main(String[] args) {
        System.out.println(new JavaArraysAverage1().average(new int[]{1,2,3,4,5},5));
    }
}
