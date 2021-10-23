package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/21/21 10:26 PM
 */
/*Volume = length * breadth * height

        Surface Area of Cuboid = 2(length * breadth + breadth * height + height * length)*/
public class SurfaceAreAndVolumeofCuboid {
    public long[] find(int l, int b, int h) {
        // code here
        long  surfaceAreaOfCuboid = 2*(l*b+b*h+h*l);
        long volume = l*b*h;
        long [] result =new long[2];
            result[0] =  surfaceAreaOfCuboid;
            result[1] = volume;
            return result;
    }
}
