package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/19/21 12:04 PM
 */
public class CubeRootOfANumber {
    static int cubeRoot(int N) {
        // code here
        return  (int) Math.cbrt(N);
        //other way
        // return (int)Math.pow(N, 1/3.);
    }
}
