package com.java.hackerrank.HackerRank.ProblemSolving;

// https://www.hackerrank.com/challenges/counting-valleys/problem
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count = 0;
        int level = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                level++;
            } else if (path.charAt(i) == 'D') {
                level--;
            }
            if (level == 0 && i > 0 && path.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
}
