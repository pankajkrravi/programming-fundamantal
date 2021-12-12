package com.java.hackerrank.GFG.LinkedList;

/**
 * @Author pankaj
 * @create 12/10/21 11:44 PM

Given a linked list. Print all the elements of the linked list.

Example 1:

Input:
N=2
LinkedList={1 , 2}
Output:
1 2
Explanation:
The linked list contains two
elements 1 and 2.The elements
are printed in a single line.
Example 2:

Input:
N = 3
Linked List = { 49, 10, 30}
Output:
49 10 30
Explanation:
The linked list contains 3
elements 49, 10 and 30. The
elements are printed in a single
line.
Your task:
You don't need to read input or print anything. Your task is to complete the function display() which takes the head of the linked list as input and prints the linked list in a single line.

Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)

 */
public class PrintLinkedListElements {
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head) {
        //add code here.
        if(head == null)
            return;
            while (head!=null) {
                System.out.print(head.data+" ");
                head =head.next;
            }
    }
}