package com.java.hackerrank.ForkJava.Quiz;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Hashtable;

/**
 * @Author pankaj
 * @create 11/30/21 12:23 PM
 */
public class hASHtABLEq {
    public static void main(String[] args) {
        Hashtable obj = new Hashtable();
        obj.put("A", new Integer(3));
        obj.put("B", new Integer(2));
        obj.put("C", new Integer(8));
        System.out.print(obj.contains(new Integer(5)));
    }
}
