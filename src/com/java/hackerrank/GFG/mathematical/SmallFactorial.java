package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/10/21 3:58 PM
 */
public class SmallFactorial {
    public long find_fact(int n) {
        // Code here
        long fact =1;
        while (n > 0){
            fact= fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(new SmallFactorial().find_fact(12));
    }
}
