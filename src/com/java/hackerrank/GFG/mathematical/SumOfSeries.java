package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/13/21 5:03 PM
 */
public class SumOfSeries {
    long seriesSum(int n) {
        // code here
//        long sum=0;
//        while (n !=0){
//            sum =sum+n;
//            n--;
//        }
//        return sum;
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        System.out.print(new SumOfSeries().seriesSum(46341));
    }
}
