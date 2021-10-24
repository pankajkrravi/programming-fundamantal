package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 8:22 PM
 *     Given a string, remove spaces from it.
 ********************** SAP Lab *********************  */
public class RemoveSpaces {
    String modify(String S) {
        // your code here
            String  stringResp = "";
            for(int i=0;i<S.length();i++){
                if (S.charAt(i) != ' ')
                    stringResp = stringResp+S.charAt(i);
            }
            return stringResp;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveSpaces().modify("geeks  for geeks"));
    }
}
