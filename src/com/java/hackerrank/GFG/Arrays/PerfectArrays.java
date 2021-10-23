package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 9:34 AM
 */
public class PerfectArrays {
    public boolean IsPerfect(int a[], int n) {
        // Complete the function
        // reverse Array
        int[] revArray = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            revArray[j] = a[i];
            j = j + 1;
        }
        // check a w.r.to revArray
        boolean isPerfect = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == revArray[i])
                count = count+1;
        }
        if (count ==n  )
            isPerfect = true;

        return isPerfect;
    }

    public static void main(String[] args) {
        System.out.println(new PerfectArrays().IsPerfect(new int[]{1, 2, 3, 2, 1}, 5));
        System.out.println(new PerfectArrays().IsPerfect(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(new PerfectArrays().IsPerfect(new int[]{11, 12, 14, 12, 19, 11}, 6));

    }
}
