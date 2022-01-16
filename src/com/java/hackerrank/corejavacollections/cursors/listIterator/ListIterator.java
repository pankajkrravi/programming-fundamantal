package com.java.hackerrank.corejavacollections.cursors.listIterator;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 1/16/22 11:25 PM
 */
public class ListIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("ravi");
        arrayList.add("Laila");
        arrayList.add("Leela");
        arrayList.add("Anyshree");
        arrayList.add("Jaishree");
        arrayList.add("Teja");
        arrayList.add("Raj");
        arrayList.add("Mohan");
        arrayList.add("Sohan");
        System.out.println(arrayList);
        java.util.ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String v = (String) listIterator.next();
            if (v.equals("Teja")) {
                listIterator.add("Arjun"); // add
            }
            if (v.equals("Raj")) {
                listIterator.remove(); // remove
            }if (v.equals("Mohan")){ // replace
                listIterator.set("Mahesh");
            }
        }
        System.out.println(arrayList);
    }
}
