package com.java.hackerrank.ForkJava.Quiz;

import java.util.HashMap;

/**
 * @Author pankaj
 * @create 11/25/21 10:49 PM
 */
public class HashMapQ {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("First", 1);
        hm.put("Second", 2);
        hm.put("Third", 3);
        if(hm.containsKey("Third"))
        {
            System.out.print(hm.get("Third"));
        }
    }
}
  // Explanation
//
//containsKey(key): The method returns boolean true if the presence of the key is detected else false.
//get(key): The method returns the value associated with the key in the parameter.