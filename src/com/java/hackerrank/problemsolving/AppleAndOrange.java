package com.java.hackerrank.problemsolving;
import java.util.*;

/**
 * @Author pankaj
 * @create 10/4/21 12:51 PM
 */
public class AppleAndOrange {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int countApple = 0, countOrange = 0;

        for (int i : apples)
            if (a + i >= s && a + i <= t)
                countApple++;

        for (int i : oranges)
            if (b + i <= t && (b + i) >= s)
                countOrange++;

        System.out.println(countApple);
        System.out.println(countOrange);
    }

}
