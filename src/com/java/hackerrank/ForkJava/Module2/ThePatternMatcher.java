package com.java.hackerrank.ForkJava.Module2;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 11/18/21 10:21 PM
 * You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
 * As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * xxyy
 * <p>
 * Output:
 * 1
 * Example 2:
 * <p>
 * Input:
 * xyx
 * <p>
 * Output:
 * 0
 * Your Task:
 * <p>
 * Since this is a function problem, you don't need to take any input. Just complete the function follPatt(string s) that outputs 1 if string is valid, else it outputs 0.
 * <p>
 * Constraints:
 * 1 <= |s| <=100
 */
public class ThePatternMatcher {
    static void follPatt(String str) {
        Stack<Character> s = new Stack<Character>();
        int flag = 0;
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (s.empty()) {
                temp = 0;
                if (str.charAt(i) == 'y') {
                    flag = 1;
                    break;
                } else {
                    s.push('x');
                }
            } else {
                if (str.charAt(i) == 'y' && s.peek() == 'x') {
                    s.pop();
                }
            }
        }
    }
}