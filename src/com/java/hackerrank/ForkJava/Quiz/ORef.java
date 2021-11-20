package com.java.hackerrank.ForkJava.Quiz;

/**
 * @Author pankaj
 * @create 11/20/21 1:22 PM
 */
public class ORef {
    int a = 1;
    int b = 3;

    ORef func(ORef obj)
    {
        ORef obj3 = new ORef();
        obj3 = obj;
        obj3.a = obj.a++ + --obj.b;
        obj.b = obj.b;
        return obj3;
    }

    public static void main(String[] args)
    {
        ORef obj1 = new ORef();
        ORef obj2 = obj1.func(obj1);

        System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + "  obj2.b = " + obj2.b);
        // obj1 and obj2 refer to same memory address.
    }
}
