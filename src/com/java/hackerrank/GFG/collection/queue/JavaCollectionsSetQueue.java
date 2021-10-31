package com.java.hackerrank.GFG.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author pankaj
 * @create 10/30/21 2:34 PM
Implement different operations on a queue q .

Input:
The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. The first line of input contains an integer Q denoting the no of queries . Then in the next line are Q space separated queries .
A query can be of four types
1. a x (Pushes an element x at the end of the queue q )
2. r (if queue is not empty pops the front element and prints it, else prints -1)
3. s (prints the size of the queue)
4. p (if queue is not empty prints the front element of the queue, else prints -1)

Output:
The output for each test case will  be space separated integers denoting the results of each query . */
public class JavaCollectionsSetQueue {
    Queue<Integer> q;
    JavaCollectionsSetQueue(){
        q=new LinkedList<>();
    }
    public void addElement(int key) {
        //Add your code here.
        q.add(key);
    }
    public void RemoveElement() {
        //Add your code here.
        if(q.size() == 0)
            System.out.print("-1" + " ");
        else
            System.out.print(q.remove() + " ");
    }
    public void peekElement() {
        //Add your code here.
        if(q.size() == 0)
            System.out.print("-1" + " ");
        else
            System.out.print(q.peek() + " ");

    }
    public void Size() {
        //Add your code here.
        q.size();
    }

    public static void main(String[] args) {
        JavaCollectionsSetQueue queue = new JavaCollectionsSetQueue();
    }
}
//=============================== fix it ===========================