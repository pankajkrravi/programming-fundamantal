package com.java.hackerrank.ForkJava.Module3;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
/**
 * @Author pankaj
 * @create 11/19/21 9:10 PM
Given two positive integers X and Y. You have to add two integers and output their sum.



Example 1:

Input:
X = 3, Y = 4
Output:
7
Explanation:
Sum of X and Y is 7


Example 2:

Input:
X = 8, Y = 2
Output:
10
Explanation:
Sum of X and Y is 10.


Your Task:
Your task is to complete the function add() which accepts BigIntegers x and y as input parameters, and returns their sum.
 */
public class SumOfBigIntegers {
    static BigInteger add(BigInteger x, BigInteger y){

        // Your code here
        return x.add(y);
    }
}
