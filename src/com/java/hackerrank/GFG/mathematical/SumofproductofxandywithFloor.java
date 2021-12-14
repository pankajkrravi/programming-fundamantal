package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 12/14/21 7:29 AM
Given a positive integer n. Find the sum of product of x and y such that floor(n/x) = y .


Example 1:

Input: n = 5
Output: 21
Explanation: Following are the possible
pairs of (x, y):
(1, 5), (2, 2), (3, 1), (4, 1), (5, 1).
So, 1*5 + 2*2 + 3*1 + 4*1 + 5*1
= 5 + 4 + 3 + 4 + 5
= 21.
Example 2:

Input: n = 10
Output: 87
Explanation: Sum of product of all
possible pairs of (x, y) is 87.


Your Task:
You don't need to read or print anything. Your task is to cpmplete the function sumofproduct() which takes n as input parameter and returns the sum of product of all possible pairs(x, y).


Expected Time Complexity: O(n)
Expected Space Compelxity: O(1)


Constraints:
1 <= n <= 106
 */
public class SumofproductofxandywithFloor {
    static int sumofproduct(int k ) {
        int mul = 0;
        for(int i = 1;i<=k;i++) {
            mul = mul + i*(k/i);
        }
        return mul;
    }
}
