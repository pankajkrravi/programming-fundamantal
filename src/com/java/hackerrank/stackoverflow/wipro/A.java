package com.java.hackerrank.stackoverflow.wipro;

/**
 * @Author pankaj
 * @create 11/13/21 11:47 AM
 */
public class A {
    public void method1(Object object) {
        System.out.println("abc");
    }

    public void method1(String object) {
        System.out.println("xyz");
    }

    public static void main(String args[]) {
        A a = new A();
        a.method1(null); // xyz
    }
}