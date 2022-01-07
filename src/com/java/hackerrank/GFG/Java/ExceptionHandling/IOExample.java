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
            // checked exception - 1
            FileInputStream inputStream = new FileInputStream("/home/pankaj/intelijCommunity21/Hackerrank/src/IO/data.txt");
            try {
                // checked exception - 2
                Class.forName("com.mysql.jdbc.Driver"); //
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

