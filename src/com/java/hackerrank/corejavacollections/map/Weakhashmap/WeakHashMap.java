package com.java.hackerrank.corejavacollections.map.Weakhashmap;

import java.util.HashMap;

public class WeakHashMap {
    public static void main(String[] args) throws InterruptedException {
        HashMap hashMap = new HashMap<>();
        Test test = new Test();
        hashMap.put(test, "someData");
        System.out.println(hashMap);
        test = null;
        System.gc();
        Thread.sleep(4000);
        System.out.println(hashMap);
        System.out.println(" =================================");
/*        WeakHashMap weakHashMap = new WeakHashMap();
        Test test1 = new Test();
        weakHashMap.put(test1, "someData");
        System.out.println(weakHashMap);
        test = null;
        System.gc();
        Thread.sleep(4000);
        System.out.println(weakHashMap);*/
    }
}
