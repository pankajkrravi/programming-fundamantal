package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/6/21 6:55 PM
 * Given a stack, the task is to sort it such that the top of the stack has the greatest element.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * Stack: 3 2 1
 * Output: 3 2 1
 * Example 2:
 * <p>
 * Input:
 * Stack: 11 2 32 3 41
 * Output: 41 32 11 3 2
 * Your Task:
 * You don't have to read input or print anything. Your task is to complete the function sort() which sorts the elements present in the given stack. (The sorted stack is printed by the driver's code by popping the elements of the stack.)
 * <p>
 * Expected Time Complexity: O(N*N)
 * Expected Auxilliary Space: O(N) recursive.
 * <p>
 * Constraints:
 * 1<=N<=100
 * <p>
 * Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
 * <p>
 * **************************** Amazon Goldman Sachs IBM Intuit Kuliza Yahoo Microsoft ******************
 */
public class SortaStack {
    public Stack<Integer> sort(Stack<Integer> stack) {
        //add code here.
        int tempElement = stack.pop();
        if (!stack.isEmpty()) {
            sort(stack);
        }
        insertStack(stack, tempElement);
        return stack;
    }

    private static void insertStack(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        int temp = stack.pop();

        //********* For sorting in ascending order********
        if (element < temp) {
            insertStack(stack, element);
            stack.push(temp);
        } else {
            stack.push(temp);
            stack.push(element);
        }
        return;
    }
}
