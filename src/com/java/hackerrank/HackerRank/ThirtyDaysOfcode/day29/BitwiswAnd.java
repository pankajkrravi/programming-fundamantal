package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day29;

// https://www.hackerrank.com/challenges/30-bitwise-and/problem
public class BitwiswAnd {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int eb = 0;
        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int result = i & j;
                if (result > eb && result < K) {
                    eb = result;
                }
            }
        }
        return eb;
    }
}
