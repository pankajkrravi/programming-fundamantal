package com.java.hackerrank.GFG.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pankaj
 * @create 12/4/21 5:26 PM
 * Given a string S of lowercase alphabets, check if it is isogram or not. An Isogram is a string in which no letter occurs more than once.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = machine
 * Output: 1
 * Explanation: machine is an isogram
 * as no letter has appeared twice. Hence
 * we print 1.
 * Example 2:
 * <p>
 * Input:
 * S = geeks
 * Output: 0
 * Explanation: geeks is not an isogram
 * as 'e' appears twice. Hence we print 0.
 * Your Task:
 * This is a function problem. You only need to complete the function isIsogram() that takes a string as a parameter and returns either true or false.
 * <p>
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(Number of distinct characters).
 * Note: N = |S|
 * <p>
 * Constraints:
 * 1 <= |s| <= 103
 */
public class CheckIfAStringIsIsogramOrNot {
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < data.length();i++){
            map.put(data.charAt(i), i);
            if(map.size() != i+1){
                return false;
            }
        }
        return true;
    }
    // ============================ fix below code =========
    /*static boolean isIsogram(String data) {
        //Your code here
        boolean isIsoGram = true;
        for (int i = 0; i < data.length(); i++) {
            for (int j = 0; i < data.length(); j++) {
                if (data.charAt(i) == data.charAt(j)&& i !=j)
                    isIsoGram = false;
                break;
            }
        }
        return isIsoGram;
    }*/
}
