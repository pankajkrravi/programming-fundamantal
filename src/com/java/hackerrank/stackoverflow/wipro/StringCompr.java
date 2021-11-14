package com.java.hackerrank.stackoverflow.wipro;

/**
 * @Author pankaj
 * @create 11/13/21 11:42 AM
 */
public class StringCompr {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";
        //if str1 ==null what is expected output
        str1 =null;
         //System.out.println(str1.equals("abc")); //NPE*/
         System.out.println("abc".equals(str1)); // false
    }
}
