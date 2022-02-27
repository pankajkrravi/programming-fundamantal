package com.java.hackerrank.HackerRank.ProblemSolving;

// https://www.hackerrank.com/challenges/day-of-the-programmer/problem
public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        if (year == 1918) {
            // transition year
            return "26.09.1918";
        } else if (((year % 4 == 0) && (year < 1918))
                || (year > 1918 && (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))) {
            // leap year
            return "12.09." + Integer.toString(year);
        }
        // not leap year
        return "13.09." + Integer.toString(year);
    }
}
