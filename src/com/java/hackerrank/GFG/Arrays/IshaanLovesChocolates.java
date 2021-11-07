package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/7/21 7:59 PM
As we know, Ishaan has a love for chocolates. He has bought a huge chocolate bar that contains N chocolate squares. Each of the squares has a tastiness level which is denoted by an array A[].
Ishaan can eat the first or the last square of the chocolate at once. Ishaan has a sister who loves chocolates too and she demands the last chocolate square. Now, Ishaan being greedy eats the more tasty square first.
Determine the tastiness level of the square which his sister gets.

Example 1:

â€‹Input : arr[ ] = {5, 3, 1, 6, 9}
Output : 1
Explanation:
Initially: 5 3 1 6 9
In first step: 5 3 1 6
In Second step: 5 3 1
In Third step: 3 1
â€‹In Fourth step: 1
â€‹â€‹Return 1

 */
public class IshaanLovesChocolates {

    // Function for finding maximum and value pair
    public static int chocolates (int arr[], int n) {
        //Complete the function
        int min=arr[0];
        for (int i=0;i<n;i++){
            if (min>arr[i])
                min =arr[i];
        }
        return min;
    }
}
