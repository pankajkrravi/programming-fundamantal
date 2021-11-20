package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/20/21 1:38 PM
 */
public class ArrayQz {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 3, 5, 7, 8, 10};
        for (int x : arr) {
            if (x % 2 == 0)
                System.out.print(x + " ");
        }
    }
}
// for loop in above code snippet works same as normal for loop and iterates over arr[] and checks for element for even or not.
