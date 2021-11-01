package com.java.hackerrank.GFG.searching;

/**
 * @Author pankaj
 * @create 11/1/21 1:28 PM
 * Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * arr[] = {1 2 3 4 5}
 * K = 4
 * Output: 3
 * Explanation: 4 appears at index 3.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 5
 * arr[] = {11 22 33 44 55}
 * K = 445
 * Output: -1
 * Explanation: 445 is not present.
 * <p>
 * Your Task:
 * You dont need to read input or print anything. Complete the function binarysearch() which takes arr[], N and
 * K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.
 *
 *************** **********Accenture,Cognizant,Infosys,Linkedin,Oracle, Qualcomm,TCS,Wipro *************** */
public class BinarySearch {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0;
        int end = n - 1;
        int middle = 0;
        while (start <= end) {
            middle = (start + end) / 2;
            if (arr[middle] == k)
                return middle;
            else if (k < arr[middle])
                end = middle - 1;
            else
                start = middle + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(new BinarySearch().binarysearch(new int[]{1, 2, 3, 4, 5}, 5, 4));
    }
}
