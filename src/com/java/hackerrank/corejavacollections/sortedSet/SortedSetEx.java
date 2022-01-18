package com.java.hackerrank.corejavacollections.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author pankaj
 * @create 1/18/22 11:24 AM
 */
public class SortedSetEx {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add(12);
        sortedSet.add(33);
        sortedSet.add(32);
        sortedSet.add(10);
        sortedSet.add(90);
        sortedSet.add(17);
        sortedSet.add(16);
        sortedSet.add(03);
        System.out.println(sortedSet);

        // methods present in SortedSet(I)
        System.out.println("First element : "+sortedSet.first());
        System.out.println("Last element : "+sortedSet.last());
        //headSet() -> returns object having elements that is coming just before the value that we provide
        System.out.println(sortedSet.headSet(16));// display all the value that is coming before 10
        //SortedSet tailSet(Object 0)
        System.out.println(sortedSet.tailSet(12));
        //SortedSet subSet(Object o,Object p)
        System.out.println(sortedSet.subSet(5,50));
        //Comaparator comparator()
        System.out.println(sortedSet.comparator());// for natural sorting it returns null
    }
}
