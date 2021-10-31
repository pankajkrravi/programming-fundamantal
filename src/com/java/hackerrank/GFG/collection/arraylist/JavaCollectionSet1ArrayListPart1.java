package com.java.hackerrank.GFG.collection.arraylist;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 10/30/21 10:53 PM
 * ArrayList are dynamic size arrays. Try this problem using ArrayList.
 * <p>
 * Given a ArrayList of N elements and a integer Q defining the type of query(which will be either 1 or 2) :
 * Q = 1 includes two integers p and r. Which means insert the value r at index p in the ArrayList and print the whole updated ArrayList.
 * Q = 2 includes one integer p. In this query print the index at which the value p is last found in the ArrayList. If the value p is not found in the ArrayList then print "-1".
 * <p>
 * NOTE: Assume 0 based indexing
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5, Q = 1
 * A[] = {1, 4, 5, 9, 3}
 * Query[] = {2, 6}
 * Output:
 * 1 4 6 5 9 3
 * Explanation:
 * p=Query[0]=2
 * r=Query[1]=6
 * After inserting the element
 * r=6 at index p=2 ,the updated
 * arraylist ={1,4,6,5,9,3}
 */

public class JavaCollectionSet1ArrayListPart1 {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) {
        // code here
        if (Q == 1) {
            int p = Query.get(0);
            int r = Query.get(1);
            A.add(p, r);
            return A;
        } else {
            ArrayList<Integer> response = new ArrayList<>();
            response.add(A.lastIndexOf(Query.get(0)));
            return response;
        }
    }
}
