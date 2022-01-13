package com.java.hackerrank.GFG.companyTag;

/**
 * @Author pankaj
 * @create 1/12/22 12:16 AM
 */
public class SolutionPeakEle {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    int peakElement(int arr[], int n) {
        int start = 0;
        int end = n -1;
        int mid = start + (end - start)/2;
        while (start < end){
            if (arr[mid]  < arr[mid + 1] ){
                start = mid +1;
            }else{
                end = mid;
            }
            mid = start + (end - start)/2;
        }
        return start;
    }
}
