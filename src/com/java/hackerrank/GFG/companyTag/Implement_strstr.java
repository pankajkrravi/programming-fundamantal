package com.java.hackerrank.GFG.companyTag;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 1/12/22 10:59 AM
 */
class Implement_strstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            String b = line.split(" ")[1];

            ImplementStrstr g = new ImplementStrstr();
            System.out.println(g.strstr(a, b));

            t--;
        }
    }
}