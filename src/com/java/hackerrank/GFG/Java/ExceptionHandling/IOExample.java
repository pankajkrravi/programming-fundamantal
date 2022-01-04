package com.java.hackerrank.GFG.Java.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author pankaj
 * @create 1/4/22 12:10 PM
 */
public class IOExample {
    public static void main(String[] args) {
        //read file

        try {
            FileInputStream inputStream = new FileInputStream("/home/pankaj/intelijCommunity21/Hackerrank/src/IO/data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

