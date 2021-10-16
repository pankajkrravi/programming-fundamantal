package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/13/21 11:25 PM
 */
// Given an integer N, find the number of divisors of N that are divisible by 3.
public class NumberOfDivisors {
    static long count_divisors(int N) {
        // code here
        int countDivByThree = 0, i = 1;
        while (i <= N) {
            if (N %i == 0) {
                if (i %3 == 0) {
                    countDivByThree++;
                }
            }
            i++;
        }
        return countDivByThree;
    }

    public static void main(String[] args) {
        System.out.println(count_divisors(6));
        System.out.println(count_divisors(10));
    }
}
