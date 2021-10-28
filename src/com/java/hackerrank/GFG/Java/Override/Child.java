package com.java.hackerrank.GFG.Java.Override;

/**
 * @Author pankaj
 * @create 10/28/21 5:00 PM
 */
class Child extends Parent
{
    @Override
    void show(int p) { System.out.print(p+" "); }

    @Override
    void print(int q) {
        //Add your code here.
            System.out.print(q*q);
    }
}
