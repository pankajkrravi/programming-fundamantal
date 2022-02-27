package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://www.hackerrank.com/challenges/sock-merchant/problem
public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        int socksCount = 0;
        Map<Integer, Long> result = ar.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Long l : result.values()) {
            socksCount = socksCount + (int) (l / 2);
        }
        return socksCount;
    }
}
