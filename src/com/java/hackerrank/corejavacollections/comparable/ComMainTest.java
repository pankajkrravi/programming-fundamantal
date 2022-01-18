package com.java.hackerrank.corejavacollections.comparable;

import com.java.hackerrank.corejavacollections.comparator.ComparatorExample;

import java.util.TreeSet;

/**
 * @Author pankaj
 * @create 1/19/22 12:11 AM
 */
public class ComMainTest {
    public static void main(String[] args) {
        // TreeSet<Integer> data = new TreeSet<Integer>();
        // descending order
        TreeSet<Integer> data = new TreeSet<Integer>(new ComparatorExample());
        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);

        System.out.println(data);
    }
}
