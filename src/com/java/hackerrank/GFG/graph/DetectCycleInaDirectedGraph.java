package com.java.hackerrank.GFG.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 12/20/21 11:44 AM
 * https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1/?problemStatus=unsolved&problemType=functional&page=1&sortBy=submissions&query=problemStatusunsolvedproblemTypefunctionalpage1sortBysubmissions
Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, check whether it contains any cycle or not.


Example 1:

Input:



Output: 1
Explanation: 3 -> 3 is a cycle

Example 2:

Input:


Output: 0
Explanation: no cycle in the graph

Your task:
You don’t need to read input or print anything. Your task is to complete the function isCyclic() which takes the integer V denoting the number of vertices and adjacency list as input parameters and returns a boolean value denoting if the given directed graph contains a cycle or not.


Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V)


Constraints:
1 ≤ V, E ≤ 105
**************  Adobe Amazon BankBazaar Flipkart Goldman Sachs MakeMyTrip Microsoft Oracle Rockstand Samsung ****************8
 */
public class DetectCycleInaDirectedGraph {

    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[]indegree=new int[V];
        ArrayDeque<Integer>q=new ArrayDeque<>();


        // populating the indegree array
        for(int i=0;i<V;i++){
            for(int x:adj.get(i)){
                indegree[x]++;
            }
        }



        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(q.isEmpty()==false){

            int u=q.poll();

            for(int x:adj.get(u)){
                if(--indegree[x]==0){
                    q.add(x);
                }
            }
            count++;

        }
        return count==V?false:true;
    }
}
