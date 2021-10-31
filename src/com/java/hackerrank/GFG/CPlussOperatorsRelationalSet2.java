package com.java.hackerrank.GFG;

/**
 * @Author pankaj
 * @create 10/31/21 11:28 PM
Given two numbers A and B and task is to check whether A is greater than or less than or equals to B.



Example 1:

Input:
A = 2, B = 5
Output:
2 is less than 5
Explanation:
The output is self-
explanatory.


Example 2:

Input:
A = 6, B = 3
Output:
6 is greater than 3
Explanation:
The output is self-
explanatory.
 */
public class CPlussOperatorsRelationalSet2 {
    static String compareNum(int A, int B){
        // code here
            if (A<B)
                return  ""+A+" is less than "+B;
            else if (A>B)
                return  ""+A+ " is greater than  "+B;
            else
                return A +"is equals to "+ B;
    }
}
