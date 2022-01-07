package com.java.hackerrank.GFG.Java.ExceptionHandling;

/**
 * @Author pankaj
 * @create 1/4/22 10:25 PM
 */
public class tryCatchEx {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver.");// Risky code
        } catch (ClassNotFoundException e) {
            e.printStackTrace();// handling code
        }
    }
}
