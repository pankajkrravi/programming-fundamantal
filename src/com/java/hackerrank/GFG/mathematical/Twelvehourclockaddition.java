package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/17/21 10:25 PM
 */
public class Twelvehourclockaddition {
    static int clockSum(int num1, int num2){
        // code here
        int sumClock =num1+num2;
        if (sumClock == 12 || sumClock ==24)
            return 0;
        else  if (sumClock > 12)
            return  -(12-sumClock);
        else
            return sumClock;
    }

    public static void main(String[] args) {
        System.out.println(clockSum(5,7));
        System.out.println(clockSum(3,5));
        System.out.println(clockSum(6,9));
        System.out.println(clockSum(19,6)); // 2 o/p
    }
}
