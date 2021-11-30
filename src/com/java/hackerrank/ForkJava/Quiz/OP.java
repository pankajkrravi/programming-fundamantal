package com.java.hackerrank.ForkJava.Quiz;

import java.util.Calendar;

/**
 * @Author pankaj
 * @create 11/30/21 12:41 PM
 */
public class OP {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int min = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + min);

        min = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + min);
    }
}
