package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/1/21 12:00 PM
Given a string S, the task is to create a string with the first letter of every word in the string.


Example 1:

Input:
S = "geeks for geeks"
Output: gfg

Example 2:

Input:
S = "bad is good"
Output: big

Your Task:
You don't need to read input or print anything. Your task is to complete the function firstAlphabet() which takes string S as input parameter and returns a string that contains the first letter of every word in S.


Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)


Constraints:
1 <= |S| <= 105
S contains lower case English alphabets
Words have a single space between them.
 ************************************  Amazon *******************************
 */

public class PrintFirstLetterOfEveryWordInTheString {
    String firstAlphabet(String S) {
        // code here
        // sol -----------------1
       /* String arr1[] = S.split("\\ ");
        String res="";
        for(int i =0 ; i<arr1.length;i++)
        {
            res= res+  arr1[i].charAt(0);
        }
        return res;*/
        // sol -----------------2
        String resp="";
        for(String s:S.split(" ")){
            resp=resp+s.charAt(0);
        }
        return resp;
    }
}
