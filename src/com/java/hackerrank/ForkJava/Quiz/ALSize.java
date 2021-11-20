package com.java.hackerrank.ForkJava.Quiz;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 11/20/21 8:59 PM
 */
public class ALSize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.print(list.size() + " ");
        list.clear();
        System.out.print(list.size());
    }
}
  // Explanation
//size(): returns the size of the arraylist which gives 3(here).
//clear(): removes all the elements from the arraylist.