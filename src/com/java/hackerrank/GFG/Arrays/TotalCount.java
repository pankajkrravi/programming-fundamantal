package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/3/21 3:46 PM
 * Given an array Arr of N positive integers and a number K where K is used as a threshold value to divide each element of the array into sum of different numbers. Find the sum of count of the numbers in which array elements are divided.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4, K = 3
 * Arr[] = {5, 8, 10, 13}
 * Output: 14
 * Explanation: Each number can be expressed as sum
 * of different numbers less than or equal to K as
 * 5 (3 + 2), 8 (3 + 3 + 2), 10 (3 + 3 + 3 + 1),
 * 13 (3 + 3 + 3 + 3 + 1). So, the sum of count
 * of each element is (2+3+4+5)=14.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 5, K = 4
 * Arr[] = {10, 2, 3, 4, 7}
 * Output: 8
 * Explanation: Each number can be expressed as sum of
 * different numbers less than or equal to K as
 * 10 (4 + 4 + 2), 2 (2), 3 (3), 4 (4) and 7 (4 + 3).
 * So, the sum of count of each element is
 * (3 + 1 + 1 + 1 + 2) = 8.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function totalCount() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
 * <p>
 * ************************** Zoho *********************8
 */
public class TotalCount {
    int totalCount(int[] arr, int n, int k) {
        int sum = 0;
        // code here
        for (int i = 0; i < n; i++) {
            if (arr[i] % k > 0) {
                sum = sum + (arr[i] / k) + 1;
            } else
                sum = sum + arr[i] / k;
        }
        return sum;

     /*   int sum=0;
        for(int i=0;i<n;i++)
        {
            int x;
            if(arr[i]%k==0)
            {
                x=(arr[i]/k);
            }
            else
            {
                x=(arr[i]/k)+1;
            }
            sum=sum+x;
        }
        return sum;*/
    }
}
