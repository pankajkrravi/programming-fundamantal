package com.java.hackerrank.GFG.companyTag;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 1/13/22 4:04 PM
 */
class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new ReplaceAll0swith5().convertfive(N));
            T--;
        }
    }
}