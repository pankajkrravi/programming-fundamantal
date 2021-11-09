package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author pankaj
 * @create 11/9/21 2:58 PM
You have records of employee name as string (Ename) and salary as positive integer (S). You have to sort the records on the basis of employee salary, if salary is same then use employee name for comparison.

Example 1:

Input: N = 2
arr[] = {{xbnnskd, 100}, {geek, 50}}
Output: {geek 50}, {xbnnskd 100}
Explanation: geek has lowest salary
as 50 and xbnnskd has more salary.
Example 2:

Input: N = 2
arr[] = {{shyam, 50}, {ram, 50}}
Output: ram 50 shyam 50
Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function sortRecords() that takes array arr[] and integer N as parameters and sort the array according to the above-given conditions. The function does not return anything.



Expected Time Complexity: O(NlogN).
Expected Auxiliary Space: O(1).

 ************************************   Oracle ************************************
 */
public class SortingEmployees {
    void sortRecords(node arr[],int n) {
        // Your code goes here == code working fine - change java 1.7 to 8
       /* Arrays.sort(arr, (a, b) -> {
            int val = (a.salary - b.salary);
            if (val == 0) {
                return a.name.compareTo(b.name);
            }

            return val;
        });*/
    }
}
