package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/24/21 9:23 AM
**********************************   Morgan Stanley, Rockstand ********************* */
public class SwapKthElements {
    void swapKth(int arr[], int n, int k) {
        // code here
        int ref;
        ref =arr[k-1];
      arr[k-1] =arr[n-k] ;
       arr[n-k] = ref;
    }
}
