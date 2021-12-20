package com.java.hackerrank.GFG.LinkedList;

/**
 * @Author pankaj
 * @create 12/20/21 11:34 AM
Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.



Example 1:

Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:
Y ShapedLinked List
Example 2:

Input:
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation:

4              5
|              |
1              6
\             /
8   -----  1
|
4
|
5
|
NULL
Your Task:
You don't need to read input or print anything. The task is to complete the function intersetPoint() which takes the pointer to the head of linklist1(head1) and linklist2(head2) as input parameters and returns data value of a node where two linked lists intersect. If linked list do not merge at any point, then it should return -1.
Challenge : Try to solve the problem without using any extra space.



Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)



Constraints:
1 ≤ N + M ≤ 2*105
-1000 ≤ value ≤ 1000


 *********************  Accolite Adobe Amazon D-E-Shaw FactSet Flipkart Goldman Sachs MakeMyTrip MAQ Software Microsoft Qualcomm Snapdeal Visa VMWare *****************
 */
public class IntersectionPointinYShappedLinkedLists {
    int intersectPoint(Node head1, Node head2)
    {
        Node curr1 = head1;
        Node curr2 = head2;

        int count1 =0;
        int count2 =0;

        while(curr1!=null)
        {
            count1++;
            curr1 = curr1.next;
        }

        while(curr2!=null)
        {
            count2++;
            curr2 = curr2.next;

        }

        int sub = Math.abs(count1-count2) ;

        curr1 = head1;
        curr2 = head2;

        if(count1>count2)
        {
            for(int i =1; i<=sub ; i++)
                curr1 = curr1.next;
        }

        else if(count2>=count1)
        {
            for(int i =1 ; i<=sub; i++)
                curr2 = curr2.next;
        }

        for(int i =sub ; i<Math.max(count1 , count2) -1; i++)
        {
            curr1 = curr1.next;
            curr2 = curr2.next;
            if(curr1 == curr2)
                return curr1.data;
        }

        return -1;
    }
}
