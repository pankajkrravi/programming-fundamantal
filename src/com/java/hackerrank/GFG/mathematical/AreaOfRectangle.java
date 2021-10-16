package com.java.hackerrank.GFG.mathematical;

/**
 * @Author pankaj
 * @create 10/10/21 3:31 PM
 */
public class AreaOfRectangle {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code here
        int [] result = new int[3];
        int areaOfRectangle,areaOfTriangle,areaOfCircle;
        areaOfRectangle = L*W;
        double cRef,tRef= 0.5*B*H;
        areaOfTriangle  = (int) tRef;
        cRef =3.14*(R*R);
        areaOfCircle = (int) cRef;
        result[0] = areaOfRectangle;
        result[1] =areaOfTriangle;
        result[2] = areaOfCircle;
        return result;
    }

    public static void main(String[] args) {
        int [] print = AreaOfRectangle.getAreas(32,32,54,12,52);
        for (int i :print) {
            System.out.print(i+" ");
        }
    }
}
