package com.java.hackerrank.GFG.Strings;

import java.util.Calendar;

/**
 * @Author pankaj
 * @create 12/4/21 4:58 PM
Java Calendar class is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.

Given the date, month and year. Find what weekday it was.


Example 1:

Input:
Date = 17
Month = 03
Year = 2017
Output:
FRIDAY
Explanation:
Image result for calendar 2017 march
On 17th of March 2017 day is friday
Example 2:

Input:
Date = 29
Month = 11
â€‹Year = 2021
Output:
FRIDAY
Explanation:
Friday was the day on 29th November 2021

Your Task:
You don't need to read input or print anything. Your task is to complete the function findDay() which takes three integers Date, Month, Year as input parameters and returns the weekday in a string variable (weekday should be in uppercase).


Constraints:
2000<=Year<=3000


 */
public class JavaDateAndDay {
    static String findDay(int Day, int Month, int Year){
//Code Here
        Calendar cal = Calendar.getInstance();
        cal.set(Year,Month-1,Day);
        int value = cal.get(Calendar.DAY_OF_WEEK);
        String day="";
        switch(value){
            case 1:
                day="SUNDAY";
                break;
            case 2:
                day="MONDAY";
                break;
            case 3:
                day="TUESDAY";
                break;
            case 4:
                day="WEDNESDAY";
                break;
            case 5:
                day="THURSDAY";
                break;
            case 6:
                day="FRIDAY";
                break;
            case 7:
                day="SATURDAY";
                break;

        }
        return day;
    }
}

// =================== GQ ====================