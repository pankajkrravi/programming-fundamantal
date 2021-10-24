package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 8:28 PM
  --------  Delete the characters at odd indices of the string. -------
 */
public class DeleteAlternateCharacters {
    static String delAlternate(String S) {
        // code here
            String resp ="";
        for (int i=0;i<S.length();i= i+2){
                        resp = resp+S.charAt(i);
        }
        return resp;
    }

    public static void main(String[] args) {
        System.out.println(delAlternate("Geeks"));
    }
}
