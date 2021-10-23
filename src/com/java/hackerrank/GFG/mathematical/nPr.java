package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/21/21 8:06 PM
 */
/*   Input: n = 2, r = 1
           Output: 2
           formulas:  P(n, r) = n! / (n−r)!.
           Explaination: 2!/(2-1)! = 2!/1! = (2*1)/1 = 2.*/
public class nPr {
    static long nPr(long n, long r){
        // code here--> A. find factorial; , B.
        return  factorial(n)/factorial(n-r);
    }
    public static  long factorial(long number){
            long factSum=1;
            while (number > 0){
                factSum = factSum*number;
                number--;
            }
        return factSum;
    }

    public static void main(String[] args) {
        System.out.println(nPr(2,1));
        System.out.println(nPr(3,3));

    }
}
