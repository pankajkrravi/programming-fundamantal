package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 9:54 PM
 ---------- convert the first letter of each word in the string to uppercase.  ------
 ******************** Nagarro *********************/
public class UpperCaseConversion {
    public String transform(String s) {
        // code here
       char [] charArray =s.toCharArray();
         charArray[0] = charArray[0-32];
        for (int i=0;i<s.length();i++){
            if (charArray[i] ==' ')
                charArray[i+1] =charArray[i-32];
        }
    return  new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(new UpperCaseConversion().transform("i love programming"));
    }
}
// ========================= Need to fix it =======================