package com.java.hackerrank.corejavacollections.array;

/**
 * @Author pankaj
 * @create 1/15/22 9:18 PM
 */
public class AnonymousArrays {
    public static void main(String[] args) {

        sum(new int[]{1, 2, 3});        //can not provide size in anonymous array
    }

    private static void sum(int[] is) {
        int total = 0;
        for (int e : is) {
            total = total + e;
        }
        System.out.println(total);

    }
    //for instant use, we use anonymous arrays.
}
