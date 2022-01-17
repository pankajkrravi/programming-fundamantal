package com.java.hackerrank.GFG.companyTag;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 1/17/22 10:26 AM
Given a string str your task is to complete the function spaceString which takes only one argument the string str and  finds all possible strings that can be made by placing spaces (zero or one) in between them.

For eg .  for the string abc all valid strings will be
abc
ab c
a bc
a b c

Example 1:

Input:
str = abc
Output: abc$ab c$a bc$a b c$
Example 2:

Input:
str = xy
Output: xy$x y$

Your Task:
Complete the function spaceString() which takes a character array as an input parameter and returns list of all possible answers. The driver code will print the all possible answer '$' separated

Expected Time Complexity: O(N * 2N)
Expected Auxiliary Space: O(N)


Constraints:
1<= length of string str <=10

Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
 */
public class PrintAllPossibleStrings {
    ArrayList<String> spaceString(String str)
    {
        ArrayList<String> list=new ArrayList<>();

        rec(list,str,0,"");

        return list;
    }


    public void rec(ArrayList<String> list, String str, int i, String s){

        if(str.length()==i){

            list.add(s);
            return;
        }
        rec(list,str,i+1,s+str.charAt(i));
        if(i==0){
            return;
        }
        rec(list,str,i+1,s+" "+str.charAt(i));


    }

}
