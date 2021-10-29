package com.java.hackerrank.GFG.BinarySearch;

/**
 * @Author pankaj
 * @create 10/29/21 11:37 AM
Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.
 ***************************** Paytm ***********************************888*/
public class SearchingAnElementInSortedArray {
    static int searchInSorted(int arr[], int N, int K) {
              /* // Solution -- 1
                for (int i=0;i<N;i++){
                    if (K == arr[i]) {
                        return 1;
                    }
                }
                return -1;*/
        // Solution -- 2
        int left =0;
        int right =N-1;
        while (left<=right){
            int middle =(left+right)/2;
            if (arr[middle] == K)
                return 1;
            else if (K <arr[middle])
                right =middle-1;
            else
                left = middle+1;
        }
        return -1;
    }
}
