package com.java.hackerrank.GFG.Java;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 10/27/21 10:03 PM
 */
public class LargestElementInArray {
    public int largest(int arr[], int n) {
        /*Arrays.sort(arr);
                return arr[n-1];*/
        int largest = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] >largest)
                largest =arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
            System.out.println(new LargestElementInArray().largest(new int[]{1,8,7,56,90},5));
    }
}
