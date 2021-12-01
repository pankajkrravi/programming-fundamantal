package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/1/21 7:20 PM
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof
Your Task:

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |s| <= 10000
 */
public class ReverseaString {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Reverse the string str
        String resp="";
        for (int i=str.length()-1;i>=0;i--){
            resp = resp+str.charAt(i);
        }
        return resp;
    }
    // ================== 2nd way
    //Your code here
   /* string str1;
    int t=str.length();
while(t--)
    {
        str1=str1+str[t];

    }
return str1;
}*/
}
