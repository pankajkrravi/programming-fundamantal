package com.java.hackerrank.ForkJava.MOdule4;

import java.util.PriorityQueue;

/**
 * @Author pankaj
 * @create 11/20/21 7:01 PM
Given N integers, your task is to add these elements to the PriorityQueue. Also, given M integers, the task is to check if the given element is present in the PriorityQueue or not.
If the element is present, then 1 is printed by the driver code, after that the max element of priority queue is printed. Then the driver code deletes the max element.
Note: Here the driver code has implemented the PriorityQueue as a max-heap.

Example:

Input:
8
1 2 3 4 5 2 3 1
5
1 3 2 9 10

Output:
1
5
1
4
1
3
-1
-1

Explanation:
After inserting given elements, when we find 1,
which is present, so 1 gets printed, and then the
top element of the PriorityQueue which is 5 gets
printed, and then it gets deleted. Similarly, when
element is not present, just -1 is printed.
Your Task:
Your task is to complete the following functions:
insert(PriorityQueue q, int k) : You just insert k into q.
find(PriorityQueue q, int k) : You return true if k is in q, else you return false.
delete(PriorityQueue q) : You delete the top element (which is also the max element) and return it.


 */
public class OperationsOnPriorityQueue {
    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k){

        // Your code here
        //Just insert k in q and don't return anything
        q.add(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k){

        // Your code here
        // If k is in q return true else return false
            if (q.contains(k))
                return true;
            else
                return false;
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q){

        // Your code here
        //Delete the max element from q. The priority queue property might be useful here
            return q.poll();
    }
}
