package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day14;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author pankaj
 * @create 1/19/22 4:09 PM
   https://www.hackerrank.com/challenges/30-scope/problem
 */
public class Scope {
    private int[] elements;
    public int maximumDifference;

    // Add your code here

// End of Difference class
    Scope(int a[]){
    this.elements= a;
}
    public void computeDifference(){
        Arrays.sort(elements);
        int size = elements.length;
        maximumDifference = Math.abs(elements[size-1]-elements[0]);
    }
}
