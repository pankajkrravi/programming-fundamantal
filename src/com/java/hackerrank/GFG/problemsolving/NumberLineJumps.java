package com.java.hackerrank.GFG.problemsolving;

/**
 * @Author pankaj
 * @create 10/4/21 1:12 PM
 */
// Need Improvement
public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        /*int kangaroo1=x1+v1;
        int kangaroo2=x2+v2;
        if (kangaroo1 == kangaroo2){
            return "YES";
        }else {
            return "NO";
        }
   */
        // Improved Code
        String response = "NO";
        boolean canCatchUp = (v2 < v1);
        if (canCatchUp) {
            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
            if (willIntersectOnLand) {
                response = "YES";
            }
        }
        System.out.println(response);
        return response;
    }
}
