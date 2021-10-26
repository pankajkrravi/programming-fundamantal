package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/25/21 12:56 PM
count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.
Note: There are no white spaces in the string.

 ****************************  Amazon, MakeMyTrip *******************/
public class CountTypeOfCharacters {
    int[] count (String s) {
        // your code here
                int resp [] =new int[4];
                int uppercase=0,lowercase=0,numeric=0,special=0;
                for (int i=0;i<s.length();i++){
                          if (s.charAt(i)>= 'A' && s.charAt(i) <='Z')
                              uppercase++;
                          else if (s.charAt(i)>='a' && s.charAt(i) <='z')
                              lowercase++;
                          else if (s.charAt(i)>= '0' && s.charAt(i) <='9')
                              numeric++;
                          else
                              special++;

                            resp[0] = uppercase ;
                            resp[1] =  lowercase;
                            resp[2] = numeric ;
                            resp[3] =  special;
                }
                return resp;
    }

    public static void main(String[] args) {
        int [] countTypeChar =new CountTypeOfCharacters().count("#GeeKs01fOr@gEEks07");
        for (int v: countTypeChar) {
            System.out.println(v);
        }
    }
}
