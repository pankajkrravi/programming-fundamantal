package com.java.hackerrank.GFG.mathematical;

/***********************************************************
 *
 * @Author pankaj
 * @create 10/31/21 11:04 PM
Given two circles C1 of radius R1 and C2 of radius R2,centered at (X1,Y1) and (X2,Y2) respectively.Find out whether they touch(at one or more than one points).

Example 1:

Input:
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=8
Output:
0
Explanation:
The circles centred at (3,4) and (14,18)
and having radii 5 and 8 respectively
do not touch each other.
Example 2:

Input:
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=18
Output:
1
Explanation:
The circles centred at (3,4) and (14,18)
and having radii 5 and 18 respectively
touch each other at two points.*/
public class CheckIfTwoGivenCirclesTouchEachOther {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
// we are comparing squared values because sqrt leads to loss of
// precision sometimes.
        int distanceBetweenCentresSquared =
                (X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1);
        int sumOfRadiiSquared = (R2 + R1) * (R2 + R1);
        return (distanceBetweenCentresSquared <= sumOfRadiiSquared ? 1 : 0);
    }
}
