package com.java.hackerrank.GFG.mathematical;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @Author pankaj
 * @create 10/9/21 10:14 AM
 */
public class SwapTwoNumbers {
    static List<Integer> get(int a,int b)
    {
        // code here
        int temp= a;
        a=b;
        b=temp;
        return Arrays.asList(a,b);
    }
}
