package com.java.hackerrank.ForkJava.Quiz;

import java.util.LinkedList;

/**
 * @Author pankaj
 * @create 11/20/21 9:01 PM
 */
public class LinkedListQ {
    public static void main(String[] args) {
        LinkedList<Integer> link_list = new LinkedList<>();
        link_list.add(3);
        link_list.add(4);
        link_list.add(2, 1);
        System.out.println(link_list);
        link_list.add(2, 0);
        System.out.print(link_list);
    }
}
  // Explanation
//add(element): appends the element to the end of the list.
//add(index, element): appends the element at the 'index' position.