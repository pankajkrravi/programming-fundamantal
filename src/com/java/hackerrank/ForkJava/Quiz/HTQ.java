package com.java.hackerrank.ForkJava.Quiz;

import java.util.Hashtable;

/**
 * @Author pankaj
 * @create 11/30/21 12:25 PM
 */
public class HTQ {
    public static void main(String[] args) {
        Hashtable obj = new Hashtable();
        obj.put("AB", new Integer(3));
        obj.put("BC", new Integer(2));
        obj.put("CD", new Integer(8));
        System.out.print(obj.keySet());
    }
}
