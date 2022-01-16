package com.java.hackerrank.corejavacollections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author pankaj
 * @create 1/16/22 7:02 PM
 */
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        // creates empty arraylist with default size 10 in above line
        // when all 10 blocks get occupied a new ArrayList will get created with new size.
        // new arrayList Size = (x*3/2)+1 = 16

        ArrayList arrayList1 = new ArrayList(30);// if we know initial capacity

        // ArrayList arrayList2=new ArrayList(Collection c); // To get equivalent Arraylist of Any collection type
        // methods in Arraylist
        arrayList.add("Ravi");
        arrayList.add(false);
        arrayList.add(20);
        arrayList.add(56.44);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.remove(new Integer(20));
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        // generic ArrayList,not  required to typecase
        ArrayList<String> stringArrayList = new ArrayList<String>();
        //stringArrayList.add(1); // only string type is allowed
        // Generic makes collection type safe and solves the problem of type casting, so we can avoid such runtime exception
        stringArrayList.add("Minal");
        stringArrayList.add("Rahu");
        stringArrayList.add("Anushree");
        stringArrayList.add("Laila");
        System.out.println(stringArrayList);
    }
}
