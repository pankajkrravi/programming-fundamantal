package com.java.hackerrank.GFG.Cognizant;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author pankaj
 * @create 12/12/21 4:32 PM
Given a Binary Tree of size N, find all the nodes which don't have any sibling. You need to return a list of integers containing all the nodes that don't have a sibling in sorted order.

Note: Root node can not have a sibling so it cannot be included in our answer.

Example 1:

Input :
37
/
20
/
113

Output: 20 113
Explanation: 20 and 113 dont have any siblings.

Example 2:

Input :
1
/ \
2   3

Output: -1
Explanation: Every node has a sibling.

Your Task:
You dont need to read input or print anything. Complete the function noSibling() which takes the root of the tree as input parameter and returns a list of integers containing all the nodes that don't have a sibling in sorted order. If all nodes have a sibling, then the returning list should contain only one element -1.


Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(Height of the tree)


Constraints:
1 ≤ N ≤ 10^4
All nodes have distinct values.

 */
public class PrintAlNodesThatDontHaveSibling {
    //Easy Java Solutiom

    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        Count(node,al);
        if(al.size()==0){
            al.add(-1);
        }
        Collections.sort(al);
        return al;
    }
    static void Count(Node root,ArrayList<Integer>al)
    {
        if(root==null){
            return ;

        }
        if(root!=null){
            if(root.left!=null && root.right==null){
                al.add(root.left.data);
            }
            if(root.right!=null && root.left==null){
                al.add(root.right.data);
            }
        }
        Count(root.left,al);
        Count(root.right,al);
    }
}
