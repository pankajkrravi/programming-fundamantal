package com.java.hackerrank.corejavacollections.cursors.Enumeration;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

/**
 * @Author pankaj
 * @create 1/16/22 11:06 PM
 */
public class EnumerationEx {
    public static void main(String[] args) {
        Vector vector = new Vector();
        System.out.println("Enter the elements :::");
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            Integer iVal = scanner.nextInt();
            vector.add(iVal);
        }
        System.out.println("Vector : " + vector);
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Integer integer = (Integer) enumeration.nextElement();
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }
}
