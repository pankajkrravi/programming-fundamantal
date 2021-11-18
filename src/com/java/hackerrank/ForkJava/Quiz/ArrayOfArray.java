package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/18/21 4:38 PM
 */
public class ArrayOfArray {
    public static void main (String[] args)
    {
        int arr[] = new int[]{2, 9, 8, 4, 6, 1, 7, 5, 3, 0};
        for(int i = 0; i < arr.length; i++)
        {
            arr[i/2] = arr[arr[arr[i/3]/3]/3];
        }

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}
