package com.java.hackerrank.ForkJava.Quiz;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @Author pankaj
 * @create 11/25/21 10:44 PM
 */
public class LinkedHS {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs =new LinkedHashSet<Integer>();
        lhs.add(3);
        lhs.add(4);
        lhs.add(3);
        lhs.add(5);
        lhs.add(4);
        lhs.add(6);
        lhs.remove(4);

        Iterator itr = lhs.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
    }
}
 // Explanation
//
//remove(): the function removes the only element 4 present in the LinkedHashSet
//This set also does not allow duplication of elements in the set.// Note: A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.