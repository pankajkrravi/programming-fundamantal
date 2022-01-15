package com.java.hackerrank.corejavacollections.array;

/**
 * @Author pankaj
 * @create 1/13/22 7:03 PM
 */
public class ArrayIntro {
    public static void main(String[] args) {
        int array[] = new int[200];
        System.out.println(array.getClass().getName());
        // 0 zise array
        int[] arrayZeroSize = new int[0];

        // char array arg
        int arrayChar[] = new int['a'];// a internally convert char to int -> 97 value of a
        // Note allowed data types are byte, short,char and int
        // -ve size
        int negArray[] = new int[-1]; // RTE: ava.lang.NegativeArraySizeException
        // large value
        // int [] largeValArray = new int[2215465464646846];// max 214748364

    }
}
