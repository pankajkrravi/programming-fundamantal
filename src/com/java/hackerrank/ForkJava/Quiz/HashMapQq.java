package com.java.hackerrank.ForkJava.Quiz;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pankaj
 * @create 11/25/21 10:50 PM
 */
public class HashMapQq {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("First", 1);
        hm.put("Second", 2);
        hm.put("Third", 3);
        for(Map.Entry itr: hm.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }
}
  // Explanation
//
//This class makes no guarantees as to the order of the map;
//In particular, it does not guarantee that the order will remain constant over time.
//Map.Entry iterator_name: Map_name.entrySet():- iterates the map.
//getKey(): returns the key while traversing
//getValue(): returns the value associated with the corresponding key.