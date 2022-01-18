package com.java.hackerrank.corejavacollections.HashSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @Author pankaj
 * @create 1/17/22 8:52 PM
 */
public class hashSetEx {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();// initial cap -> 16
        HashSet hashSet1 = new HashSet(35);//create HS with size 35
        HashSet hashSet2 = new HashSet(50, 80f);// initial cap 50 and load factor is 80%
        ArrayList arrayList = new ArrayList();
        // HashSet hashSet3= new HashSet(Collection c);// get equivalent HashSet of ArrayList below lone
        HashSet hashSet3 = new HashSet(arrayList);
        // keep in mind Set(I) don't have any methods, Hence we have all the methods present in Collection available here, we can use those methods

    }
}
