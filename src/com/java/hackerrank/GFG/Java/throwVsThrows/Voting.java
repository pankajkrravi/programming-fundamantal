package com.java.hackerrank.GFG.Java.throwVsThrows;

/**
 * @Author pankaj
 * @create 1/5/22 4:51 PM
 */
public class Voting {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new youngerAgeException("You are eligible to Vote!!");
            } else {
                System.out.println("You can Vote !!");
            }
        } catch (youngerAgeException youngerAgeException) {
            youngerAgeException.printStackTrace();
        }

    }
}
