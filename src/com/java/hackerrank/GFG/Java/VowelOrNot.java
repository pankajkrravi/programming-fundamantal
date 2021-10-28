package com.java.hackerrank.GFG.Java;

/**
 * @Author pankaj
 * @create 10/28/21 5:44 PM
 */
public class VowelOrNot {
    String isVowel(char c){
        // code here
        if (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U'  )
            return "YES";
            return "NO";
    }
}
