package com.java.hackerrank.GFG.companyTag;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @Author pankaj
 * @create 1/17/22 12:00 AM
Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.

Example 1:

Input:
N = 2
Output:
1 10
Explanation:
Binary numbers from
1 to 2 are 1 and 10.

Example 2:

Input:
N = 5
Output:
1 10 11 100 101
Explanation:
Binary numbers from
1 to 5 are 1 , 10 , 11 , 100 and 101.


Your Task:
You only need to complete the function generate() that takes N as parameter and returns vector of strings denoting binary numbers.

Expected Time Complexity : O(N log2N)
Expected Auxilliary Space : O(N log2N)

Constraints:
1 ≤ N ≤ 106
 */
public class GenerateBinaryNumbers {
    static ArrayList<String> generate(int n)
    {
        ArrayList<String> res = new ArrayList<>();
        Queue<String> q = new ArrayDeque<>();
        q.add("1");
        int count = 0;

        while(q.size() > 0){
            String rem = q.remove();
            res.add(rem);
            count++;
            if(count == n) return res;
            q.add(rem + "0");
            q.add(rem + "1");
        }
        return res;
    }
}
