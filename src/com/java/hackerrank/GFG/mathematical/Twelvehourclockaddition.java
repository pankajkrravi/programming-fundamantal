package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/17/21 10:25 PM
 */
public class Twelvehourclockaddition {
    static int clockSum(int num1, int num2){
// code here
        int output=num1+num2;
        return output%12;
    }

    public static void main(String[] args) {
        System.out.println(clockSum(5,7));
        System.out.println(clockSum(3,5));
        System.out.println(clockSum(6,9));
        System.out.println(clockSum(19,6)); // 2 o/p
    }
}
