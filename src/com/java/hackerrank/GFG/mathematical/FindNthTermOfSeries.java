package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/9/21 6:21 PM
 */
// Find n-th term of series 1, 3, 6, 10, 15, 21
public class FindNthTermOfSeries {
    static int findNthTerm(int N) {
        // code here
        int sumOfNaturalNumber=0;
        while (N >= 1){
            sumOfNaturalNumber=sumOfNaturalNumber+N;
            N--;
        }
        return sumOfNaturalNumber;
    }
}
