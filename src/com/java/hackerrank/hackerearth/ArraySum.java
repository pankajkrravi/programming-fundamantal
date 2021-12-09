package com.java.hackerrank.hackerearth;

    import java.util.Scanner;

/**
 * @Author pankaj
 * @create 12/9/21 5:58 PM
 * Problem
 * You are given an array A consisting of N integers.
 * <p>
 * Task
 * <p>
 * Print the sum of the elements in the array.
 * <p>
 * Note: Some of the integers may be quite large.
 * <p>
 * Input Format
 * <p>
 * The first line contains a single integer N denoting the size of the array.
 * The next line contains space-separated integers denoting the elements of the array.
 * Output format
 * <p>
 * Print a single value representing the sum of the elements in the array.
 * <p>
 * Constraints
 * <p>
 * 1<=N<=10
 * <p>
 * 0<=a[i]<=10^10
 */
public class ArraySum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        long a[] = new long[n];

        long sum = 0;

        for (int i = 0; i < n; i++) {

            a[i] = s.nextInt();

        }
        for (int i = 0; i < n; i++) {

            sum = sum + a[i];
        }
        System.out.println(sum);
    }

}
