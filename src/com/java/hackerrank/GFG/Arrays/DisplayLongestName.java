package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 10/23/21 2:05 PM
 */
public class DisplayLongestName {
    String longest(String names[], int n) {
        String str;
        int preLength=0;
        int currentLength,index=0;
        for (int i=0;i<n;i++){
            str = names[i];
            currentLength=str.length();
            if (preLength < currentLength) {
                preLength = currentLength;
                index=i;
            }
        }
        return  names[index];
    }

    public static void main(String[] args) {
        System.out.println(new DisplayLongestName().longest(new String[]{ "Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks" },5));

    }
}
