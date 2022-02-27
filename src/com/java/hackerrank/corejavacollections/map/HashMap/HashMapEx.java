package com.java.hackerrank.corejavacollections.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();// default capacity 16
        // Load factor is 0.75
        Map map = new HashMap();
        HashMap hashMap1 = new HashMap(20);// initial cap = 20
        HashMap hashMap2 = new HashMap(20, 0.9f);// Load factor 90%
        // equivalent Hashmap
        HashMap newHashMap = new HashMap(map);

        // Example
        HashMap<String, Integer> map1 = new HashMap();
        map1.put("Computer", 95);
        map1.put("Hindi", 80);
        map1.put("Social", 85);
        map1.put("Polity", 93);
        map1.put("Computer", 76);

        System.out.println(map1);
        System.out.println(map1.entrySet());
        System.out.println(map1.get("Social"));
        System.out.println(map1.size());
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.clone());
        System.out.println(map1.containsKey("Polity"));
        System.out.println(map1.remove("Social"));
        System.out.println(map1);
        System.out.println(map1.replace("Polity", 99));
        System.out.println(map1.computeIfAbsent("Social", k -> 1));// 1 is mapped to Social
       // System.out.println(map1.computeIfAbsent("Social", k -> k+"Something New added"));

    }
}
