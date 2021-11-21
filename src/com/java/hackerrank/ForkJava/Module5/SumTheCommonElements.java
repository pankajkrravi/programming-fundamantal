package com.java.hackerrank.ForkJava.Module5;

import java.util.HashSet;

/**
 * @Author pankaj
 * @create 11/21/21 10:58 AM
You are given two arrays of size n1 and n2. Your task is to find all the elements that are common to both the arrays and sum them print them in the order as they appear in the second array. If there are no common elements the output would be 0.

Note: The arrays may contain duplicate elements. However, you need to sum only unique elements that are common to both arrays.

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two three lines of input. The first line contains n1 and n2 separated by a space. The second line contains elements of arr1. The third line contains elements of arr2.

Output Format:
For each testcase, in a new line, print the common sum.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function commonSum that takes two arrays as input.

Constraints:
1 <= T <= 100
1 <= n1,n2 <= 1000
1 <= arr1i,arr2i <= 109

Example:
Input:
1
5 6
1 2 3 4 5
2 3 4 5 6 7
Output:
14
 */
public class SumTheCommonElements {
    public static long commonSum(int arr1[], int arr2[]) {
        //Your code here
            int sum =0;
        HashSet<Integer> hashSet =new HashSet<>();

        for (int v: arr1) {
            hashSet.add(v);
        }
        for (int v: arr2) {
            if (hashSet.contains(v)){
                hashSet.remove(v);
                sum+= v;
            }
        }
        return sum;
            /*for (int i=0;i<arr1.length;i++){
                hashSet.add(arr1[i]);
            }
            for (int j=0;j<arr2.length;j++){
                if (hashSet.contains(arr2[j]));
                {
                    hashSet.remove(arr2[j]);
                    sum += arr2[j];
                }
            }*/

    }
}
