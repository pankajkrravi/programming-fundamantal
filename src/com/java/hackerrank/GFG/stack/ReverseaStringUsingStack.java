package com.java.hackerrank.GFG.stack;

import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/6/21 6:45 PM
You are given a string S, the task is to reverse the string using stack.



Example 1:


Input: S="GeeksforGeeks"
Output: skeeGrofskeeG


Your Task:
You don't need to read input or print anything. Your task is to complete the function reverse() which takes the string S as an input parameter and returns the reversed string.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)



Constraints:
1 ≤ length of the string ≤ 100*/
public class ReverseaStringUsingStack {
    public String reverse(String S){
        //code here
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<S.length();i++){
            stack.push(S.charAt(i));
        }
        StringBuffer stringBuffer=new StringBuffer();
        while(!stack.isEmpty()){
            stringBuffer.append(stack.pop());
        }
        return new String(stringBuffer);
    }
}
