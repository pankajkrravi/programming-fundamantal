package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/4/21 4:12 PM
 * Given a string, s contains '+', '-', digits, lower case English alphabets, spaces, and a phone number. The phone number is of the format +dd-dddddddddd. Here d represents a digit. Your task is to extract the phone number from the string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * Call me +91-90549385612.
 * Output:
 * +91-9054938561
 * Explanation:
 * You can clearly see the number present.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * The number is +24-01087860699
 * Output:
 * +24-0108786069
 * Explanation:
 * You can clearly see the number present.
 * <p>
 * Note: See that the leading zero in +24-0108786069 is also included. Also, every string contains exactly one phone number.
 * <p>
 * <p>
 * <p>
 * Your Task:
 * <p>
 * You don't need to read input or print anything. Your task is to complete the function phoneNumber() which takes the string S and returns the phone number.
 * <p>
 * <p>
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 */
public class ExtractThPhoneNumber {
    static String phoneNumber(String S) {
        // code here
        String resp = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9' || S.charAt(i) == '+' || S.charAt(i) == '-') {
                resp += S.charAt(i);
            }
        }
        return resp;
    }
}
