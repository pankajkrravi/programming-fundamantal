package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day13;

/**
 * @Author pankaj
 * @create 1/19/22 4:00 PM
 */
public class MyBook extends Book {
    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
