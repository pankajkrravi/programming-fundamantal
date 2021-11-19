package com.java.hackerrank.ForkJava.Module3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author pankaj
 * @create 11/19/21 7:05 PM
Let's learn about Java Classes and how they can be useful.

Given an array A of N pairs of integers. The task is to sort the array on the basis of first element.

Hint: You may write a custom comparator. Read here.

Example 1:

Input:
3
1 2 5 4 3 6

Output:
1 2 3 6 5 4

Explanation:
Pairs are (1, 2), (5, 4), (3, 6). Sorting them on
basis of first element, we have (1, 2), (3, 6), (5, 4).
Example 2:

Input:
2
4 8 2 24

Output:
2 24 4 8

Explanation:
Pairs are (4, 8), (2, 24). Sorting them on
basis of first element, we have (4, 8), (2, 24).
 */
public class PairinJava {
    // Compare function
    static void sortPairs(Pair arr[], int N){

        // Your code here
        Arrays.sort(arr, Comparator.comparingInt(p -> p.x));

        //printing the x,y Pairs
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}
