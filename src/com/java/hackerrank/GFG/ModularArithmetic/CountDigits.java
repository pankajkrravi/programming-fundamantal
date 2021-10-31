package com.java.hackerrank.GFG.ModularArithmetic;

/**
 * @Author pankaj
 * @create 10/31/21 1:59 PM
Given a number N. Count the number of digits in N which evenly divides N.


Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly
Example 2:

Input:
N = 23
Output
0
Explanation:
2 and 3, none of them
divide 23 evenly*/
public class CountDigits {
    static int evenlyDivides(int N){
        // code here
                int actualNumber =N;
                int count =0;
                while (actualNumber >0){
                    int digit = actualNumber%10;
                    if (digit !=0 && N %digit ==0) { // Exception in thread "main" java.lang.ArithmeticException: / by zer
                        count++;
                    }
                    actualNumber =actualNumber/10;
                }
                return count;
    }

    public static void main(String[] args) {
        System.out.println(evenlyDivides(12));
        System.out.println(evenlyDivides(23));
    }
}
