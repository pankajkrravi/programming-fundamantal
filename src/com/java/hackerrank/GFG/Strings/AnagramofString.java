package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/2/21 6:56 PM
Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

Example 1:

Input:
S1 = bcadeh
S2 = hea
Output: 3
Explanation: We need to remove b, c
and d from S1.
Example 2:

Input:
S1 = cddgk
S2 = gcd
Output: 2
Explanation: We need to remove d and
k from S1.
Your Task:
Complete the function remAnagram() which takes two strings S1, S2 as input parameter, and returns minimum characters needs to be deleted.

Expected Time Complexity: O(max(|S1|, |S2|)), where |S| = length of string S.
Expected Auxiliary Space: O(26)

Constraints:
1 <= |S1|, |S2| <= 105

 ******************************** Amazon ********************************
 */
public class AnagramofString {
    public int remAnagrams(String s,String s1)
    {
        //add code here.
        int co=0;
        int x=s.length(),y=s1.length();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            String r = Character.toString(c);
            if(s1.contains(r)){
                int p = s1.indexOf(r);
                s1 = s1.substring(0,p) + "" + s1.substring(p + 1);
            }
            else{
                co++;
            }
        }
        int sum = s1.length()+co;
        return sum;
    }
}
