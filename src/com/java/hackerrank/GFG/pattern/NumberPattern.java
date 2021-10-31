package com.java.hackerrank.GFG.pattern;

import java.util.ArrayList;

/** ****************************************************************
 * @Author pankaj
 * @create 10/31/21 11:13 PM
For a given number N. Print the pattern in the following form: 1 121 12321 1234321 for N = 4.

Example 1:

Input:
N = 3
Output:
1 121 12321
Explanation:
For N = 3 we will print the 3 strings
according to the pattern.
Example 2:

Input:
N = 6
Output:
1 121 12321 1234321 123454321 12345654321
Explanation:
For N = 6 we will print the 6 strings
according to the pattern.*/
public class NumberPattern {
    ArrayList<String> numberPattern(int N){
        // code here
        ArrayList<String> arrayList=new ArrayList<>();
        String L="1",R="1";
        arrayList.add("1");
        for (int i=2;i<=N;i++){
            arrayList.add(L+i+R);
            L = L+i;
            R =i+R;
        }
        return arrayList;
    }
}
