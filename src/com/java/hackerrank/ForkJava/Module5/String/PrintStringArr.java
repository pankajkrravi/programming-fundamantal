package com.java.hackerrank.ForkJava.Module5.String;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/21/21 8:52 PM
Thus, to print Java array in a meaningful way, you don’t need to look further because your very own Collection framework provides lots of array utility methods in java.util.Arrays class. Here we have toString() method and deepToString() method to print array in Java.

Following are the methods to write an array of strings to the output console.

Method 1: Using Arrays.toString()

This method is used when you have one dimensional array.

 */
public class PrintStringArr {

    public static void main(String[] args)
    {
        String gfg[] = { "Geeks", "for", "Geeks" };
        System.out.println(Arrays.toString(gfg));
    }
}

