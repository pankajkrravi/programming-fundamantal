package com.java.hackerrank.ForkJava.Module3;

import java.math.BigInteger;
/**
 * @Author pankaj
 * @create 11/19/21 9:18 PM
Given two BigIntegers X and Y. You have to multiply X and Y.



Example 1:

Input:
X = 3, Y = 4
Output:
12
Explanation:
Multiplication of X and Y is 12


Example 2:

Input:
X = 8, Y = 2
Output:
16
Explanation:
Multiplication of X and Y is 16.


Your Task:
Your task is to complete the function mul() which accepts x and y as input parameters and returns their multiplication.


 */
public class BigIntegerMultiply {
    static BigInteger mul(BigInteger x, BigInteger y){

        // Your code here
        return x.multiply(y);
    }
}
