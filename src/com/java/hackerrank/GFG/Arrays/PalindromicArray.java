package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 10:26 AM
 */
public class PalindromicArray {
    public static int palinArray(int[] a, int n) {
        //add code here.
        // extract each  element values
        // indexVal , check weather its palindromic or not
        //  if all indexVal is  palindromic
        // return 1, else  return 0
        for (int i = 0; i < a.length; i++) {
            int indexVal = a[i];
            int sum = 0;

            while (indexVal > 0) {
                int lastDigit =indexVal%10;
                sum = sum * 10 + lastDigit;
                indexVal = indexVal / 10;
            } if (sum != a[i])
                return 0;
        }
        return 1;
    }
}
