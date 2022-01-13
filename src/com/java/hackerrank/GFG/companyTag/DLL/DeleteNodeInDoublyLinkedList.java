package com.java.hackerrank.GFG.companyTag.DLL;

/**
 * @Author pankaj
 * @create 1/13/22 4:11 PM
Given a doubly linked list and a position. The task is to delete a node from given position in a doubly linked list.

Example 1:

Input:
LinkedList = 1 <--> 3 <--> 4
x = 3
Output: 1 3
Explanation: After deleting the node at
position 3 (position starts from 1),
the linked list will be now as 1->3.
Example 2:

Input:
LinkedList = 1 <--> 5 <--> 2 <--> 9
x = 1
Output: 5 2 9
Your Task:
The task is to complete the function deleteNode() which should delete the node at given position and return the head of the linkedlist.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
2 <= size of the linked list <= 1000
1 <= x <= N
 */
public class DeleteNodeInDoublyLinkedList {
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        if(x==1){
            head = head.next;
            return head;
        }
        Node temp = head;
        int count = 0;
        Node curr = temp;
        while(temp!=null){
            count++;
            if(count == x-1){
                curr = temp;
                temp.next = temp.next.next;
                continue;
            }

            temp = temp.next;
            if(temp!=null && count==x){
                temp.prev = curr;
                break;
            }

        }
        return head;
    }
}
