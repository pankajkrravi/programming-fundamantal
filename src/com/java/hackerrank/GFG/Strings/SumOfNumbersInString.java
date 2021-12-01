package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/1/21 11:29 AM
Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

Example 1:

Input:
str = 1abc23
Output: 24
Explanation: 1 and 23 are numbers in the
string which is added to get the sum as
24.
Example 2:

Input:
str = geeks4geeks
Output: 4
Explanation: 4 is the only number, so the
sum is 4.
Your Task:
The task is to complete the function findSum() which finds and returns the sum of numbers in the string.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= length of the string <= 105
Sum of Numbers <= 105
 */

public class SumOfNumbersInString {
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str) {
        // your code here
        long sum = 0;
        String s = "0";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9')
                s += ch;
            else {
                sum += Integer.parseInt(s);
                s = "0";
            }
        }
        sum += Integer.parseInt(s);
        return sum;
    }
}
