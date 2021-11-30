package com.java.hackerrank.stackoverflow;

import java.util.LinkedList;

/**
 * @Author pankaj
 * @create 11/30/21 12:00 PM
 */
public class LLQ {
    public static void main(String[] args) {
        LinkedList<Integer> link_list = new LinkedList<>();
        link_list.add(3);
        link_list.add(4);
        link_list.add(2, 1);
        link_list.add(2, 5);
        System.out.println(link_list);
        System.out.print(link_list.contains(1));
    }
}
