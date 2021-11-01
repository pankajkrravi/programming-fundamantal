package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/1/21 5:23 PM
 * Given an array of distinct elements. Find the third largest element in it.
 * <p>
 * Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * A[] = {2,4,1,3,5}
 * Output: 3
 * Example 2:
 * <p>
 * Input:
 * N = 2
 * A[] = {10,2}
 * Output: -1
 * Your Task:
 * Complete the function thirdLargest() which takes the array a[] and the size of the array, n, as input parameters and returns the third largest element in the array. It return -1 if there are less than 3 elements in the given array.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * ******************************************   Amazon Microsoft MakeMyTrip  ************************
 */
public class ThirdLargestElement {
    int thirdLargest(int a[], int n) {
       /* // Your code here
        // approach sort array
        //return arr[n-3]
           if (n<=2) return -1;
           else{
        for (int i = 0; i < n-1; i++) {

            if (a[i] > a[i + 1]) {
                int temp = a[i ];
               a[i] =   a[i + 1];
                a[i+1] = temp;
            }
        }
     }
        return a[n-3];*/ // need fix for this =====================================

        if (n<=2)
            return -1;
        else
            Arrays.sort(a);
        return a[n-3];
    }

    public static void main(String[] args) {
        System.out.println(new ThirdLargestElement().thirdLargest(new int[]{2,4,1,3,5},5));
        System.out.println(new ThirdLargestElement().thirdLargest(new int[]{10,2},2));
        System.out.println(new ThirdLargestElement().thirdLargest(new int[]{18,21,10,24,27,5},6));

    }
}
