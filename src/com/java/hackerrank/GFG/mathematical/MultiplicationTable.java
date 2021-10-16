package com.java.hackerrank.GFG.mathematical;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 10/9/21 11:11 AM
 */
public class MultiplicationTable {
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> mList= new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            mList.add(N*i);
        }
        return mList;
    }

    public static void main(String[] args) {
      ArrayList aList=  MultiplicationTable.getTable(5);
    System.out.println(aList);
    };
}
