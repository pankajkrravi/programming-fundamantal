package com.java.hackerrank.HackerRank;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 1/17/22 12:05 AM
https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true
 */
public class BinaryNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rem=0,s=0,t=0;


        while(n>0)
        {
            rem=n%2;
            n=n/2;
            if(rem==1)
            {   s++;
                if(s>=t)

                    t=s;

            }
            else{

                s=0;
            }
        }

        System.out.println(t);
    }
}
