package com.java.hackerrank.GFG.pattern;

/**
 * @Author pankaj
 * @create 10/29/21 7:53 PM
 */
public class PatternPrinting {
    static void printPattern(int N){
        // code here
        for (int i=0;i<N;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" );
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
       // printPattern(5);
        printPattern(3);
    }
}
