package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/31/21 3:23 PM
Given two positive integers num1 and num2, subtract num2 from num1 on a 12 hour clock rather than a number line.
Note: Assume the Clock starts from 0 hour to 11 hours.



Example 1:

Input:
num1 = 7, num2 = 5
Output:
2
Explanation:
7-5 = 2. The time in a 12 hour clock is 2.
Example 2:

Input:
num1 = 5, num2 = 7
Output:
10
Explanation:
5-7 = -2. The time in a 12 hour clock is 10.*/
public class TwelveHourClockSubtraction {
    static int subClock(int num1, int num2) {
        int total=(num1-num2)%12;
        if (total <0)
            return (total+12);
        else
            return (num1-num2)%12;

    }
}
