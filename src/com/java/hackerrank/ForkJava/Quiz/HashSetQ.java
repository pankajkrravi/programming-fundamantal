package com.java.hackerrank.ForkJava.Quiz;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author pankaj
 * @create 11/25/21 9:13 PM
 */
public class HashSetQ {
    public static void main(String[] args) {
        Set<Integer> hs =new HashSet<Integer>();
        hs.add(3);
        hs.add(4);
        hs.add(3);
        hs.add(5);
        hs.add(4);
        hs.add(6);
        hs.remove(5);
        System.out.print(Collections.frequency(hs, 5));  // line 1
    }
}
// Explanation
//
//add(): used to add the specified element to the hashset.
//HashSet does not allow duplicate addition in the set so the frequency of 5 is 1 which becomes 0 after removal using remove().
