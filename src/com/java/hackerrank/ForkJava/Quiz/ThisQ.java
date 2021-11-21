package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/20/21 1:26 PM
 */
public class ThisQ {
    int a = 0, b = 0;
    ThisQ()
    {
        this(10, 20);
        System.out.println(10 + 30);
    }

    ThisQ(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }
    public static void main(String[] args)
    {
      //  GFG obj = new GFG();
    }
}
