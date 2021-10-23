package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/19/21 2:33 PM
 */
/*Distance between centres C1 and C2 is calculated as
        C1C2 = sqrt((x1 - x2)2 + (y1 - y2)2).
        There are three condition arises.
        1. If C1C2 == R1 + R2
        Circle A and B are touch to each other.
        2. If C1C2 > R1 + R2
        Circle A and B are not touch to each other.
        3. If C1C2 < R1 + R2
        Circle intersects each other.*/
public class Checkiftwogivencirclestoucheachother {
        int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
            //Write your code here
            int distSq = (X1 - X2) * (X1 - X2) +
                    (Y1 - Y2) * (Y1 - Y2);
            int radSumSq = (R1 + R2) * (R1 + R2);
            if (distSq == radSumSq)
                return 1;
            else if (distSq > radSumSq)
                return -1;
            else
                return 0;
        }
}
