package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/2/21 4:35 PM
Given a string, remove the vowels from the string.

Example 1:

Input: S = "welcome to geeksforgeeks"
Output: wlcm t gksfrgks
Explanation: Ignore vowels and print other
characters
Example 2:

Input: S = "what is your name ?"
Output: wht s yr nm ?
Explanation: Ignore vowels and print other
characters
Your task:
Your task is to complete the function removeVowels() which takes a single string as input and returns the modified string. You need not take any input or print anything.

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(1)

Constraints:
1 <= |S| <= 105
Alphabets are lower cases only
 *************************************** GE ********************************
 * */
public class RemoveVowelFromString {
    String removeVowels(String S) {
        return S.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
    }
}
//=============================== String.trplaceAll( , , , , , , .....,"")