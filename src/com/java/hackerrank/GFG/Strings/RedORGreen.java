package com.java.hackerrank.GFG.Strings;

/**
 * @Author pankaj
 * @create 12/1/21 10:49 AM
 * Given a string of length N, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green.Find out the minimum number of characters you need to change to make the whole string of the same colour.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N=5
 * S="RGRGR"
 * Output:
 * 2
 * Explanation:
 * We need to change only the 2nd and
 * 4th(1-index based) characters to 'R',
 * so that the whole string becomes
 * the same colour.
 * Example 2:
 * <p>
 * Input:
 * N=7
 * S="GGGGGGR"
 * Output:
 * 1
 * Explanation:
 * We need to change only the last
 * character to 'G' to make the string
 * same-coloured.
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function RedOrGreen() which takes the Integer N and the string S as input parameters and returns the minimum number of characters that have to be swapped to make the string same-coloured.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1<=N<=105
 * S consists only of characters 'R' and 'G'.
 */
public class RedORGreen {
    static int RedOrGreen(int N, String S) {
        //code here
        int rCount = 0, gCount = 0, resp=0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R')
                rCount++;
            else if (S.charAt(i) == 'G')
                gCount++;
            if (rCount > gCount)
                resp = gCount;
            else
                resp = rCount;
        }
        return resp;
    }
}
