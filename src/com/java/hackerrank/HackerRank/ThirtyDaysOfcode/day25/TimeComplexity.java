package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day25;
// https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
/*
  space time tradeoff
  speed
 fast
space

*/

import java.util.Scanner;

public class TimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            String result = isPrime(number);
            System.out.println(result);
        }
    }

    public static String isPrime(int number) {

        if (number == 1)
            return "Not prime";

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }
}
