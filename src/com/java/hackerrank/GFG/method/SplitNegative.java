package com.java.hackerrank.GFG.method;

/**
 * @Author pankaj
 * @create 12/4/21 5:16 PM
// Java program to demonstrate working of split(regex,
// limit) with negative limit.
 */
public class SplitNegative {
    public static void main(String args[])
    {
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("s", -2);

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
