package com.java.hackerrank.ForkJava.Module3;

/**
 * @Author pankaj
 * @create 11/19/21 8:32 PM
 */
import java.io.*;
import java.util.*;

// Pair class
class Rectangle{
    int length;
    int breadth;

    // Constructor
    public Rectangle(int x, int y){
        this.length = x;
        this.breadth = y;
    }

    // Funtion to find area
    public int area(){
        return (this.length*this.breadth);
    }
}