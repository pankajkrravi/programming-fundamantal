package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/20/21 1:18 PM
 */
public class PreDf {
    void fun1(int a, int b)
    {
        System.out.print(a + " " + b + "," + " ");
    }
    static void fun2(int a, int b)
    {
        System.out.print(a + " " + b + "," + " ");
    }

    int x = 20;
    static int y = 30;
    public static void main (String[] args)
    {
        PreDf obj = new PreDf();
        obj.fun1(2, 3);       // line 1
        fun2(4, 5);           // line 2
        obj.x = 30;           // line 3
        System.out.print(obj.x + " ");  // line 4
        System.out.print(y);            // line 5
    }
    //object obj is required to access fun1() because it is non-static function which is going to be accessed in static function. fun2() can be accessed without object. Similarly for the non-static and static variable x and y.

}
