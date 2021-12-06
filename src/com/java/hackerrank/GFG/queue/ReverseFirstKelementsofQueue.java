package com.java.hackerrank.GFG.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author pankaj
 * @create 12/6/21 4:48 PM
 * Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.
 * <p>
 * Only following standard operations are allowed on queue.
 * <p>
 * enqueue(x) : Add an item x to rear of queue
 * dequeue() : Remove an item from front of queue
 * size() : Returns number of elements in queue.
 * front() : Finds front item.
 * Example 1:
 * <p>
 * Input:
 * 5 3
 * 1 2 3 4 5
 * <p>
 * Output:
 * 3 2 1 4 5
 * <p>
 * Explanation:
 * After reversing the given
 * input from the 3rd position the resultant
 * output will be 3 2 1 4 5.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * 4 4
 * 4 3 2 1
 * <p>
 * Output:
 * 1 2 3 4
 * <p>
 * Explanation:
 * After reversing the given
 * input from the 4th position the resultant
 * output will be 1 2 3 4.
 * Your Task:
 * Complete the provided function modifyQueue that takes queue and k as parameters and returns a modified queue. The printing is done automatically by the driver code.
 * <p>
 * Expected TIme Complexity : O(n)
 * Expected Auxilliary Space : O(n)
 * <p>
 * Constraints:
 * 1 <= N <= 1000
 * 1 <= K <= N
 * <p>
 * Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
 * *************************************** Amazon **************************8
 */
public class ReverseFirstKelementsofQueue {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q1 = new LinkedList<Integer>();
        int i = 1;
        while (i <= k) {
            stack.push(q.poll());
            i++;
        }
        // store reversed values <= k in Queue1
        for (int j = 1; j <= k; j++) {
            q1.add(stack.pop());
        }
        while (q.size()!=0)
            q1.add(q.poll());
            return q1;
    }

    public static void main(String[] args) {
        //System.out.println(new ReverseFirstKelementsofQueue().modifyQueue());
    }
}
