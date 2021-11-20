package com.java.hackerrank.ForkJava.Quiz;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 11/20/21 9:06 PM
 */
public class StsckPeek {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        int ele = st.peek();
        System.out.print(ele + " " + st.size());
    }
}
  //Explanation
//
//peek(): returns the topmost element of the stack but does not remove from the stack.
//The size of the stack remains same i.e. 3 (in the above case)