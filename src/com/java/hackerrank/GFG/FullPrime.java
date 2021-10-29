package com.java.hackerrank.GFG;

/**
 * @Author pankaj
 * @create 10/28/21 7:03 PM
 * Check if it is Full Prime or not.
 * Note : A full prime number is one in which the number itself is prime and all its digits are also prime.
 */
public class FullPrime {
    static int fullPrime(int N) {
        //code here

        boolean actualNum = isPrime(N);
        while (N > 0) {
            int digit = N % 10;
            if (isPrime(digit) == false)
                return 0;
            N = N/10;
        }
        return 1;
    }

    public static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
    }
}
