package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 1:56 PM
 */
public class CountOfSmallerElements {
    public long countOfElements(long arr[], long n, long x) {
         long count=0;
         for(int i=0;i<n;i++){
             if (arr[i] <= x)
                 count++;
         }
         return count;
    }
    public static void main(String[] args) {
        System.out.println(new CountOfSmallerElements().countOfElements(new long[]{1,2,4,5,8,10},6,9));
    }
}
