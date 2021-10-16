package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/10/21 5:33 PM
 */
public class SumOfAnAP {
    public int sum_of_ap(int n, int a, int d)
    {
        // Code here
        int sumOfAp=0;
        for(int i=1;i<=n;i++){
            sumOfAp = sumOfAp+a;
            a = a+d;
        }
        return sumOfAp;
    }

    public static void main(String[] args) {
        System.out.print(new SumOfAnAP().sum_of_ap(5,1,3));
    }
}
