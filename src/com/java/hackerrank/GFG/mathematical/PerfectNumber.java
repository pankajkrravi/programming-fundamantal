package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/11/21 10:10 PM
 */
public class PerfectNumber {
    int isPerfect(int N) {
        // code here
        int digit,sum=0;
        while(N > 0){
            // find digit
            //find digit !
            // store in sum
            // remove last digit
            digit = N % 10;
            int calFact =1,factTotal=0;
            while(calFact <= digit ){
                factTotal= calFact;
            }
            N = N/10;
        }
        return 1;
    }
}
