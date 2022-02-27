package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/picking-numbers/problem
public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int count = 1;
        int maxcount = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            int diff = 0;
            for (int j = i + 1; j < a.size(); j++) {
                diff = Math.abs(a.get(i) - a.get(j));
                if (diff <= 1) {
                    count++;
                }
            }
            if (count > maxcount)
                maxcount = count;
            count = 1;
        }
        return maxcount;
    }
}
