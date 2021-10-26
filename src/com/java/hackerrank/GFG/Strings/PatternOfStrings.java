package com.java.hackerrank.GFG.Strings;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 10/25/21 10:27 PM
 *
 * Input: S = "GeeK"
 * Output: Geek
 *         Gee
 *         Ge
 *         G
 */
public class PatternOfStrings {
    ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String>  arrayList= new ArrayList<String>();
        for (int i = 0;i<S.length();i++){
            String s="";
            for (int  j=0;j<S.length()-i;j++) {
                  s = s + S.charAt(j);
              }
              arrayList.add(s);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<String > arrayList= new PatternOfStrings().pattern("GeeK");
        for (String val : arrayList) {
                System.out.println(val);
        }
    }
}
