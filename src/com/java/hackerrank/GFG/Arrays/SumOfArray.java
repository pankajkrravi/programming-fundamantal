package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 12:08 PM
 */
public class SumOfArray {
    int sum(int arr[], int n) {
        // code here
        int i=0,sum=0;
       while (i< n){
           sum = sum+arr[i];
           i++;
       }
       return sum;
    }

    public static void main(String[] args) {
        System.out.println(new SumOfArray().sum(new  int[]{1,2,3,4},4));
    }
}
