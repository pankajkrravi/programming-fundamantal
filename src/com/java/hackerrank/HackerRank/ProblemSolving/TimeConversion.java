package com.java.hackerrank.HackerRank.ProblemSolving;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/time-conversion/problem
public class TimeConversion {
 /* built-in support, here is the solution
    SimpleDateFormat class is in java.text package,

    Date class is in java.util package,*/

    public static String timeConversion(String s) {
        SimpleDateFormat in = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat out = new SimpleDateFormat("HH:mm:ss");
        String newTime = null;

        try {
            newTime = out.format(in.parse(s));
        } catch (ParseException e) {
        }
        return newTime;
    }

   /* public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String time = scan.next();
        String tArr[] = time.split(":");
        String AmPm = tArr[2].substring(2, 4);
        int hh, mm, ss;
        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0, 2));

        String checkPM = "PM", checkAM = "AM";
        int h = hh;
        if (AmPm.equals(checkAM) && hh == 12)
            h = 0;
        else if (AmPm.equals(checkPM) && hh < 12)
            h += 12;

        System.out.printf("%02d:%02d:%02d", h, mm, ss);
    }*/
}
