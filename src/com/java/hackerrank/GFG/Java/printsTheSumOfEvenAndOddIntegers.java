package com.java.hackerrank.GFG.Java;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 10/28/21 5:24 PM
 */
public class printsTheSumOfEvenAndOddIntegers {
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> resp=new ArrayList<Integer>(2);
            int i=1;
            int evenSum=0;
            int oddSum=0;
            while (i<=N){
                            if (i%2 ==0)
                                evenSum =evenSum+i;
                            else
                                oddSum = oddSum+i;
                i++;
            }
            resp.add(evenSum);
            resp.add(oddSum);
            return resp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result =getSum(1);
                System.out.println(result);
    }
}
