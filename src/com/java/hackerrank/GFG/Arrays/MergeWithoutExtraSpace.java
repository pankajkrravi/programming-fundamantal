package com.java.hackerrank.GFG.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/9/21 12:43 PM
 * Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4, M = 5
 * arr1[] = {1, 3, 5, 7}
 * arr2[] = {0, 2, 6, 8, 9}
 * Output: 0 1 2 3 5 6 7 8 9
 * Explanation: Since you can't use any
 * extra space, modify the given arrays
 * to form
 * arr1[] = {0, 1, 2, 3}
 * arr2[] = {5, 6, 7, 8, 9}
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 2, M = 3
 * arr1[] = {10, 12}
 * arr2[] = {5, 18, 20}
 * Output: 5 10 12 18 20
 * Explanation: Since you can't use any
 * extra space, modify the given arrays
 * to form
 * arr1[] = {5, 10}
 * arr2[] = {12, 18, 20}
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Complete the function merge() which takes the two arrays arr1[], arr2[] and their sizes n and m, as input parameters. The function does not return anything. Use the given arrays to sort and merge arr1[] and arr2[] in-place.
 * Note: The generated output will print all the elements of arr1[] followed by all the elements of arr2[].
 * <p>
 * <p>
 * Expected Time Complexity: O((n+m)*log(n+m))
 * Expected Auxiliary Space: O(1)
 * <p>
 * *************  Amazon Amdocs Brocade FactSet Goldman Sachs Juniper Networks Linkedin Microsoft Quikr *****************888
 */
public class MergeWithoutExtraSpace {
    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
           int i=n-1;
            int j=0;
            while(i>=0 && j<m){
                if(arr1[i]>arr2[j]){
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                    i--;
                    j++;
                }else{
                    break;
                }
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);

        /*int[] mergedArray = new int[n + m];
        for (int i = 0; i < n; i++) {
            mergedArray[i] = arr1[i];
        }
       for (int j = 0; j < m; j++) {
            mergedArray[n++] = arr2[j];
        }
        for (int v : mergedArray) {
            System.out.print(v + " ");
        }
        Arrays.sort(mergedArray);*/
    }

    public static void main(String[] args) {
        new MergeWithoutExtraSpace().merge(new int[]{1, 3, 5, 7}, new int[]{0, 2, 6, 8, 9}, 4, 5);
    }

}