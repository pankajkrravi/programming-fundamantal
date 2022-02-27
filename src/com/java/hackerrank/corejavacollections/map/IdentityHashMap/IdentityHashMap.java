package com.java.hackerrank.corejavacollections.map.IdentityHashMap;

import java.util.HashMap;

public class IdentityHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Pankaj");
        hashMap.put(4, "ravi");
        hashMap.put(6, "Dinga");
        hashMap.put(2, "Guldu");
        System.out.println(hashMap);

     /*   IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap();
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);
        identityHashMap.put(integer1, "First");
        identityHashMap.put(integer2, "Second");
        System.out.println(identityHashMap);*/

        HashMap<Integer, String> identityHashMap = new HashMap<>();
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);
        identityHashMap.put(integer1, "First");
        identityHashMap.put(integer2, "Second");
        System.out.println(identityHashMap);
    }
}
