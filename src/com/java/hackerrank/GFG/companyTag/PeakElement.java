package com.java.hackerrank.GFG.companyTag;

/**
 * @Author pankaj
 * @create 1/12/22 12:15 AM
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.


Example 1:

Input:
N = 3
arr[] = {1,2,3}
Output: 2
Explanation: index 2 is 3.
It is the peak element as it is
greater than its neighbour 2.
Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the
peak element as it is greater than
its only neighbour element 3.


Your Task:
You don't have to read input or print anything. Complete the function peakElement() which takes the array arr[] and its size N as input parameters and return the index of any one of its peak elements.

Can you solve the problem in expected time complexity?



Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106
 */
import java.util.*;
class PeakElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] tmp=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                tmp[i] = a[i];
            }

            int f=0;
            int A=(new SolutionPeakEle()).peakElement(tmp,n);

            if(A<0 && A>=n)
                System.out.println(0);
            else
            {
                if(n==1 && A==0)
                    f=1;
                else if(A==0 && a[0]>=a[1])
                    f=1;
                else if(A==n-1 && a[n-1]>=a[n-2])
                    f=1;
                else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
                    f=1;
                else
                    f=0;
                System.out.println(f);
            }
        }
    }
}// } Driver Code Ends

