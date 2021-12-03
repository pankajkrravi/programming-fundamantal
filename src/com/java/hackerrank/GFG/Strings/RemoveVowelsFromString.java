package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 5:31 PM
 * ----------------- Given a string, remove the vowels from the string. -------------
 * ************************** GE  ************************************
 */
public class RemoveVowelsFromString {
    String removeVowels(String S) {
        // code here
        String strResp = "";
        char charArray[] = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u')
                strResp = strResp + " ";
            else
                strResp = strResp + charArray[i];
        }
        return strResp;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveVowelsFromString().removeVowels("welcome to geeksforgeeks"));
        System.out.println(new RemoveVowelsFromString().removeVowels("&%^oq^" ));// &%^q^
    }
}
 // ========================= Tcase failed =========================