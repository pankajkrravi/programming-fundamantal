package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/31/21 4:10 PM
Given a number N in the form of string, the task is to check if the number is divisible by 5.

Example 1:
Input:
N = "5"
Output:
1
Explanation:
5 is divisible by 5.*/
public class CheckIfDivisibleBy5 {
    static int divisibleBy5(String N){
        // code here
        int length = N.length();
        int lastDigit=N.charAt(length-1)-'0';
        if(lastDigit==0 || lastDigit==5){
            return 1;
        }
        return 0;
    }
}
