package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/25/21 5:20 PM
 *    two strings  S1 and S2 . You have to concatenate both the strings and print the concatenated string.
 */
public class CPlusPlusStrings {
    String conCat(String s1 , String s2) {
        //code here.
        return s1+s2;
    }

    public static void main(String[] args) {
        System.out.println(new CPlusPlusStrings().conCat("Geeksfor","Geeks"));
    }
}
