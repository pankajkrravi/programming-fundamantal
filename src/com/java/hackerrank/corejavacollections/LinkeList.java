package com.java.hackerrank.corejavacollections;

import javax.swing.*;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @Author pankaj
 * @create 1/16/22 9:47 PM
 */
public class LinkeList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // LinkedList linkedListEquiv= new LinkedList(Collection c);// equivalent LL
        linkedList.add("Pankaj");
        linkedList.add(120);
        linkedList.add(null);
        linkedList.add(23.66);
        System.out.println(linkedList);
        // set element at specific position
        linkedList.set(2, "Rep Element value");
        System.out.println(linkedList);
        linkedList.add(3, "Laila");
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        // Linked List methods are used to develop Stack and queues

    }
}
