package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 10/24/21 8:37 AM
  ------------------------------- Amazon --------------------------------------------------------*/
public class AtLeastTwoGreaterElements {
    public long[] findElements( long a[], long n) {
        // Your code goes here
        Arrays.sort(a);
        // Store array element from 0 to n-2 index
        long resultArray []  =new long[(int) n-2];
            for (int i=0;i<n-2;i++){
                resultArray[i] =a[i];
            }
            return resultArray;
    }

    public static void main(String[] args) {
        long [] arr=new AtLeastTwoGreaterElements().findElements(new long[]{2, 8, 7, 1, 5},5);
        for (long v: arr) {
            System.out.print(v+" ");
        }
    }
}
