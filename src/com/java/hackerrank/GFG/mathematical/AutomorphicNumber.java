package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/19/21 1:39 PM
 */
public class AutomorphicNumber {
    public String is_AutomorphicNumber(int n) {
        // Code here
        int squareNum = n * n;
        while (n > 0) {
            //find the remainder (last digit) of the variable num and square and comparing them
            if (n % 10 != squareNum % 10)
                return "Not Automorphic";
            //reduce num and square by dividing them by 10
            n = n / 10;
            squareNum = squareNum / 10;
        }
        return "Automorphic";
    }
}