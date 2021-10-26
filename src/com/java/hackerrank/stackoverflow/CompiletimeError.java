package com.java.hackerrank.stackoverflow;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 10/26/21 9:58 AM
 */
public class CompiletimeError {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int sum=0;

        for(int i=0; i<t; i++)
        {
            int n=in.nextInt();

            for(int j=1; j<n; j++)
            {
                if(n%j==0)
                    sum=sum+j;
            }

            if(n==sum)
                System.out.println("true");

            else
                System.out.println("false");
        }
    }
}
