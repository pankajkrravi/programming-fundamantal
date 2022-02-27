package com.java.hackerrank.HackerRank.ProblemSolving;
// https://www.hackerrank.com/challenges/magic-square-forming/problem
public class FormingMagicSquare {
     // js solution
   /* function formingMagicSquare(s) {
        let i = 8
        let x = Array(i).fill(0)
        while (i--) {
            for (const [j, [a,b,c]] of [[4,3,8], [9,5,1], [2,7,6]].entries())
            x[i] += Math.abs(s[1][j]-b) + Math.abs(s[i%2?2:0][j]-a) + Math.abs(s[i%2?0:2][j]-c)
            if (!(i%2)) s = [ [s[2][0], s[1][0], s[0][0]],
                          [s[2][1], s[1][1], s[0][1]],
                          [s[2][2], s[1][2], s[0][2]] ]
        }

        return Math.min(...x)
    }*/
}
