package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/21/21 7:46 PM
 */
public class CompoundInterest {
    static int getCompundInterest(int P , int T , int N , int R) {
        double amount =(double) P *Math.pow((1 + ((double)R / 100) / (double)N ), (double)N * (double)T);

        return (int) amount;

    }
}
