package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/20/21 1:25 PM
 */
public class FinalQ {
    public static void main(String[] args)
    {
        int i = 2;
        final int j = 3;
        i = i + 1;     // line 1
       // j = j + 2;     // line 2 // cannot assign a value to final variable j
        System.out.print("i = " + i + " " + "j = " + j);
    }
}
