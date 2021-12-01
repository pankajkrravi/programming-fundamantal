package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/1/21 6:59 PM
 * Given a string S, the task is to change the complete string to Uppercase or Lowercase depending upon the case for the first character.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = "abCD"
 * Output: abcd
 * Explanation: The first letter (a) is
 * lowercase. Hence, the complete string
 * is made lowercase.
 * <p>
 * â€‹Example 2:
 * <p>
 * Input:
 * S = "Abcd"
 * Output: ABCD
 * Explanation: The first letter (A) is
 * uppercase. Hence, the complete string
 * is made uppercase.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function modify() which takes the string S as input and returns the resultant string with stated modifications.
 * <p>
 * <p>
 * Expected Time Complexity: O(|S|).
 * Expected Auxiliary Space: O(1) for C++ and O(|S|) for output in Java/Python.
 * <p>
 * <p>
 * Constraints:
 * 1<=|S|<=104
 * ************************* Oracle ****************************8
 */
public class ChangeTheString {
    String modify(String s){
        if(s.charAt(0)<='Z')
            return s.toUpperCase();
        else
            return s.toLowerCase();
    }
}
// ================== tricky ==========