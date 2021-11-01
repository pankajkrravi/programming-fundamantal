package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/1/21 8:41 PM
Given a struct array of type Height, having two elements feet and inches. Find the maximum height among n heights, where height is calculated sum of feet and inches after converting feet into inches.

Example 1:

Input:
n = 2
h1 -> 1 2
h2 -> 2 1
Output:
25
Explanation:
(1, 2) and (2, 1) are respective given heights.
After converting both heigths in to inches,
we get 14 and 25 as respective heights.
So, 25 is the maximum height.

Your Task: Your task is to only complete the function of find maximum height from given array.
 ******************************************  Microsoft ******************************8
 */
public class MaximumInStructArray {
    int findMax(Height arr[], int n)
    {
        int max=12*arr[0].feet+arr[0].inches;
        int h;
        for(int i=0;i<n;i++){
            h=12*arr[i].feet+arr[i].inches;
            if(h>max){
                max=h;
            }
        }
        return max;
    }
}
