package com.java.hackerrank.corejavacollections.stsck;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 1/16/22 10:51 PM
 */
public class StsckEx {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(41);
        stack.push(78);
        stack.push(75);
        stack.push(false);
        Object o = stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        boolean b = stack.isEmpty();
        System.out.println(b);
        System.out.println(stack.search(78));// return position

    }
}
