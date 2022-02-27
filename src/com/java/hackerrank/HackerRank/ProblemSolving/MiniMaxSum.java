package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.hackerrank.com/challenges/mini-max-sum/problem
public class MiniMaxSum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
       /* // Write your code here
        Collections.sort(arr);
        Integer min = 0;
        for (int i = 0; i < 4; i++) {
            min += arr.get(i);
        }
        Integer max = 0;
        Integer length = arr.size() - 1;
        for (int i = 0; i < 4; i++) {
            max += arr.get(length);
            length--;
        }
        System.out.println(min + " " + max);
    }*/
        Collections.sort(arr);
        long b = 0;
        long c = 0;
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            b = arr.get(i);
            min = min + b;
        }
        for (int j = 1; j < arr.size(); j++) {
            c = arr.get(j);
            max = max + c;
        }
        System.out.print(min + " " + max);
    }
}
