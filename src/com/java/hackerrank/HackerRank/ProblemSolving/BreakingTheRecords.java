package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int count1 = 0, count2 = 0, min = scores.get(0), max = scores.get(0);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > max) {
                count1++;
                max = scores.get(i);
            }
            if (scores.get(i) < min) {
                count2++;
                min = scores.get(i);
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(count1);
        result.add(count2);

        return result;

    }
}
