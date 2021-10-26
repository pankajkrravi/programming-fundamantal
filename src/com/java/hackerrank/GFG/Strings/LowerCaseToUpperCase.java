package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/25/21 6:07 PM
a string str containing only lowercase letters, generate a string with the same letters, but in uppercase. */

public class LowerCaseToUpperCase {
    String to_upper(String str) {
        // code here
            /*String resp ="";
            char c [] =str.toCharArray();
            for (int i=0;i<str.length();i++){
                resp =resp+c[i]-32;
            }*/
            return str.toUpperCase();
    }
}
