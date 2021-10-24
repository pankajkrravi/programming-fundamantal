package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 10/24/21 5:06 PM
 */
public class ConvertAListOfCharactersIntoAString {
    public String chartostr(char arr[], int N){
                String resp="";
                for (int i=0;i<N;i++){
                    resp=  resp+arr[i];
                }
                return resp;
               /* // Approach 2
            return new String(arr);*/
    }

    public static void main(String[] args) {
        System.out.println(new ConvertAListOfCharactersIntoAString().
                chartostr(new char[]{'g','e','e','k','s','f','o','r','g','e','e','k','s'},13));
    }
}
