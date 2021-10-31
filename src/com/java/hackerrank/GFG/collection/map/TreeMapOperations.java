package com.java.hackerrank.GFG.collection.map;

import java.util.Collections;
import java.util.TreeMap;

/**
 * @Author pankaj
 * @create 10/30/21 11:52 AM
Implement different operations on Treemap. Operations will be performed by different types of queries.
A query can be of four types:
1. a x y (adds an entry with key x and value y to the Treemap)
2. b x (print value of  x if present in the Treemap else print -1. )
3. c (prints the size of the Treemap)
4. d x ( removes an entry with key x from the map )
5. e (print map sorted by key)

Example 1:

Input:
6
a 1 2 a 66 3 b 66 d 1 c e

Output:
3 1 66

Explanation:
There are five queries. Queries are performed in this order
1. a 1 2    --->  map has a key 1 with value 2
2. a 66 3   ---> map has a key 66 with value 3
3. b 66     ---> prints the value of key 66 if its present in the map ie 3.
4. d 1      ---> removes an entry from map with key 1
5. c        ---> prints the size of the map ie 1
6. e        ---> prints the map sorted by key
  */
public class TreeMapOperations {
    /*Inserts an entry with key x and value y in map */
    void add_Value(TreeMap<Integer,Integer> hm, int x, int y) {
        //Your code here
        hm.put(x,y);
    }

    /*Returns the value with key x from the map */
    int find_value(TreeMap<Integer, Integer> hm, int x){
        //Your code here
        if (hm.containsKey(x))
            return hm.get(x);
        else
            return -1;
    }

    /*Returns the size of the map */
    int getSize(TreeMap<Integer, Integer> hm) {
        //Your code here
        return hm.size();
    }

    /*Removes the entry with key x from the map */
    void removeKey(TreeMap<Integer, Integer> hm, int x) {
        //Your code here
        hm.remove(x);
    }

    /*print map sorted by key */
    void sorted_By_Key(TreeMap<Integer, Integer> hm) {
        // Your code here
        for (Integer treeKey : hm.keySet()){
            System.out.print(treeKey+" ");
        }
    }
}
