package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/17/21 7:26 PM
 */
public class PowerOfPowOddNumbers {
    public long sum_of_square_oddNumbers(long n) {
        // Code here
        long i=1,odd=1,sumSquOdd=0;
        while (i  <= n ){
            sumSquOdd = sumSquOdd+(odd*odd);
            odd= odd+2;
            i++;
        }
        return sumSquOdd;
    }

    public static void main(String[] args) {
        System.out.println(new PowerOfPowOddNumbers().sum_of_square_oddNumbers(2));
    }
}
