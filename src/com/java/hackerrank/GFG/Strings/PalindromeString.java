package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/3/21 2:28 PM
 WAJP with String as an argument and print weather its palindrome or not */
public class PalindromeString {
        public static void checkIsPalindrome(String str){
            String actual =str;
                String s="";
            for (int i=str.length()-1;i>=0;i--){
                s+=str.charAt(i);
            } if (actual.equals(s)){
                System.out.println(actual+" is Palindrome !!!!");
            }else{
                System.out.println(actual+" is not a palindrome !!!!!");
            }
        }

    public static void main(String[] args) {
        checkIsPalindrome("mam");
        checkIsPalindrome("abba");
        checkIsPalindrome("geeks");
    }
}
