package com.java.hackerrank.ForkJava.Module1;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 11/9/21 9:21 PM
Before implementing any algorithm, we should be thorough with taking inputs. Here, we will learn how to read inputs.
You are given five inputs: a(integer), b(float ), c(long), d(byte), s(string) respectively. You need to take the input and print a, b, c, d and s in new line.
Read : Java I/O

Example 1:

Input:
5
2.5
6546854
120
geek for geeks

Output:
5
2.5
6546854
120
geek for geeks


Example 2:

Input:
6
3.5
7546854
220
suryansh is Legendary

Output:
6
3.5
7546854
220
suryansh is Legendary
User Task:
Your task is to complete the provided function IOFunction()
 */
public class TakingInputJava {
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            // Your code here
            int a=sc.nextInt();
            float b= sc.nextFloat();
            long c=sc.nextLong();
            byte d= sc.nextByte();
            String s =sc.nextLine();
            s=sc.nextLine();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(s);
        }

    }
}
