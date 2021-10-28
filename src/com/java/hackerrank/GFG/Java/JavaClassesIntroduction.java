package com.java.hackerrank.GFG.Java;

/**
 * @Author pankaj
 * @create 10/28/21 9:04 AM
 */
public class JavaClassesIntroduction {
      int length;
      int width;
      int height;
    public void set_length(int l)
    {
        //Add your code here.
        this.length =l;
    }
    public void set_width(int w)
    {
        //Add your code here.
        this.width= w;
    }
    public void set_height(int h)
    {
        //Add your code here.
        this.height = h;
    }
    public void volume()
    {
        //Add your code here.
        System.out.println(length*width*height);
    }
}
