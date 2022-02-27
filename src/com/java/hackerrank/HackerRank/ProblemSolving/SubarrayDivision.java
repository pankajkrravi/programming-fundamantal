package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class SubarrayDivision {
    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            int f = m;
            for (int j = 0; j < f; j++) {
                if ((i + j) < s.size()) {
                    int c = s.get(j + i);
                    sum = sum + c;
                } else {
                    break;
                }

            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }
}
