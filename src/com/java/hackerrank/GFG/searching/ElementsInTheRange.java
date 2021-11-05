package com.java.hackerrank.GFG.searching;

/**
 * @Author pankaj
 * @create 11/5/21 5:31 PM
 * Given an array arr[] containing positive elements. ‘A’ and ‘B’ are two numbers defining a range. The task is to check if the array contains all elements in the given range.
 * <p>
 * Example 1:
 * <p>
 * Input: N = 7, A = 2, B = 5
 * arr[] =  {1, 4, 5, 2, 7, 8, 3}
 * Output: Yes
 * Explanation: It has elements between
 * range 2-5 i.e 2,3,4,5
 * Example 2:
 * <p>
 * Input: N = 7, A = 2, B = 6
 * arr[] = {1, 4, 5, 2, 7, 8, 3}
 * Output: No
 * Explanation: Array does not contain 6.
 * <p>
 * Your Task:
 * This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function check_elements() that takes array arr, integer N, integer A, and integer B  as parameters and returns the boolean True if array elements contain all elements in the given range else boolean False.
 * <p>
 * Note: If the array contains all elements in the given range then driver code outputs Yes otherwise, it outputs No
 * <p>
 * ************************************* Amazon ***************************************
 */
public class ElementsInTheRange {
    boolean check_elements(long arr[], int n, int A, int B) {
        while (A<=B){
            boolean in_Range =true;
            for (int i = 0; i < n; i++) {
                if (arr[i] == A) {
                    in_Range = false;
                    break;
                }
            }
            A++;
            if (in_Range)
                return false;
        }
        return true;
    }
}


