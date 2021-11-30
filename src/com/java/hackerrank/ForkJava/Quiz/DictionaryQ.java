package com.java.hackerrank.ForkJava.Quiz;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @Author pankaj
 * @create 11/30/21 12:19 PM
 */
public class DictionaryQ {
    public static void main(String[] args) {
        Dictionary gfg = new Hashtable();
        gfg.put("123", "code");
        gfg.put("456", "practice");
        gfg.put("789", "learn");

        for(Enumeration i = gfg.elements(); i.hasMoreElements();)
            System.out.print(i.nextElement() + " ");
    }
}
