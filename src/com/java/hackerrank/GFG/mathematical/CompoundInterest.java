package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/21/21 7:46 PM
 */
public class CompoundInterest {
    static int getCompundInterest(int P , int T , int N , int R) {
        // code here
        //         double ci  =  P * Math.pow(1 + (R / N), N * T);
        double ci  =  P * (Math.pow((1 + R/100), (T * N))) - P;
          return (int) ci;
    }
}
