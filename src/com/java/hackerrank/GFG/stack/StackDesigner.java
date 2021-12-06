package com.java.hackerrank.GFG.stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/6/21 11:48 AM
 * You are given an array arr of size N. You need to push the elements of the array into a stack and then print them while popping.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 5
 * arr = {1 2 3 4 5}
 * Output:
 * 5 4 3 2 1
 * Example 2:
 * <p>
 * Input:
 * n = 7
 * arr = {1 6 43 1 2 0 5}
 * Output:
 * 5 0 2 1 43 6 1
 * <p>
 * <p>
 * Your Task:
 * Since this is a function problem, you don't need to take any input. Just complete the provided functions _push() and _pop().
 * <p>
 * Constraints:
 * 1 <= Ai <= 107
 */
public class StackDesigner {
    public static Stack<Integer> _push(ArrayList<Integer> arr, int n) {
        //Your code here
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < n) {
            stack.push(arr.get(i));
            i++;
        }
        return stack;
    }

    public static void _pop(Stack<Integer> s) {
        //Your code here
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
