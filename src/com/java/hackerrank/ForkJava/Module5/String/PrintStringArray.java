package com.java.hackerrank.ForkJava.Module5.String;

import java.util.Arrays;

/**
 * @Author pankaj
 * @create 11/21/21 8:47 PM
We cannot print array elements directly in Java, you need to use Arrays.toString() or Arrays.deepToString() to print array elements. Use toString() method if you want to print a one-dimensional array and use deepToString() method if you want to print a two-dimensional or 3-dimensional array etc.

In Java, arrays do not overwrite toString(). When we try write array directly to output console in Java, we get class_name + ‘@’ + hash_code of the array define by Object.toString(). See the below example for a better understanding.

Simply pass array name as argument in Arrays.toString() and all the elements of the array will get written in the output console.

Method 2: Using Arrays.deepToString()

This method is used when you have to two dimensional array.

 */
// Java Program to Write an Array of Strings to the Output Console
public class PrintStringArray {
    public static void main(String[] args) {
        String gfg[][]
                = { { "GeeksforGeeks", "Article Writing" },
                { "Google", "Search Engine" },
                { "Facebook", "Social Media" } };
        System.out.println(Arrays.deepToString(gfg));
    }
}
    // In the above example, we have used Arrays.deepToString() method. This method takes care of writing elements of two dimensional array to output console.