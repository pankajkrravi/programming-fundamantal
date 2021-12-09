package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/9/21 11:15 PM
 * Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
 * For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * {([])}
 * Output:
 * true
 * Explanation:
 * { ( [ ] ) }. Same colored brackets can form
 * balaced pairs, with 0 number of
 * unbalanced bracket.
 * Example 2:
 * <p>
 * Input:
 * ()
 * Output:
 * true
 * Explanation:
 * (). Same bracket can form balanced pairs,
 * and here only 1 type of bracket is
 * present and in balanced way.
 * Example 3:
 * <p>
 * Input:
 * ([]
 * Output:
 * false
 * Explanation:
 * ([]. Here square bracket is balanced but
 * the small bracket is not balanced and
 * Hence , the output will be unbalanced.
 * Your Task:
 * This is a function problem. You only need to complete the function ispar() that takes a string as a parameter and returns a boolean value true if brackets are balanced else returns false. The printing is done automatically by the driver code.
 * <p>
 * Expected Time Complexity: O(|x|)
 * Expected Auixilliary Space: O(|x|)
 * <p>
 * Constraints:
 * 1 ≤ |x| ≤ 32000
 * <p>
 * Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".
 * *******************************  Adobe Amazon Flipkart Oracle OYO Rooms Snapdeal Walmart Yatra.com Microsoft Google ***************8
 */
public class ParenthesisChecker {
    static boolean ispar(String x) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char curr = x.charAt(i);
            if (isOpening(curr)) {
                s.push(curr);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else if (!isMatching(s.peek(), curr)) {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        return s.isEmpty();

    }

    static boolean isOpening(char ch) {
        return ch == '{' || ch == '[' || ch == '(';
    }

    static boolean isMatching(char a, char b) {
        return a == '(' && b == ')'
                || a == '{' && b == '}'
                || a == '[' && b == ']';
    }
}
// =================================TQ ==================