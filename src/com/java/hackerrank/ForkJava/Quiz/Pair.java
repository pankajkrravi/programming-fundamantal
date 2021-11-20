package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/20/21 1:40 PM
 */

class Pair {
    int x = 0, y = 0;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Pair p[] = new Pair[]{new Pair(2, 3), new Pair(4, 5), new Pair(6, 7)};
        System.out.println(p[0].x + " " + p[1].y);
        System.out.println(p.length);
    }
}
// Pair p[] = new Pair[]{new Pair(a, b), new Pair(c, d), new Pair(e, f)};
//
//
//
//It declares 3 pairs with pair such as (2, 3), (4, 5), (6, 7). Thus p[0].x and p[1].y gives element present in pair (2, 3) which is 2 similarly in pair p[1].y is 5.