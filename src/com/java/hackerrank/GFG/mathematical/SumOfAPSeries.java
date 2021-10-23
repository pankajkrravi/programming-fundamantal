package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/17/21 6:51 PM
 */
/*A series with same common difference is known as arithmetic series. The first term of series is 'a'
        and common difference is d. The series looks like a, a + d, a + 2d, a + 3d, . . . Find the sum of series upto nth term.*/
public class SumOfAPSeries {
    public long sum_of_ap(long n, long a, long d) {
        // Code here
        long  i= 0,sum = 0;
        while (i<n){
            sum = sum +a;
            a=a+d;
            i++;
        }
        return  sum;
    }

    public static void main(String[] args) {
        System.out.println(new SumOfAPSeries().sum_of_ap(5,1,3));
    }
}
 // formula sum = (n / 2) * (2 * a + (n - 1) * d);