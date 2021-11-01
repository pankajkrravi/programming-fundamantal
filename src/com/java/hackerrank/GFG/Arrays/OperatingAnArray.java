package com.java.hackerrank.GFG.Arrays;

/**
 * @Author pankaj
 * @create 11/1/21 8:12 PM
Given an array A of size N, your task is to do some operations, i.e., search an element, insert an element, and delete an element by completing the functions. Also, all functions should return a boolean value.

Input Format:
The first line of input consists of T, the number of test cases. T testcases follow. Each testcase contains 3 lines of input. The first line of every test case consists of an integer N, denotes the number of elements in an array. The second line of every test cases consists of N spaced integers Ai. The third line of every test case consists of four integers X, Y, Yi and Z, denoting the elements for the search operation, insert operation, insert operation element index and delete operation respectively.

Output Format:
For each testcase, return 1 for each operation if done successfully else 0.

Your Task:
Since this is a function problem, you only need to complete the provided functions.

Constraints:
1 <= T <= 100
1 <= N <= 100
0 <= Ai <= 1000

Example:
Input:
1
5
2 4 1 0 6
1 2 2 0
Output:
1 1 1
 */
public class OperatingAnArray {

    public boolean searchEle(int a[],int x) {
        //add code here.
            for(int i=0;i<a.length;i++){
                if (a[i] ==x)
                    return  true;
            }
            return false;
    }
    public boolean insertEle(int a[],int y,int yi) {
        //add code here.
            for (int i=0;i<100;i++){
                if (i ==yi) {
                            a[i] =y;
                            return true;
                }
            }
        return false;
    }
    // --------------------------- Review and  go through this once ----------------
    public boolean deleteEle(int a[],int z) {
            int index=0;
            boolean num=false;
            for(int i=0; i<100; i++)
            {
                if(a[i]==z)
                {
                    index = i;
                    num=true;
                }
            }
            if(num == true)
            {
                for(int i=99; i>index; i--)
                {
                    a[i-1] = a[i];
                }
            }
            return true;
    }
}
