package com.java.hackerrank.ForkJava.Quiz;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author pankaj
 * @create 11/25/21 10:47 PM
 */
public class TreesetQ {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(6);
        ts.add(5);
        ts.add(7);
        ts.add(8);
        ts.add(1);
        ts.add(2);

        TreeSet<Integer> tlset = new TreeSet<Integer>();
        tlset = (TreeSet<Integer>)ts.tailSet(5);
        Iterator itr = tlset.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
    }
}
 // Explanation
//
//TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
//tailSet(val): The method returns the portion of the values in a sorted manner that is greater than the element mentioned in the parameter, including the parameter(val).