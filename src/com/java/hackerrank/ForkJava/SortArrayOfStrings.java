package com.java.hackerrank.ForkJava;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author pankaj
 * @create 11/19/21 7:47 PM
 */
public class SortArrayOfStrings {
    public static void main(String[] args)
    {
        // Custom input string
        String arr[] = { "practice.geeksforgeeks.org",
                "quiz.geeksforgeeks.org",
                "code.geeksforgeeks.org" };

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.println("Modified arr[] : \n%s\n\n"+Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Lastly printing the above array
        System.out.println("Modified arr[] : \n%s\n\n"+Arrays.toString(arr));
    }
}
