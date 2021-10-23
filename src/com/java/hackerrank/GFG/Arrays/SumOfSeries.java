package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/22/21 12:18 PM
 */
public class SumOfSeries {
    int seriesSum(int n) {
        // code here
        int i=1;
        int sum=0;
        while (i<=n){
            sum = sum+i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new SumOfSeries().seriesSum(1));
        System.out.println(new SumOfSeries().seriesSum(5));

    }
}
