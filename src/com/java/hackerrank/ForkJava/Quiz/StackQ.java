package com.java.hackerrank.ForkJava.Quiz;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 11/20/21 9:05 PM
 */
public class StackQ {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        int num1 = st.pop();
        System.out.print(num1);
    }
}
    // Explanation
//
//Stack follows LIFO(Last In First Out) pattern.
//push(): inserts the element at the top of the stack.
//pop(): returns the element present at the top of the stack and removes it from the stack as well.