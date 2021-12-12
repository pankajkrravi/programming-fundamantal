package com.java.hackerrank.GFG.Cognizant;

/**
 * @Author pankaj
 * @create 12/12/21 4:41 PM
Given a binary tree, find its height.


Example 1:

Input:
1
/  \
2    3
Output: 2
Example 2:

Input:
2
\
1
/
3
Output: 3

Your Task:
You don't need to read input or print anything. Your task is to complete the function height() which takes root node of the tree as input parameter and returns an integer denoting the height of the tree. If the tree is empty, return 0.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
 */
public class HeightOfBinaryTree {
    int height(Node node)
    {
        return (node==null) ? 0: 1 + Math.max(height(node.left) , height(node.right));
    }
}

//----------------- Rev -----------------------