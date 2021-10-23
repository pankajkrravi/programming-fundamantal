package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 2:17 PM
 */
public class SmallerAndLarger {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // find the number of array elements less than or equal to X and elements more than or equal to X.
        int [] smallerAndLarger =new int[2];
         int i=0,smallCount =0,largeCount =0;
         while (i < arr.length){
             if (arr[i] < x)
                 smallCount++;
             else {
                 largeCount++;
             }
             i++;
         }
                smallerAndLarger[0] =smallCount;
              smallerAndLarger[1] = largeCount;
              return smallerAndLarger;
    }

    public static void main(String[] args) {
        int [] result = new SmallerAndLarger().getMoreAndLess(new int[]{1, 2, 8, 10, 11, 12, 19},7,5);
        for (int i: result) {
            System.out.print(i+" ");
        }
    }
}
