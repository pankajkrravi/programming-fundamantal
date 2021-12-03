package com.java.hackerrank.GFG.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pankaj
 * @create 12/2/21 9:40 PM
Given a string str. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:

Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.
Example 2:

Input:
str = output
Output: t
Explanation:  t and u are the characters
with the same frequency, but t is
lexicographically smaller.
Your Task:
The task is to complete the function getMaxOccuringChar() which returns the character which is most occurring.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |s|

Constraints:
1 ≤ |s| ≤ 100
 ********************************** Flipkart **************************************8888
 */
public class MaximumOccuringCharacter {
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char max=line.charAt(0);
        int curr=-1;
        for(char a:line.toCharArray()){
            if(hm.containsKey(a))
                hm.put(a,hm.get(a)+1);
            else
                hm.put(a,1);
        }
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue()>curr){
                max = entry.getKey();
                curr = entry.getValue();
            }
            else if(entry.getValue()==curr){
                int ascii = Math.min(entry.getKey(),max);
                max = (char)ascii;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("output"));
    }
}

