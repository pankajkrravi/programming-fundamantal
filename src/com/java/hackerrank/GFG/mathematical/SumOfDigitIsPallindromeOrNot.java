package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/13/21 5:51 PM
  --------------- SNAPDEAL -----------------*/

public class SumOfDigitIsPallindromeOrNot {
    int isDigitSumPalindrome(int N) {
        // code here
        // code for sum of digit
        int sum=0;
        while (N !=0){
            int digit = N%10;
            sum = sum+digit;
            N= N/10;
        }
        // code for reverse number
        int sumOfDigit =sum;
        int reverse =0;
        while (sumOfDigit > 0){
            int digit = sumOfDigit%10;
            reverse = reverse*10+digit;
                sumOfDigit= sumOfDigit/10;
        }
   if (sum == reverse)
       return 1;
    else
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(new SumOfDigitIsPallindromeOrNot().isDigitSumPalindrome(56));
    }

}
