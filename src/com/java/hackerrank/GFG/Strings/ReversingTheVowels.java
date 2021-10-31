package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/25/21 5:06 PM
 *    reverse only the vowels present in it and print the resulting
 *
  *************************************** Zoho, Flipkart **************************************/
public class ReversingTheVowels {
    boolean vowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
    String modify (String s)
    {
        int n=s.length();
        //code here.
        int i=0;
        int j=n-1;
        while(i<j){
            if(!vowel(s.charAt(i))){
                i++;
                continue;
            }else if(!vowel(s.charAt(j))){
                j--;
                continue;
            }
            int temp=s.charAt(i);
          //  s.charAt(i)=s.charAt(j);   // do fix it
         //   s.charAt(j)=temp;
            i++;
            j--;
        }
        return s;
    }
}
