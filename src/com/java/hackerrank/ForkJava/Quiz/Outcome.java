package com.java.hackerrank.ForkJava.Quiz;

import java.util.Calendar;

/**
 * @Author pankaj
 * @create 11/30/21 12:39 PM
 */
public class Outcome {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in a week: " + max);

        max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in a year: " + max);
    }
}
