package com.java.hackerrank.ForkJava.Quiz;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author pankaj
 * @create 11/25/21 9:33 PM
 */
public class HashserQq {
    public static void main(String[] args) {

        Set<Integer> hs =new HashSet<Integer>();
        hs.add(3);
        hs.add(4);
        hs.add(3);
        hs.add(5);
        hs.add(4);
        hs.add(6);
        hs.remove(4);
        System.out.print(hs.contains(4));
    }
}
  // Explanation
//
//Since HashSet does not allow duplication so after removal of 4 the contain() returns false.