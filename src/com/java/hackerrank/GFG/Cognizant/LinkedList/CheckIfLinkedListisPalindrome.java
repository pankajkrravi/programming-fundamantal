package com.java.hackerrank.GFG.Cognizant.LinkedList;

/**
 * @Author pankaj
 * @create 12/12/21 3:59 PM
Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Example 1:

Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.
Example 2:

Input:
N = 4
value[] = {1,2,3,4}
Output: 0
Explanation: The given linked list
is 1 2 3 4 , which is not a palindrome
and Hence, the output is 0.
Your Task:
The task is to complete the function isPalindrome() which takes head as reference as the only parameter and returns true or false if linked list is palindrome or not respectively.

Expected Time Complexity: O(N)
Expected Auxialliary Space Usage: O(1)  (ie, you should not use the recursive stack space as well)

Constraints:
1 <= N <= 105
 */
public class CheckIfLinkedListisPalindrome {
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head)
    {
        Node rev = reverse(head);
        return isEqual(head,rev);
    }
    Node reverse(Node node){
        Node cur = null;
        while(node!=null){
            Node n = new Node(node.data);
            n.next = cur;
            cur = n;
            node = node.next;
        }
        return cur;
    }
    boolean isEqual(Node one,Node two){
        while(one != null && two != null){
            if(one.data != two.data){
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one==null && two==null;

    }
}

//======================== TQ ============================= review========