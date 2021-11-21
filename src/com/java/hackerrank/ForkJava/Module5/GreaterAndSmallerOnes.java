package com.java.hackerrank.ForkJava.Module5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author pankaj
 * @create 11/21/21 4:11 PM
 * Given an unsorted array A of size N and value K. The elements of the array A contains positive integers. You have to print all the elements which are greater than K in the array(including K as well if present in the array A), and print all the elements which are smaller than K in seperate lines. If the elements greater than K does not present in the array then print "-1". Similarly, in case of smaller elements print -1 if elements smaller than k doesn’t exist.
 * <p>
 * Input Format:
 * First line of input contains number of testcases T. For each testcase, there are two lines, first of which contains N and K seperated by space, next line contains N space seperated integers.
 * <p>
 * Output Format:
 * For each testcase, print the required elements(if any), else print "-1" (without quotes).
 * <p>
 * Your Task:
 * Since this is a function problem, you don't need to take any input. Just complete the provided greaterKSorted and smallerKSorted functions that takes two input one is array and second is K.
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 103
 * 1 <= K <= 106
 * 1 <= A[i] <= 106
 * <p>
 * Example:
 * Input:
 * 1
 * 5 1
 * 2 1 5 7 6
 * <p>
 * Output:
 * 1 2 5 6 7
 * -1
 * <p>
 * Explanation:
 * Testcase 1 : Since, 1, 2, 5, 6, 7 are greater or equal to given K. Also, no element less than K is present in the array.
 */
public class GreaterAndSmallerOnes {
    // Function to find elements greater than or equal to K
    public static void greaterKSorted(int arr[], int k) {
        // Your code here
        TreeSet<Integer> ts = new TreeSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ts.add(arr[i]);
        }

        boolean notPresent = true;
        Iterator<Integer> i = ts.iterator();

        while (i.hasNext()) {
            int temp = i.next();
            if (temp > k) {
                System.out.print(temp + " ");
                notPresent = false;
            }
        }
        if (notPresent)
            System.out.print(-1);
    }

    // Function to find element less than K
    public static void smallerKSorted(int arr[], int k)
    {
        // Your code here
        TreeSet<Integer> ts = new TreeSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            ts.add(arr[i]);
        }

        boolean notPresent = true;
        Iterator<Integer> i = ts.iterator();

        while (i.hasNext())
        {
            int temp = i.next();
            if(temp < k)
            {
                System.out.print(temp + " ");
                notPresent = false;
            }
        }
        if(notPresent)
            System.out.print(-1);
    }
}
 //    // Function to find elements greater than or equal to K
//    public static void greaterKSorted(int arr[], int k) {
//        // Your code here
//        Arrays.sort(arr);
//        boolean isPresent = true;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > k)
//                System.out.print(arr[i] + " ");
//            isPresent = false;
//        }
//        if (isPresent)
//            System.out.print(-1);
//    }
//
//    // Function to find element less than K
//    public static void smallerKSorted(int arr[], int k) {
//        // Your code here
//        Arrays.sort(arr);
//        boolean isPresent = true;
//        for (int v : arr) {
//            if (v < k)
//                System.out.print(v + " ");
//        }
//        if (isPresent)
//            System.out.print(-1);
//