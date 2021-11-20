package com.java.hackerrank.ForkJava.Quiz;

import java.util.Comparator;

/**
 * @Author pankaj
 * @create 11/20/21 1:35 PM
 */
public class Compare implements Comparator<String> {
    public int compare(String Emp1, String Emp2) {
        return Emp1.compareTo(Emp2);
    }


    public static void main(String[] args) {

        Compare obj = new Compare();
        if (obj.compare("Harsh", "Sahil") < 0)
            System.out.print("Sahil");
        else
            System.out.print("Harsh");
    }
}

