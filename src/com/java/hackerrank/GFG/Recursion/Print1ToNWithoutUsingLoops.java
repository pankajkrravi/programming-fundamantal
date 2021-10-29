package com.java.hackerrank.GFG.Recursion;

/**
 * @Author pankaj
 * @create 10/29/21 7:21 PM
 */
public class Print1ToNWithoutUsingLoops {
    static void printTillN(int N){
        // code here
        if(N>0){
            printTillN(N-1);
            System.out.print(N + " ");
        }
        return;
    }

    public static void main(String[] args) {
        printTillN(5);
    }
}