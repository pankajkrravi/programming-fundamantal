package com.java.hackerrank.HackerRank.ProblemSolving;
// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
public class CatsAndMouse {
    static String catAndMouse(int x, int y, int z) {
        int a=Math.abs(x-z);
        int b=Math.abs(y-z);
        String c="";
        if(a==b){
            c="Mouse C";
        }else if(a<b){
            c="Cat A";
        }else{
            c="Cat B";
        }
        return c;
    }
}
