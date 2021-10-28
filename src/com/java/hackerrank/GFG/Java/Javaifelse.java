package com.java.hackerrank.GFG.Java;

/**
 * @Author pankaj
 * @create 10/28/21 5:17 PM
 */
public class Javaifelse {
    static String compareNM(int n,int m){
        // code here
        String  resp="";
            if (n <m)
                resp="lesser";
            else if (n>m)
                resp ="greater";
            else
                 resp = "equal";
            return resp;
        }
}
