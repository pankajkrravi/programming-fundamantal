package com.java.hackerrank.ForkJava.Module2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pankaj
 * @create 11/18/21 4:54 PM
Given an arry A (may contain duplicates) of N elements and a positive integer K. The task is to count the number of elements which occurs exactly floor(N/K) times in the array.


Example 1:

Input:
5 2
1 4 1 2 4
Output:
2
Explanation:
In the given array, 1 and
4 occurs floor(5/2) = 2
times. So count is 2.
Example 2:

Input:
3 2
99 66 66
Output:
1
Explanation:
In the given array, 99 occurs
floor(3/2) = 1 time. So count
is 1.
Your Task:
You don't have to read input or print anything. Your task is to complete the function countSpecials() which should count the elements which occurs exactly floor(N/K) times.

 */
public class CountTheSpecials {
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        int count = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i = 0; i< n; i++){
            if(hMap.containsKey(a[i])){
                hMap.replace(a[i] , hMap.get(a[i]) +1);
            }else{
                hMap.put(a[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> e: hMap.entrySet()){
            if(e.getValue()==f)
                ++count;
        }
        System.out.println(count);

    }
}
