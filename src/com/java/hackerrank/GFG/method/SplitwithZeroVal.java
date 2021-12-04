package com.java.hackerrank.GFG.method;

/**
 * @Author pankaj
 * @create 12/4/21 5:17 PM
/ Java program to demonstrate working of split(regex,
// limit) with 0 limit.
 */
public class SplitwithZeroVal {
    public static void main(String args[])
    {
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("s", 0);

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
