package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/10/21 4:55 PM
  ------------- MAQ Software -----------------------------------*/
public class Reversedigits {
    public long reverse_digit(long n)
    {
        // Code here
        long digit, sum=0,temp =n;
        while (temp > 0){
        digit =temp %10;
        sum = sum*10+digit;
            temp = temp/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(new Reversedigits()
        .reverse_digit(200));
    }
}
