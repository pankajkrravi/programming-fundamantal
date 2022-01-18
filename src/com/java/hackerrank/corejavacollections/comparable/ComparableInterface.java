package com.java.hackerrank.corejavacollections.comparable;

import java.util.TreeSet;

/**
 * @Author pankaj
 * @create 1/18/22 4:29 PM
 */
public class ComparableInterface {
    public static void main(String[] args) {
        TreeSet<Integer> data = new TreeSet<Integer>();

       // TreeSet<Integer> data = new TreeSet<Integer>(new MySorting());
        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);

        System.out.println(data);
    }
}
