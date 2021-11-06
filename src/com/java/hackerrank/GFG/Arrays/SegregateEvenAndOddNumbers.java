
package com.java.hackerrank.GFG.Arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author pankaj
 * @create 11/5/21 7:46 PM
 * Given an array Arr[], write a program that segregates even and odd numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 7
 * Arr[] = {12, 34, 45, 9, 8, 90, 3}
 * Output: 8 12 34 90 3 9 45
 * Explanation: Even numbers are 12, 34,
 * 8 and 90. Rest are odd numbers. After
 * sorting even numbers 8 12 34 90 and
 * after sorting odd numbers 3 9 45. Then
 * concat both.
 * Example 2:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {0, 1, 2, 3, 4}
 * Output: 0 2 4 1 3
 * Explanation: 0 2 4 are even and 1 3
 * are odd numbers.
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function segregateEvenOdd() which takes the array of integers arr[] and n as parameters and returns void. You need to modify the array itself.
 * <p>
 * *****************   Accolite Amazon Linkedin MakeMyTrip Paytm *****************
 */

public class SegregateEvenAndOddNumbers {
    void segregateEvenOdd(int arr[], int n) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }// sort even and odd
        Collections.sort(even);
        Collections.sort(odd);
        // store 1. even and 2. odd
        int evenSize = even.size();
        int oddSize = odd.size();
        for (int i = 0; i < evenSize; i++) {
            arr[i] = even.get(i);
        }//2. odd number store
        for (int t = 0; t < oddSize; t++) {
            arr[t + evenSize] = odd.get(t);
        }
    }


    // code here
        /*long right[] = new long[n];
        long product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product *= arr[i];
            right[i] = product;
        }
        product = 1;
        long[] resp = new long[n];
        for (int i = 0; i < n - 1; i++) {
            long left_prod = product;
            long right_prod = right[i+1];
            resp[i] = left_prod*right_prod;
            product*= resp[i];
        }
        resp[n-1]= product;*/


    public static void main(String[] args) {
        new SegregateEvenAndOddNumbers().segregateEvenOdd(new int[]{12, 34, 45, 9, 8, 90, 3}, 7);
    }
}

