package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/16/21 11:42 AM
 */
public class GreatestOfThreeNumbers {
    int greatestOfThree(int A, int B, int C) {
        // code here
        int great =0;
        if(A>=B && A>=C)
            great= A;
        else if (B >=A && B >= C)
            great= B;
        else
            great= C;
        return great;
    }

    public static void main(String[] args) {
        System.out.println(new GreatestOfThreeNumbers().greatestOfThree(0,1,5));
        System.out.println(new GreatestOfThreeNumbers().greatestOfThree(10,2,3));
        System.out.println(new GreatestOfThreeNumbers().greatestOfThree(550,1000,550000));
    }
}
