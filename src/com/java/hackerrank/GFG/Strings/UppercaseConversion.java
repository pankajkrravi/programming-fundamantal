package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/2/21 4:12 PM
 * Given a string str, convert the first letter of each word in the string to uppercase.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * str = "i love programming"
 * Output: "I Love Programming"
 * Explanation:
 * 'I', 'L', 'P' are the first letters of
 * the three words.
 * <p>
 * Your Task:
 * You dont need to read input or print anything. Complete the function transform() which takes s as input parameter and returns the transformed string.
 * <p>
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(N) to store resultant string
 * <p>
 * <p>
 * Constraints:
 * 1 <= N <= 104
 * The original string str only consists of lowercase alphabets and spaces to separate words.
 * <p>
 * <p>
 * *************************************** Nagarro ********************
 */
public class UppercaseConversion {
    public String transform(String s) {
        // code here
        char[] ch = s.toCharArray();
        // change 1st char to upper case
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 1; i < ch.length-1; i++) {

            if (ch[i] == ' ') {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                i=i + 1;
            }
        }
        s = String.valueOf(ch);
        return s;
    }
}
