package com.java.hackerrank.GFG.method;

/**
 * @Author pankaj
 * @create 12/4/21 5:15 PM
// Java program to demonstrate working of split(regex,
// limit) with high limit.
 =================== Ref-  https://www.geeksforgeeks.org/split-string-java-examples/
 */
public class Split2 {
    public static void main(String args[])
    {
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 5);

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
