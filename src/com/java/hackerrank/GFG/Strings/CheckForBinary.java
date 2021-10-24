package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 4:15 PM
 */
public class CheckForBinary {
     boolean isBinary(String str){
              char[] charArray =  str.toCharArray();
              int count = 0;
              boolean resp= false;
                       for (int i=0;i<str.length();i++){
                                    if (charArray[i] == '0' || charArray[i] =='1') {
                                        count++;
                                    }
                       }
         if (count ==str.length())
                                 resp= true;
                       return resp;
         }

    public static void main(String[] args) {
        System.out.print(new CheckForBinary().isBinary("101"));
    }
}
