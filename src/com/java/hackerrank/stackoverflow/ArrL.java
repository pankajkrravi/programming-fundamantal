package com.java.hackerrank.stackoverflow;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 11/26/21 5:37 PM
 */
public class ArrL {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("A");
        arrayList.add("D");
        arrayList.ensureCapacity(3);
        arrayList.trimToSize();
        System.out.println(arrayList.size());
    }
}
