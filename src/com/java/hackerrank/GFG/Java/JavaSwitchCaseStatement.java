package com.java.hackerrank.GFG.Java;

import java.util.List;

/**
 * @Author pankaj
 * @create 10/28/21 6:15 PM
 */
public class JavaSwitchCaseStatement {
    static double switchCase(int choice, List<Double> arr){
        double area=0;
        // code here
                if (choice ==1)
                  area =   Math.PI*arr.get(0)*arr.get(0);// area of circle
                else  // area of rectangle
            area = arr.get(0)*arr.get(1);
                return area;
    }
}
