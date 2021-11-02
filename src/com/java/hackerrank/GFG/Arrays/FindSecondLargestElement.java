package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/2/21 8:16 PM
 * Given an array of elements. Your task is to find the second maximum element in the array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N=5
 * arr[] = { 2, 4, 5, 6, 7 }
 * Output:  6
 * Explanation:
 * The largest element is 7 and
 * the second largest element is 6.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N=6
 * arr[] = { 7, 8, 2, 1, 4, 3 }
 * Output:  7
 * <p>
 * Your Task:
 * Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function print2largest() that takes array A and integer N as parameters and returns the second maximum element in the array. If there does not exist any second largest element, then return -1.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1).
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 106
 * ******************  Accolite Amazon FactSet SAP Labs Times Internet Zoho Adobe Amdocs **********
 */
public class FindSecondLargestElement {
    public static int print2largest(int A[], int N) {
        //CODE HERE
        int i, first, second;
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < N; i++) {
             /* If current element is greater than
            first then update both first and second */
            if (A[i] > first) {
                second = first;
                first = A[i];
            } /* If arr[i] is in between first and
               second then update second  */
           else if (A[i] > second && A[i] != first) {
                second = A[i];
            }
        }
        return A[second];
    }
}


// ========================= not working ============= fix it