package com.java.hackerrank.GFG.LinkedList.SLL;

/**
 * @Author pankaj
 * @create 12/20/21 10:27 AM
Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to length of the linked list.

Example 1:

Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
Example 2:

Input:
N = 8
value[] = {1, 2, 3, 4, 5, 6, 7, 8}
k = 4
Output: 5 6 7 8 1 2 3 4

Your Task:
You don't need to read input or print anything. Your task is to complete the function rotate() which takes a head reference as the first argument and k as the second argument, and returns the head of the rotated linked list.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 103
1 <= k <= N
 ***************************************  Accolite Amazon MakeMyTrip Microsoft *******************
 */
public class RotateALinkedLisT {
    public Node rotate(Node head, int k) {

        if(head == null)
            return null;

        Node P = head;

        while(P.next != null)
            P = P.next;

        for(int i = 1; i <= k; i++)
        {
            P.next = head;
            head = head.next;
            P = P.next;
            P.next = null;
        }

        return head;
    }
}
