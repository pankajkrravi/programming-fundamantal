package com.java.hackerrank.GFG.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/6/21 11:30 AM
 * Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 6
 * 4 3 1 10 2 6
 * <p>
 * Output:
 * 6 2 10 1 3 4
 * <p>
 * Explanation:
 * After reversing the given
 * elements of the queue , the resultant
 * queue will be 6 2 10 1 3 4.
 * Example 2:
 * <p>
 * Input:
 * 4
 * 4 3 2 1
 * <p>
 * Output:
 * 1 2 3 4
 * <p>
 * Explanation:
 * After reversing the given
 * elements of the queue , the resultant
 * queue will be 1 2 3 4.
 * Your Task:
 * You only need to complete the function rev that takes a queue as parameter and returns the reversed queue. The printing is done automatically by the driver code.
 * <p>
 * Expected Time Complexity : O(n)
 * Expected Auxilliary Space : O(n)
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 105
 * 1 ≤ elements of Queue ≤ 105
 * *************************************  Amazon **************************************
 */
public class QueueReversal {
    public Queue<Integer> rev(Queue<Integer> q) {
        //add code here.
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty())
            stack.push(q.poll());
        while (!stack.isEmpty())
            q.add(stack.pop());
        return q;
    }
}
