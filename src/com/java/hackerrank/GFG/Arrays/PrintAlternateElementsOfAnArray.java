package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 10:14 AM
 */
public class PrintAlternateElementsOfAnArray {
    public static void print(int arr[], int n)
    {
        // your code here
        int i=0;
        while (i < n){
            System.out.print(arr[i]+" ");
            i= i+2;
        }
    }

    public static void main(String[] args) {
        print(new int[]{1,2,3,4},4);
    }
}
