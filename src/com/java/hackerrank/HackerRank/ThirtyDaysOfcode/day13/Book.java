package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day13;

/**
 * @Author pankaj
 * @create 1/19/22 3:59 PM
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

