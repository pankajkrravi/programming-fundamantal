package com.java.hackerrank.HackerRank.ProblemSolving;

import java.util.List;

// https://www.hackerrank.com/challenges/bon-appetit/problem
public class BillDivision {
    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        bill.remove(k);
        int totalCost = 0;
        for (int i = 0; i < bill.size(); i++) {
            int cost = bill.get(i);
            totalCost = totalCost + cost;
        }
        int paid = totalCost / 2;
        int charged = b - paid;
        if (paid == b || charged < 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(charged);
        }

    }
}
