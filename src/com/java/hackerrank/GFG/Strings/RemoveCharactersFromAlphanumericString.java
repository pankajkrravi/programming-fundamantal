package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/25/21 3:58 PM
Remove all characters except the numeric characters from an alphanumeric string.
 */
public class RemoveCharactersFromAlphanumericString {
    String removeCharacters(String S) {
        // code here
        String  str="";
        for (int i=0;i<S.length();i++){
            if (S.charAt(i) >='0' && S.charAt(i) <='9')
                str =str+S.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveCharactersFromAlphanumericString().removeCharacters("AA1d23cBB4"));
        System.out.println(new RemoveCharactersFromAlphanumericString().removeCharacters("a1b2c3"));
    }
}
