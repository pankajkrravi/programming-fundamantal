package com.java.hackerrank.GFG.Cognizant;

/**
 * @Author pankaj
 * @create 12/11/21 10:27 PM
Given a linked list of N nodes such that it may contain a loop.

A loop here means that the last node of the link list is connected to the node at position X. If the link list does not have any loop, X=0.

Remove the loop from the linked list, if it is present.


Example 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1
Explanation: The link list looks like
1 -> 3 -> 4
^    |
|____|
A loop is present. If you remove it
successfully, the answer will be 1.

Example 2:

Input:
N = 4
value[] = {1,8,3,4}
X = 0
Output: 1
Explanation: The Linked list does not
contains any loop.

Example 3:

Input:
N = 4
value[] = {1,2,3,4}
X = 1
Output: 1
Explanation: The link list looks like
1 -> 2 -> 3 -> 4
|______________|
A loop is present.
If you remove it successfully,
the answer will be 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function removeLoop() which takes the head of the linked list as the input parameter. Simply remove the loop in the list (if present) without disconnecting any nodes from the list.
Note: The generated output will be 1 if your submitted code is correct.


Expected time complexity: O(N)
Expected auxiliary space: O(1)


Constraints:
1 ≤ N ≤ 104
 */

/*
public class RemoveLoopInLinkedList {
    //Function to remove a loop in the linked list.
    public static void removeLoop(NodeS head) {
        // code here
        // remove the loop without losing any nodes
        NodeS slow = head;
        NodeS fast = head;
        NodeS meetingPoint = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                meetingPoint = slow;
                break;
            }
        }
        NodeS loopStart = null;
        NodeS temp = head;
        while (meetingPoint != null) {
            if (meetingPoint == temp) {
                loopStart = meetingPoint;
                break;
            }
            temp = temp.next;
            meetingPoint = meetingPoint.next;
        }
        while (loopStart != null) {
            temp = loopStart.next;
            while (temp.next != loopStart) {
                temp = temp.next;
            }
            temp.next = null;
            break;
        }
    }
}

class NodeS {
    int data;
    NodeS next;
    NodeS(int d) {data = d; next = null; }

} */

// ======================= TC ===============##