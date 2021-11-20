package com.java.hackerrank.ForkJava.Quiz;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 11/20/21 8:53 PM
 */
public class ALQ {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(4);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();

        arr1.add(5);
        arr1.add(6);
        arr1.addAll(1, arr);

        System.out.print(arr1);
    }
}
    // addAll(int index, Collection c): Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.