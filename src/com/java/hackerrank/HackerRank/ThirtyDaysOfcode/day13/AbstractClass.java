package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day13;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 1/19/22 3:56 PM
https://www.hackerrank.com/challenges/30-abstract-classes/problem
 */
public class AbstractClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
