package com.java.hackerrank.ForkJava.Module5;

import java.util.*;

/**
 * @Author pankaj
 * @create 11/21/21 8:59 PM

You are given an array A of size N. The array contains almost distinct elements with some duplicated. You have to print the elements in sorted order which appears more than once.

Input Format:
The first line of input contains T, denoting the number of testcases. T testcases follow. Each testcase contains two lines of input.  The first line of input contains size of array N. The second line contains N integers separated by spaces.

Output Format:
For each test case, in a new line, print the required answer. If there are no duplicates print -1.

Your Task:
Your task is to complete the function SortedDuplicates(arr, n) which accepts array and its size as an argument.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Ai <= 106

Examples:
Input:
1
9
3 4 5 7 8 1 2 1 3
Output:
1 3
 */
public class DuplicateElements {
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n) {
            //Your code here
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (tm.containsKey(arr[i])) {
                    tm.put(arr[i], tm.get(arr[i]) + 1);
                } else
                    tm.put(arr[i], 1);
            }
            boolean containsDup = false;
            for (Map.Entry<Integer, Integer> e : tm.entrySet()) {
                if (e.getValue() > 1) {
                    System.out.print(e.getKey() + " ");
                    containsDup = true;
                }
            }
            if (!containsDup) {
                System.out.print(-1);
            }
        }
    }