package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.hackerrank.com/challenges/between-two-sets/problem
public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Set<Integer> factors = new HashSet<>();
        int first = b.get(0);
        factors.add(1);
        factors.add(first);
        for (int i = 2; i <= first / 2; i++) {
            if (first % i == 0)
                factors.add(i);
        }

        factors.removeIf(f -> {
            for (Integer n : b) {
                if (n % f != 0) return true;
            }
            for (Integer n : a) {
                if (f % n != 0) return true;
            }
            return false;
        });

        return factors.size();
    }
}
