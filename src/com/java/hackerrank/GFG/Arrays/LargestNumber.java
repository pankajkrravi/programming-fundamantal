package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 4:03 PM
 */
public class LargestNumber {

    int largestNumber(int arr[], int n) {
        // code here
        int i=0;
        int largest=0;
        while (i < n-1){
            if (arr[i+1] < arr[i]){
                arr[i+1] =arr[i];
                largest =arr[i];
            }
            i++;
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(new LargestNumber().largestNumber(new int[] {12, 35, 1, 10, 34, 1},6));
       System.out.println(new LargestNumber().largestNumber(new int[] {10, 5, 10,66,100,600,05},7));

    }
}
