package com.java.hackerrank.ForkJava.Module6;

import java.util.Calendar;

/**
 * @Author pankaj
 * @create 11/25/21 10:59 PM
Your task is to complete the function timeBeforeAfterNdays(n) which accepts n as an argument and accepts day, month, year. You have to display the day (Sunday , Monday etc) after adding n to given date. The output will be in number from 1 to 7.  1 is Sunday.

Input Format:
The first line of input contains T denoting thr number of testcases. T testcases follow. Each testcase contains single line of input: n, day, month, and year separated by spaces.

Output Format:
For each testcase, in a new line, print the required answer.

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the function timeBeforeAfterNdays that takes n, day, month, and year as parameters.

Constraints:
1 <= T <= 100
1 <= day <= 31
1 <= month <= 12

Examples:
1
3 15 08 1947
Output:
Day after n days: 2

 */
public class UsingCalendar {
    public static void timeBeforeAfterNdays(int d,int m,int y,int n)
    {
        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d);
        c.add(Calendar.DATE, n);
        System.out.println("day after n days: " + c.get(Calendar.DAY_OF_WEEK));
    }
}
