package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/13/21 5:46 PM
 */
public class GCD {
    // extended Euclidean Algorithm
    public int gcd(int A , int B)
    {
        //code here
        if (A == 0)
            return B;
        return gcd(B%A, A);
    }
}
