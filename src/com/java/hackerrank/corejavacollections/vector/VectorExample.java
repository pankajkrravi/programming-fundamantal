package com.java.hackerrank.corejavacollections.vector;

import java.util.Collection;
import java.util.Vector;

/**
 * @Author pankaj
 * @create 1/16/22 10:15 PM
 */
public class VectorExample {
    public static void main(String[] args) {
        Vector vector = new Vector();// initial cap = 10, incremental cap =v*2
        Vector vector1 = new Vector(20);// initial cap =20
        Vector vector2 = new Vector(100, 5);// initial cap=100,incremental cap =5
        //Vector vector3 = new Vector(Collection c);// get equiv vector object
        vector.add(25);
        vector.add(false);
        vector.add("Pankaj Kumar");
        vector.add(34.09);
        vector.add(333);
        vector.add("Jayshree");
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.elementAt(2));
        // get
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(3));
        System.out.println(vector.capacity());
        System.out.println(vector.size());
    }
}
