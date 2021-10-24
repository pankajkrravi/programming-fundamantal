package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 4:07 PM
 */
public class ReverseAString {
    static String revStr(String s) {
          char cString [] =s.toCharArray();
          String res ="";
          for (int i=s.length()-1;i>=0;i--){
                res =res+cString[i];
            }
          return res;
      }

    public static void main(String[] args) {
        System.out.print(ReverseAString.revStr("GeeksforGeeks"));
    }
}
