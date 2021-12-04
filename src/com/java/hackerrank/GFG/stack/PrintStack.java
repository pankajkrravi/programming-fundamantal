package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/3/21 4:36 PM
 */
public class PrintStack {
    public static void printStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        if (!stack.isEmpty()){
            System.out.println(stack);
        }
    }

    public static void main(String[] args) {
        printStack();
    }
}
