package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/3/21 4:29 PM
 */
public class PRINTSTACKinREVERSE {

    public static void printStackInRev() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        if (stack.isEmpty()){
            return;
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        printStackInRev();
    }
}


