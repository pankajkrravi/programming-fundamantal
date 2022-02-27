package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// https://www.hackerrank.com/challenges/migratory-birds/problem
public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> types = new HashMap<>();
        int count = 0;
        for (
                int i = 0; i < arr.size(); i++) {
            int b = arr.get(i);
            if (types.containsKey(b)) {
                int number = types.get(arr.get(i));
                types.put(arr.get(i), number + 1);
            } else {
                types.put(arr.get(i), 1);
            }
        }

        int maxValueInMap = (Collections.max(types.values()));
        int b = 0;
        for (
                Integer o : types.keySet()) {
            if (types.get(o).equals(maxValueInMap)) {
                b = o;
                break;
            }
        }
        return b;
    }
}