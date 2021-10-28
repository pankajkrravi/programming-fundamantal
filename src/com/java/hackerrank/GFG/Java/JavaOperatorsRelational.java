package com.java.hackerrank.GFG.Java;

/**
 * @Author pankaj
 * @create 10/28/21 6:23 PM
Given two numbers you will have to check whether the first number is greater than or
less than or equals to the second number.*/

public class JavaOperatorsRelational {
    static void relationalOperators(int A,int B){
        // code here
            if (A>B)
                System.out.println(A+" is greater than "+B);
                else if (B>A)
                System.out.println( A+" is less than "+B);
            else
                System.out.println(A+" is equals to "+B);
    }
}
