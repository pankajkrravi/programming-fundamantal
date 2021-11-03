package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 10:14 PM
 */
public class printAnElementSet2 {
    static int findElementAtIndex(int a[], int n, int key) {
       /* //  shortcut
        return a[key];*/
        // Your code goes here
        int i = 0, element = 0;
        while (i < n) {
            element = a[key];
            break;
        }
        return element;
    }

    public static void main(String[] args) {
        System.out.println(new printAnElementSet2().findElementAtIndex(new int[]{10, 20, 30, 40, 50}, 5, 2));
    }
}
