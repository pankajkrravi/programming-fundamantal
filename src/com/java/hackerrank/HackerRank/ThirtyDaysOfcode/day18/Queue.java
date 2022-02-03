package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day18;

import java.util.LinkedList;

public class Queue {
    LinkedList queue;

    public Queue() {
        // create queue
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    //enqueue
    public void enQueue(int data) {
        queue.addLast(data);
    }

    // deQueue
    public int deQueue() {
        return (int) queue.remove(0);
    }
    //peek
    public int peek(){
        return (int) queue.get(0);// obj to int cast
    }

    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.enQueue(5);
        queue1.enQueue(65);
        queue1.enQueue(58);
        queue1.enQueue(100);
        queue1.enQueue(90);
        System.out.println("1st out : "+queue1.deQueue());
        System.out.println("2st out : "+queue1.deQueue());
        System.out.println("PEEK : "+queue1.peek());
        System.out.println("3rd out : "+queue1.deQueue());
        System.out.println("4th out : "+queue1.deQueue());
        System.out.println("5th out : "+queue1.deQueue());

    }
}
