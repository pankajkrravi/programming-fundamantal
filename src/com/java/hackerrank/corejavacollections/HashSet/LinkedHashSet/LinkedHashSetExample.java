package com.java.hackerrank.corejavacollections.HashSet.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * @Author pankaj
 * @create 1/18/22 11:08 AM
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();// initial; cap =16 by default
        LinkedHashSet linkedHashSet1 = new LinkedHashSet(41);// create LHS with initial cap = 41
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(25,1.00f); // initial cap =25 with load factor 1.00f i.e once LHS get filled 100 %, it will create new LHS with double capacity i.e 50

    }
}
