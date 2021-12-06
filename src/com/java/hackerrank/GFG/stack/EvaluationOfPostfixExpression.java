package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/6/21 5:13 PM
 * Given string S representing a postfix expression, the task is to evaluate the expression and find the final value. Operators will only include the basic arithmetic operators like *, /, + and -.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: S = "231*+9-"
 * Output: -4
 * Explanation:
 * After solving the given expression,
 * we have -4 as result.
 * Example 2:
 * <p>
 * Input: S = "123+*8-"
 * Output: -3
 * Explanation:
 * After solving the given postfix
 * expression, we have -3 as result.
 * <p>
 * Your Task:
 * You do not need to read input or print anything. Complete the function evaluatePostfixExpression() that takes the string S denoting the expression as input parameter and returns the evaluated value.
 * <p>
 * <p>
 * Expected Time Complexity: O(|S|)
 * Expected Auixilliary Space: O(|S|)
 * <p>
 * <p>
 * Constraints:
 * 1 ≤ |S| ≤ 105
 * <p>
 * 0 ≤ |Si|≤ 9 (And given operators)
 */
public class EvaluationOfPostfixExpression {
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (Character.isDigit(c)) {
                s.push(Character.getNumericValue(c));
            } else {
                int second_op = s.pop();
                int first_op = s.pop();
                if (c == '+') s.push(first_op + second_op);
                else if (c == '-') s.push(first_op - second_op);
                else if (c == '*') s.push(first_op * second_op);
                else s.push(first_op / second_op);
            }
        }
        return s.pop();
    }
}
