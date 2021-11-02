package com.java.hackerrank.GFG.puzzles;

/**
 * @Author pankaj
 * @create 11/2/21 9:17 PM
Given an array A of size N, construct a Sum Array S(of same size) such that S is equal to the sum of all the elements of A except A[i]. Your task is to complete the function SumArray(A, N) which accepts the array A and N(size of array).

Example 1:

Input:
5
3 6 4 8 9
Output: 27 24 26 22 21
Explanation: For the sum array S, at i=0 we
have 6+4+8+9. At i=1, 3+4+8+9. At i=2, we
have 3+6+8+9. At i=3, we have 3+6+4+9. At
i = 4, we have 3+6+4+8. So S is 27 24 26 22 21.
Example 2:

Input:
6
4 5 7 3 10 1
Output: 26 25 23 27 20 29
User Task:
Since this is a functional problem you did not have to worry about the input and output. You just have to complete the function SumArray() by storing arr[i]=S-arr[i]


 */
public class SumArrayPuzzle {
    public static void SumArray(int arr[], int n) {
        // your code here

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            int x=sum-arr[i];
            System.out.print(x+" ");
        }
    }
}
