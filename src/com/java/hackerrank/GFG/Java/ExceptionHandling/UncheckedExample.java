package com.java.hackerrank.GFG.Java.ExceptionHandling;

/**
 * @Author pankaj
 * @create 1/4/22 7:51 PM
 */
public class UncheckedExample {
    public static void main(String[] args) {
        int a=90,b=2,c=0;
        System.out.println(a/b);
        System.out.println(a/c);
        String  name=null;
        System.out.println(name.length()); // UCE
    }
}
