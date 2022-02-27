package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day24;
// https://www.hackerrank.com/challenges/30-linked-list-deletion/problem

public class LinkedListEx {
    public static Node removeDuplicates(Node head) {

        Node current=head;
        if(head==null){
            return null;
        }
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            } else{
                current=current.next;
            }
        }
        return head;
    }
}
