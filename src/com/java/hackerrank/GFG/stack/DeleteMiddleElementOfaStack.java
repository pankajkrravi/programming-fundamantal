package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/8/21 10:14 PM
 * Given a stack with push(), pop(), empty() operations, delete the middle of the stack without using any additional data structure.
 * Middle: ceil(size_of_stack/2.0)
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * Stack = {1, 2, 3, 4, 5}
 * Output:
 * ModifiedStack = {1, 2, 4, 5}
 * Explanation:
 * As the number of elements is 5 ,
 * hence the middle element will be the 3rd
 * element which is deleted
 * Example 2:
 * <p>
 * Input:
 * Stack = {1 2 3 4}
 * Output:
 * ModifiedStack = {1 3 4}
 * Explanation:
 * As the number of elements is 4 ,
 * hence the middle element will be the 2nd
 * element which is deleted
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Complete the function deleteMid() which takes the stack and its size as input parameters and modifies the stack in-place.
 * Note: The output shows the stack from top to bottom.
 * <p>
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N)
 * <p>
 * <p>
 * Constraints:
 * 2 ≤ size of stack ≤ 100
 */
public class DeleteMiddleElementOfaStack {
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        Stack<Integer> stack = new Stack<Integer>();
        int n = sizeOfStack;
        int mid = n / 2;
        int i = 1;

        if (n % 2 == 0) {
            while (i <= mid) {
                stack.push(s.pop());
                i++;
            }
            s.pop();
            while (!stack.isEmpty()) {
                s.push(stack.pop());
            }
        }
        if (n % 2 != 0) {
            while (i <= mid) {
                stack.push(s.pop());
                i++;
            }
            s.pop();
            while (!stack.isEmpty()) {
                s.push(stack.pop());
            }
        }
    }
}