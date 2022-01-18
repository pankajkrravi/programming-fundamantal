package com.java.hackerrank.corejavacollections.comparator;

import java.util.Comparator;

/**
 * @Author pankaj
 * @create 1/18/22 7:23 PM
 */
public class ComparatorExample implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        //desending sorting order
        Integer integer1 = (Integer) o1;
        Integer integer2 = (Integer) o2;
        if (integer1 < integer2) {
            return +1;
        }
        if (integer1 > integer2) {
            return -1;
        } else
            return 0;
    }
}
