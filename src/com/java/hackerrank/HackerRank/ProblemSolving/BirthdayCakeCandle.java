package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class BirthdayCakeCandle {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        int maxCandle = Collections.max(candles);
        return Collections.frequency(candles, maxCandle);
    }

}
