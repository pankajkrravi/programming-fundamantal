package com.java.hackerrank.GFG.LinkedList;

/**
 * @Author pankaj
 * @create 12/20/21 11:51 AM
Given two numbers represented by two linked lists of size N and M. The task is to return a sum list.

The sum list is a linked list representation of the addition of two input numbers from the last.

Example 1:

Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0
Explanation: For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).
Example 2:

Input:
N = 2
valueN[] = {6,3}
M = 1
valueM[] = {7}
Output: 7 0
Explanation: For the given two linked
list (6 3) and (7), after adding the
two linked list resultant linked list
will be (7 0).
Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the sum list.

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(Max(N,M)) for the resultant list.

Constraints:
1 <= N, M <= 5000
 ********************  Accolite Amazon Flipkart MakeMyTrip Microsoft Morgan Stanley Qualcomm Snapdeal  *********************88
 */
public class AddtwoNumbersRepresentedbyLinkedlists {
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverse(first);
        second = reverse(second);
        int carry = 0;
        Node head = null;
        Node prev = null;
        while(first!=null||second!=null) {
            int sum = 0;
            if(first!=null)
                sum += first.data;
            if(second!=null)
                sum += second.data;
            sum += carry;
            carry = sum/10;
            // if(first&&seco)
            // String data = ""+first.data+second.data;
            // System.out.println(sum);
            int val = sum%10;

            Node cur = new Node(val);
            if(prev==null) {
                head = cur;
                prev = head;
            }

            else {
                prev.next = cur;
                prev = cur;
            }
            if(first!=null)
                first = first.next;
            if(second!=null)
                second = second.next;
        }
        head = reverse(head);
        if(carry!=0) {
            Node n1 = new Node(carry);
            n1.next = head;
            head = n1;
        }
        return head;
    }
    static Node reverse(Node head) {
        Node prev = null;
        Node next = null;
        Node cur = head;
        while(cur!=null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

}
