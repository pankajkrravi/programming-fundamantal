package com.java.hackerrank.ForkJava.Quiz;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 11/20/21 8:50 PM
 */
public class ArrayListQ {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);

        System.out.print(arr.indexOf(4));
    }
}
// Explanation
//Arraylist index starts from 0.
//add(): appends the specific element to the end of the list.
//indexOf(): returns the index of the first occurrence of specified element in the list i.e. 2 in this case.