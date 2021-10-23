package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/19/21 1:21 PM
 */
public class SumOfGP {
    public long sum_of_gp(long n, long a, long r)
    {
        // Code here
        long i=1,sum =0;
        while (i <=n){
            sum =sum+a;
            a=a*r;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
    System.out.println(new SumOfGP().sum_of_gp(3,3,2));
    }
}
