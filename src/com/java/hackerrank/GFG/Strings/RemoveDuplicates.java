package com.java.hackerrank.GFG.Strings;


import java.util.LinkedHashSet;

/**
 * @Author pankaj
 * @create 12/6/21 12:29 AM
 * Given a string without spaces, the task is to remove duplicates from it.
 * <p>
 * Note: The original order of characters must be kept the same.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "zvvo"
 * Output: "zvo"
 * Explanation: Only keep the first
 * occurrence
 * Example 2:
 * <p>
 * Input: S = "gfg"
 * Output: gf
 * Explanation: Only keep the first
 * occurrence
 * Your task:
 * Your task is to complete the function removeDups() which takes a single string as input and returns the string. You need not take any input or print anything.
 * <p>
 * <p>
 * Expected Time Complexity: O(|s|)
 * Expected Auxiliary Space: O(constant)
 * <p>
 * Constraints:
 * 1 <= |S| <= 105
 * S conatins lowercase english alphabets
 * <p>
 * ***************************************** Microsoft  **********************************
 */
public class RemoveDuplicates {
    String removeDups(String S) {
        // code here
        String ans="";
        /*HashSet<Character> hs = new HashSet<>();// doesnt maintain order*/

       LinkedHashSet<Character> hs=new LinkedHashSet<>();
        for (int i=0;i<S.length();i++){
            hs.add(S.charAt(i));
        }
        for (Character k: hs) {
            ans+=k;
        }
        return ans;
    }
}
