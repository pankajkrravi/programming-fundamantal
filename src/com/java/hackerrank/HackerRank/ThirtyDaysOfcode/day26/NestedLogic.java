package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-nested-logic/problem
public class NestedLogic {
    public static void main(String[] args) {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        int dayR = scan.nextInt();
        int monthR = scan.nextInt();
        int yearR = scan.nextInt();

        int dayE = scan.nextInt();
        int monthE = scan.nextInt();
        int yearE = scan.nextInt();

        System.out.println((yearR > yearE) ? 10000 : (monthR > monthE && yearR >= yearE) ? 500 * (monthR - monthE) : (dayR > dayE && monthR >= monthE && yearR >= yearE) ? 15 * (dayR - dayE) : 0);

    }
}