package com.java.hackerrank.GFG.Cognizant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author pankaj
 * @create 12/11/21 10:14 PM
 * Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.
 * <p>
 * Left view of following tree is 1 2 4 8.
 * <p>
 * 1
 * /     \
 * 2        3
 * /     \    /    \
 * 4     5   6    7
 * \
 * 8
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 1
 * /  \
 * 3    2
 * Output: 1 3
 * <p>
 * Example 2:
 * <p>
 * Input:
 * <p>
 * Output: 10 20 40
 * Your Task:
 * You just have to complete the function leftView() that prints the left view. The newline is automatically appended by the driver code.
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(Height of the Tree).
 * <p>
 * Constraints:
 * 0 <= Number of nodes <= 100
 * 1 <= Data of a node <= 1000
 */
public class LeftViewOfBinaryTree {
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null) return arr;


        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 1; i <= n; i++) {
         Node temp = q.poll();

                if (i == 1)
                    arr.add(temp.data);

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);
            }
        }
        return arr;
    }
}