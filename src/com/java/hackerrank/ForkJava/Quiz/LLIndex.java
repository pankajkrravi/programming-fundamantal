package com.java.hackerrank.ForkJava.Quiz;

import java.util.LinkedList;

/**
 * @Author pankaj
 * @create 11/20/21 9:03 PM
 */
public class LLIndex {
    public static void main(String[] args) {
        LinkedList<Integer> link_list = new LinkedList<>();
        link_list.add(3);
        link_list.add(4);
        link_list.add(2, 1);

        System.out.print(link_list.size() + " ");
        link_list.add(2, 5);
        System.out.print(link_list.size());
    }
}
    // Explanation
//
//Contents of the linked list initially are 3, 4, 1 thus size is 3. After replacing of 0 at index 2 the size increases as element already present shifts to the right and size increases to 4.