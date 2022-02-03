package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day18;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        // push- add
        //pop- remove
        // peek -
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Pankaj Kumar Ravi");
        stringStack.push("Mohan");
        stringStack.push("RaviRanjan");
        stringStack.push("Alia");
        stringStack.push("Laila");
        System.out.println(stringStack.pop());
        System.out.println(stringStack.peek());// peek
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        //System.out.println(stringStack.peek());

        System.out.println(stringStack.size());
    }
}
