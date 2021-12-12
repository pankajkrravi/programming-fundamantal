package com.java.hackerrank.GFG.Cognizant;

/**
 * @Author pankaj
 * @create 12/11/21 7:05 PM
Given the root of a binary tree. Check whether it is a BST or not.
Note: We are considering that BSTs can not contain duplicate Nodes.
A BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:

Input:
2
/    \
1      3
Output: 1
Explanation:
The left subtree of root node contains node
with key lesser than the root node’s key and
the right subtree of root node contains node
with key greater than the root node’s key.
Hence, the tree is a BST.
Example 2:

Input:
2
\
7
\
6
\
5
\
9
\
2
\
6
Output: 0
Explanation:
Since the node with value 7 has right subtree
nodes with keys less than 7, this is not a BST.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isBST() which takes the root of the tree as a parameter and returns true if the given binary tree is BST, else returns false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the BST).

Constraints:
0 <= Number of edges <= 100000
 */
public class CheckForBST {
    boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data > min && node.data < max) {
            return isBSTUtil(node.left, min, node.data)
                    && isBSTUtil(node.right, node.data, max);
        } else {
            return false;
        }
    }
}
