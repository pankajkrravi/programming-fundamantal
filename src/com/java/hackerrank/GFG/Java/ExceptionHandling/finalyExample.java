package com.java.hackerrank.GFG.Java.ExceptionHandling;

/**
 * @Author pankaj
 * @create 1/5/22 11:00 AM
 */
public class finalyExample {
    public static void main(String[] args) {
        int a = 90, b = 9, c = 0;
        try {
            System.out.println(a / b);
            System.out.println(a / c);
        } finally {
            System.out.println("Inside finally block !!!");
        }
    }
}
