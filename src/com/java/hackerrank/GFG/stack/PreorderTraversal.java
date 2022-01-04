/*
package com.java.hackerrank.GFG.stack;
import com.java.hackerrank.GFG.stack.Node;
import java.util.ArrayList;

*/
/**
 * @Author pankaj
 * @create 12/6/21 10:31 AM
 * Given a binary tree, find its preorder traversal.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 1
 * /
 * 4
 * /    \
 * 4       2
 * Output: 1 4 4 2
 * Example 2:
 * <p>
 * Input:
 * 6
 * /   \
 * 3     2
 * \   /
 * 1 2
 * Output: 6 3 1 2 2
 * <p>
 * Your Task:
 * You just have to complete the function preorder() which takes the root node of the tree as input and returns an array containing the preorder traversal of the tree.
 * <p>
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 * <p>
 * Constraints:
 * 1 <= Number of nodes <= 104
 * 0 <= Data of a node <= 105
 * <p>
 * ************************** Amazon Walmart Microsoft Flipkart ***********************
 *//*

public class PreorderTraversal {
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // Code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        preAss(root, list);
        return list;
    }

    static void preAss(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preAss(root.left, list);
        preAss(root.right, list);
    }

    public static void main(String[] args) {

    }
}
*/
