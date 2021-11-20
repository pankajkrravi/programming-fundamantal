package com.java.hackerrank.ForkJava.Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author pankaj
 * @create 11/20/21 8:55 PM
 */
public class ALIndexOf {
    public static void main(String[] args) {
        Integer arr[] = {2, 2, 4, 2, 3, 5, 5, 6};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        Collections.reverse(list);
        System.out.print(list.lastIndexOf(5));
    }
}
  // Explanation
//
//ArrayList<type> list = new ArrayList<type>(Arrays.asList(arr)); is the conversion from array to arraylist Array to ArrayList
//
//Collections.reverse(): reverse the order of elements of list.
//lastIndexOf(int val): returns the last occurrence of val in the list. #####