package com.java.hackerrank.GFG.Dell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;


/**
 * @Author pankaj
 * @create 11/13/21 3:37 PM

Given a Binary Tree, find the vertical traversal of it starting from the leftmost level to the rightmost level.
If there are multiple nodes passing through a vertical line, then they should be printed as they appear in level order traversal of the tree.

Example 1:

Input:
1
/   \
2       3
/   \   /   \
4      5 6      7
\      \
8      9
Output:
4 2 1 5 6 3 8 7 9
Explanation:

Example 2:

Input:
1
/    \
2       3
/    \      \
4      5      6
Output: 4 2 1 5 3 6
Your Task:
You don't need to read input or print anything. Your task is to complete the function verticalOrder() which takes the root node as input parameter and returns an array containing the vertical order traversal of the tree from the leftmost to the rightmost level. If 2 nodes lie in the same vertical level, they should be printed in the order they appear in the level order traversal of the tree.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= Number of nodes <= 3*104
**********************************************  Accolite Amazon BrowserStack Dell Flipkart Grofers MakeMyTrip Netskope Walmart Microsoft ********************************
 */
public class VerticalTraversalOfBinaryTree {
    //static HashMap<Integer,ArrayList<Integer>> hm;
    //static int min,max;
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        class TreeNode{
            Node node;
            int d;
            TreeNode(Node node,int d){
                this.node = node;
                this.d=d;
            }
        }
        // add your code here
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
        int min=0,max=0;

        ArrayList<Integer> op=new ArrayList<Integer>();
        if(root==null){
            return op;
        }

        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(new TreeNode(root,0));

        while(!q.isEmpty()){
            //System.out.println(q);
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                int d=node.d;
                if(d<min){
                    min=d;
                }
                if(d>max){
                    max=d;
                }
                Node n=node.node;
                if(hm.containsKey(d)){
                    hm.get(d).add(n.data);
                }else{
                    ArrayList<Integer> l=new ArrayList<Integer>();
                    l.add(n.data);
                    hm.put(d,l);
                }
                if(n.left!=null){
                    q.add(new TreeNode(n.left,d-1));
                }
                if(n.right!=null){
                    q.add(new TreeNode(n.right,d+1));
                }
            }
        }
        for(int i=min;i<=max;i++){
            if(hm.containsKey(i))
                op.addAll(hm.get(i));
        }

        return op;
    }
}
