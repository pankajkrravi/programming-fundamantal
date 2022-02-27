package com.java.hackerrank.HackerRank.ProblemSolving;

// https://www.hackerrank.com/challenges/drawing-book/problem
public class DrawingBook {
    static int pageCount(int n, int p) {

        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);

    }

}
