package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/29/21 8:45 PM
 * Input:
 * S = "ab C"
 * Output:
 * zy X
 * Explanation:
 * The reciprocal of the first letter 'a' is 'z'.
 * The reciprocal of the second letter 'b' is 'y'.
 * The reciprocal of the third letter ' ' is ' '.
 * The reciprocal of the last letter 'C' is 'X
 */
public class ProgramToPrintReciprocalOfLettersCopy {
    static String reciprocalString(String S) {
        String answer = "";
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (Character.isLowerCase(ch)) {
                int v1 = ch - 'a';
                int f1 = 'z' - v1;
                answer = answer + (char) f1;
            } else if (Character.isUpperCase(ch)) {
                int v2 = ch - 'A';
                int f2 = 'Z' - v2;
                answer = answer + (char) f2;
            } else {
                answer = answer + ch;
            }
        }
        return answer;
    }
}
