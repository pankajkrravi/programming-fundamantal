package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/25/21 3:48 PM
ount the number of Camel Case characters in it.
  */
public class CountOfCamelCaseCharacters {
    int countCamelCase(String s) {
        // your code here
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountOfCamelCaseCharacters().countCamelCase("ckjkUUYII"));
        System.out.println(new CountOfCamelCaseCharacters().countCamelCase("abcd"));
    }
}