package com.java.hackerrank.ForkJava.Quiz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author pankaj
 * @create 11/30/21 12:29 PM
 */
public class ObjectToDate {
    public static void main(String[] args) {
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        sdf.parse(new Date());*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        sdf.format(new Date());
       /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        new Date().parse();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        new Date().format();*/
    }
}
