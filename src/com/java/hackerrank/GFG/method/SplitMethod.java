package com.java.hackerrank.GFG.method;

/**
 * @Author pankaj
 * @create 12/4/21 5:11 PM
The string split() method breaks a given string around matches of the given regular expression. After splitting against the given regular expression, this method returns a char array.

Example:

Input String: 016-78967
Regular Expression: -
Output : {"016", "78967"}
1. Public String [ ] split ( String regex, int limit )
Parameters:

regex – a delimiting regular expression
Limit – the resulting threshold
Returns: An array of strings is computed by splitting the given string.

https://www.geeksforgeeks.org/split-string-java-examples/
 */
public class SplitMethod {
    public static void main(String args[])
    {
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2); // 3 for 3 values

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
