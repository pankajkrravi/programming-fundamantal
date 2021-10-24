package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 9:17 PM
 * Given a string S and two integers L and R. Print the characters in the range L to R of the string.
 * Input:
 * S = "cdbkdub"
 * L = 0 , R = 5
 * Output: "cdbkdu"
 * Explanation: Starting from index 0 ('c')
 * to index 5 ('u').
 */
public class JavaSubstring {
    static String javaSub(String S, int L, int R) {
        // code here
        String s="";
        for(int i=L; i<=R; i++){
            s=s+S.charAt(i);
        }
        return s;
    }
}
