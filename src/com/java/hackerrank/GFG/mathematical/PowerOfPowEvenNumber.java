package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/16/21 5:44 PM
 */
public class PowerOfPowEvenNumber {
    public long sum_of_square_evenNumbers(long n)
    {
        // Code here
        long i=1,sum=0,square=0;
        while (i <=n){
            square=square+2;
            sum =sum+(square*square);
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new PowerOfPowEvenNumber().sum_of_square_evenNumbers(2));
    }
}
