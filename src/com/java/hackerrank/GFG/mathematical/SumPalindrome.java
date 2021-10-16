package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/16/21 12:20 PM
 * ---------------------------------------------  Zoho --------------------------------------------
 */
public class SumPalindrome {
    static long isSumPalindrome(long n) {
        // code here, A.reverse B. cal sum
        // A.
        long reverse = reverseLong(n);
       // System.out.println(n + " Reverse = " + reverse);
        // B.
        long sum = n + reverse;
        // if palindrome return number else return -1( isPalindrome)
        if (reverseLong(sum) == sum)
            return sum;
        else
            return -1;
    }

    // reverse method
    public static long reverseLong(long number) {
        long reverse = 0;
        while (number > 0) {
            long digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(isSumPalindrome(23));
        System.out.println(isSumPalindrome(73));

    }
}
