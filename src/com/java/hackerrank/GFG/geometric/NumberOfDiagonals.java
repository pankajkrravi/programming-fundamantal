package com.java.hackerrank.GFG.geometric;

/**
 * @Author pankaj
 * @create 10/31/21 5:11 PM
Given a number N, the task is to find the number of diagonals in N sided convex polygon.

Example 1:
Input: N = 5
Output: 5

Example 2:
Input: N = 6
Output: 9

Your Task:
You don't need to read input or print anything. Your task is to complete the function diagonals() which takes N
as input and returns the number of possible diagonals*/

public class NumberOfDiagonals {
    public long diagonals(int n)
    {
        //code here.
        return n*(n-3)/2;

    }
}
