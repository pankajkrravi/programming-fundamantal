package com.java.hackerrank.ForkJava.Module3;

/**
 * @Author pankaj
 * @create 11/19/21 8:30 PM
Given N  pairs of rectangles, where each pair denotes the length L and breadth B of the ith rectangle. The task is to return the maximum area of the rectangle.

Example 1:

Input:
N = 3
rect[] = {{1,2},
{3,4},
{5,6}}
Output:
30

Explanation:
1. Total area of Rect. 1 = 1 * 2 = 2
2. Total area of Rect. 2 = 3 * 4 = 12
3. Total area of Rect. 3 = 5 * 6 = 30
4. Out of all rectangles, Rectangle 3 has the maximum area.

Example 2:

Input:
N = 2
rect[] = {{12,3},
{40,5}}

Output:
200

Explanation:
1. Total area of Rect. 1 = 12 * 3 = 36
2. Total area of Rect. 2 = 40 * 5 = 200.
3. Out of all rectangles, Rectangle 2 has the maximum area.
User Task: Your task is to complete the function calculate_Area() which returns maximum area. Use area() function in Rectangle class.


 */
public class MaximumAreaRectangle {
    static int calculate_Area(Rectangle arr[]){
        // Your code here
        int n= arr.length,i;
        long[] store = new long[n];
        for (i=0;i<n;i++){
            store[i] =arr[i].area();
        }
        int max = 0;
        for (i=1;i<n;i++){
            if (store[i-1] < store[i]){
                max =i;
            }
        }
        return arr[max].area();
    }
}
