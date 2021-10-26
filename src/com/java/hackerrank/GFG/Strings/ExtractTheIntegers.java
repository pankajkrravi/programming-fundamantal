package com.java.hackerrank.GFG.Strings;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 10/25/21 4:18 PM

Given a string s, extract all the integers from s.
 */
public class ExtractTheIntegers {
    ArrayList<String> extractIntegerWords(String s) {
        // code here
        s = s.replaceAll("[^\\d]", " ");
        s= s.trim();
        s = s.replaceAll(" +", " ");
        ArrayList<String> resp =new ArrayList<String>();
            String str=" ";
            for (int i=0;i<s.length();i++) {
                if (s.charAt(i)  >='0' && s.charAt(i) <= '9')
                    str =str+s.charAt(i);
            }
            resp.add(str);
        return resp;
    }

    public static void main(String[] args) {
        // check code its working as expected or not
           ArrayList<String> aStr = new ExtractTheIntegers().extractIntegerWords("1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56");
           ArrayList<String> aStr2 = new ExtractTheIntegers().extractIntegerWords("geeksforgeeks");
        for (String   v: aStr) {
                System.out.println(v);
        }
        for (String   v2: aStr2) {
            System.out.println(v2);
        }
    }
}
 // ===============================  Need to fix it ================  space problem is o/p ============