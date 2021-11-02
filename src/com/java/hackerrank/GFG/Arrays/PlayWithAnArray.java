package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/2/21 10:30 AM
 * Given an unsorted array arr of size N, rearrange the elements of array such that number at the odd index is greater than the number at the previous even index. The task is to complete the function formatArray() which will return formatted array.
 * <p>
 * NOTE:
 * If the array formed is according to rules print 1, else 0.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 5
 * arr[] = {5, 4, 3, 2, 1}
 * <p>
 * Output:
 * 1
 * Explanation:
 * The given array after modification
 * will be as such: 4 5 2 3 1.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * n = 4
 * arr[] = {4, 3, 2, 1}
 * <p>
 * Output:
 * â€‹1
 * User task:
 * Since this is a functional problem you don't have to worry about the input, you just have to complete the function
 * formatArray(), which accepts array arr and its size
 */

public class PlayWithAnArray {
    public int[] formatArray(int[] a, int n) {
        // add code here.
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                if (a[i] < a[i - 1]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] resp = new PlayWithAnArray().formatArray(new int[]{5, 4, 3, 2, 1}, 5);
        for (int v : resp) {
            System.out.print(v+" ");
        }
    }
}
