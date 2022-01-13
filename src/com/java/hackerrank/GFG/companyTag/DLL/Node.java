package com.java.hackerrank.GFG.companyTag.DLL;

/**
 * @Author pankaj
 * @create 1/13/22 4:13 PM
 */
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int d)
    {
        data = d;
        next = prev = null;
    }
}