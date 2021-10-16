package com.java.hackerrank.GFG.mathematical;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 10/13/21 12:45 PM
 ---------------- Accolite,Amazon,FactSet,Samsung ------------------------------------  */
public class FindTheMedian {
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int size = v.length;
        if (size % 2 ==0) {
            int midVal1 = v[size/2];
            int midVal2 = v[size/2-1];
            return (midVal1+midVal2)/2;
        }else
        return v[size/2];
    }

    public static void main(String[] args) {
        int median= new FindTheMedian().find_median(new int[]{90,100,78,89});
        System.out.print(median);
    }
}
