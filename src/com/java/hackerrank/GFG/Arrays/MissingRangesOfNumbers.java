package com.java.hackerrank.GFG.Arrays;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/8/21 12:36 PM
 * Given an array Arr of N positive integers, find the missing elements (if any) in the range 0 to max of Arri.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {62, 8, 34, 5, 332}
 * Output: 0-4 6-7 9-33 35-61 63-331
 * Explanation: Elements in the range 0-4, 6-7,
 * 9-33, 35-61 and 63-331 are not present.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * Arr[] = {13, 0, 32, 500}
 * Output: 1-12 14-31 33-499
 * Explanation: Elements in the range 1-12,
 * 14-31 and 33-499 are not present.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function findMissing() which takes the array of integers arr and its size n as input parameters and returns a string denoting the missing elements. If
 * there are more than one missing, collate them using hyphen (-) and separate each different range with a space. If there are no missing element then return "-1".
 */
public class MissingRangesOfNumbers {
        String findMissing(int[] arr, int n) {
            // code here
            Arrays.sort(arr);
            String resp = "";
            if (arr[0] ==1)
                resp =resp+"0";
            else if (arr[0]>arr[1]&& n>1)
                resp =resp+"-1";
            else {
                for (int i = 0; i < n - 1; i++) {
                    if (i == 0 && arr[0] != 1) {
                        resp = resp + printValBwRange(0, arr[i] - 1);
                    }
                    resp = resp + printValBwRange(arr[i] + 1, arr[i + 1] - 1);
                }
            }
                return resp;

        }

        // print values b/w range
        public static String printValBwRange(int start, int end) {
            if (start <= end) {
                return " " + start + " - " + end;
            }
            return "-1";
        }

    public static void main(String[] args) {
        System.out.println(new MissingRangesOfNumbers().findMissing(new int[]{62, 8, 34, 5, 332}, 5));
    }
}
// ======================= fix required for 1,0 -- o/p -1===============