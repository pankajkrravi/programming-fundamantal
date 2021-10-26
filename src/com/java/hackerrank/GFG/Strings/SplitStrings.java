package com.java.hackerrank.GFG.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author pankaj
 * @create 10/25/21 4:04 PM
Input:
S = geeks01for02geeks03!!!
Output:
geeksforgeeks
010203
!!!
Explanation: The output shows S1, S2 and S3.
 */
public class SplitStrings {
    static List<String> splitString(String S) {
        // code here
        List<String> resp = new ArrayList<String>(3);
        String alphabets ="";
        String numbers="";
        String specialChar ="";
        for (int i=0;i<S.length();i++){
            if (S.charAt(i) >='a' && S.charAt(i) <='z' || S.charAt(i) >='A' && S.charAt(i)  <= 'Z' )
                alphabets =alphabets+S.charAt(i);
            else if (S.charAt(i) >='0' && S.charAt(i) <='9' )
                numbers =numbers+S.charAt(i);
            else
                specialChar =specialChar+S.charAt(i);
        }
        resp.add(alphabets);
        resp.add(numbers);
        resp.add(specialChar);
        return resp;
    }

    public static void main(String[] args) {
        List<String> str= splitString("geeks01for02geeks03!!!");
        for (String s: str) {
            System.out.println(s);
        }
    }
}
