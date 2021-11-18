package com.java.hackerrank.ForkJava.Module2;

/**
 * @Author pankaj
 * @create 11/17/21 7:27 AM
Now, as you're familiar with operating on arrays, let's do an intricate task. Here, we'll do swapping of array elements.

Given an array A of N positive integers. The task is to swap every ith element of the array with (i+2)th element.

Input Format:
First line of input contains number of testcase T. For each testcase, there will be two lines, first of which contains size of array N and next line contains N space seperated positive integers.

Output Format:
For each testcase, print the modified array.

Constraints:
1 <= T <= 100
3 <= N <= 106
1 <= Ai <= 106

User Task:
Your task is to complete the function swapElements(), which should swap each ith element with (i+2)th element.

Example:
Input:
1
5
1 2 3 4 5

Output:
3 4 5 2 1

Explanation:
Testcase 1: Swapping 1 and 3, makes the array 3 2 1 4 5. Now, swapping 2 and 4, makes the array 3 4 1 2 5. Again, swapping 1 and 5, makes the array 3 4 5 2 1.
 */
public class NeedSomeChange {
    static void swapElements(int arr[], int sizeof_array){

        int temp;

        for (int i = 0; i < sizeof_array - 2; i++) {
            temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }

    public static void main(String[] args) {
        swapElements(new int[]{1,2,3,4,5},5);
    }
}
