package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day12;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 1/19/22 2:59 PM
 * https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
 */
public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

