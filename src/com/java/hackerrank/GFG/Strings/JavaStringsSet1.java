package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 9:40 PM
 */
public class JavaStringsSet1 {
    static String conRevstr(String S1, String S2) {
        // code here
        String concatenate = S1+S2;
        String resp ="";
        for (int i=concatenate.length()-1;i>=0;i--){
            resp =resp+concatenate.charAt(i);
        }
        return resp;
    }

    public static void main(String[] args) {
        System.out.println(conRevstr("Practice","Geeks"));
    }
}
