package com.java.hackerrank.GFG.Recursion;

/**
 * @Author pankaj
 * @create 10/30/21 11:09 PM
 */
public class Print1ToNWithoutLoop {
    public void printNos(int N) {
        if(N>0){
            printNos(N-1);
            System.out.print(N + " ");
        }
        return;
    }
}
