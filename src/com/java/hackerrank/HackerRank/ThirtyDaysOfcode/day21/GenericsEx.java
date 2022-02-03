package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day21;

// https://www.hackerrank.com/challenges/30-generics/problem?isFullScreen=true
public class GenericsEx {
    public static <E> void printArray(E[] e) {
        for (E value : e) {
            System.out.println(value);
        }
    }
}
