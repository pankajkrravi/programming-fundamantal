package com.java.hackerrank.corejavacollections.cursors.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author pankaj
 * @create 1/16/22 11:16 PM
 */
public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(22);
        integerArrayList.add(34);
        integerArrayList.add(54);
        integerArrayList.add(90);
        integerArrayList.add(100);
        integerArrayList.add(234);
        integerArrayList.add(7);
        integerArrayList.add(46);
        Iterator iterator = integerArrayList.iterator();
            while (iterator.hasNext()){
                Integer integerV =(Integer) iterator.next();
                if (integerV % 2==0){
                    System.out.println(integerV);
                }else {
                    iterator.remove();
                }
            }
    }
}
