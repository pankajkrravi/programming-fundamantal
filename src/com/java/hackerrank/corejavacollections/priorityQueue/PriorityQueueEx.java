package com.java.hackerrank.corejavacollections.priorityQueue;

import java.util.*;

/**
 * @Author pankaj
 * @create 1/19/22 12:32 AM
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();// default size= 11
        // with default natural sorting order
        PriorityQueue priorityQueue1 = new PriorityQueue(40); // initial cap = 40
        // PriorityQueue priorityQueue2 = new PriorityQueue(int initialCap,Comparator c);

        SortedSet sortedSet = new TreeSet();
        // PriorityQueue priorityQueue3 = new PriorityQueue(SortedSet ss); // get equiv PqiorityQueue
        PriorityQueue priorityQueue3 = new PriorityQueue(sortedSet); // example

        // get equiv PriorityQueue foe any Collection
        // Example
        List arrayList = new ArrayList();
        //PriorityQueue priorityQueue4 =new PriorityQueue(Collection c );
        PriorityQueue priorityQueue4 = new PriorityQueue(arrayList);
        priorityQueue4.poll();
        priorityQueue4.peek();

    }
}
