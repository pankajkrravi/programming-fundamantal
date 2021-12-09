package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/8/21 10:24 PM
 * Design a data-structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. Your task is to complete all the functions, using stack data-Structure.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * Stack: 18 19 29 15 16
 * Output: 15
 * Explanation:
 * The minimum element of the stack is 15.
 * <p>
 * <p>
 * <p>
 * Your Task:
 * Since this is a function problem, you don't need to take inputs. You just have to complete 5 functions, push() which takes the stack and an integer x as input and pushes it into the stack; pop() which takes the stack as input and pops out the topmost element from the stack; isEmpty() which takes the stack as input and returns true/false depending upon whether the stack is empty or not; isFull() which takes the stack and the size of the stack as input and returns true/false depending upon whether the stack is full or not (depending upon the
 * given size); getMin() which takes the stack as input and returns the minimum element of the stack.
 * Note: The output of the code will be the value returned by getMin() function.
 * <p>
 * <p>
 * Expected Time Complexity: O(N) for getMin, O(1) for remaining all 4 functions.
 * Expected Auxiliary Space: O(1) for all the 5 functions.
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 104
 * *******************  Adobe Amazon FactSet Goldman Sachs Intuit Linkedin MakeMyTrip Paytm SAP Labs VMWare Walmart Microsoft Flipkart *************
 */
public class SpecialStack {
    public void push(int a, Stack<Integer> s) {
        //add code here.
        s.add(a);
    }

    public int pop(Stack<Integer> s) {
        //add code here.
        int resp=-1;
        if (!s.isEmpty())
            resp=  s.pop();
        return resp;
    }

    public int min(Stack<Integer> s) {
        //add code here.
        Integer[] a = s.toArray(new Integer[s.size()]);

        int min = a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;
    }

    public boolean isFull(Stack<Integer> s, int n) {
        //add code here.
        boolean isFull=false;
        if (s.size() ==n)
            isFull =true;
            return isFull;
    }

    public boolean isEmpty(Stack<Integer> s) {
        //add code here.
        return s.isEmpty();
    }
}
//---------------- Most Frequently asked --------------