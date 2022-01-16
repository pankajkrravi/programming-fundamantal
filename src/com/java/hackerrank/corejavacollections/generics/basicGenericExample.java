package com.java.hackerrank.corejavacollections.generics;

import java.util.ArrayList;

/**
 * @Author pankaj
 * @create 1/16/22 12:50 PM
 */
public class basicGenericExample {
    public static void main(String[] args) {
        String sArray[] = new String[25];
        Employee[] employeeArray = new Employee[25];
        sArray[0] = "Pankaj"; // array is type safe
        // sArray[1]=new Employee();// java is statically typed(Each variable and expression's data type is already known at compile time) is  language
        ArrayList arrayList = new ArrayList();
        arrayList.add("Pankaj Kumar");// string type
        arrayList.add(new Employee());// employee type
        String name = (String) arrayList.get(0);// perform type casting to match the type
        Employee nameRef = (Employee) arrayList.get(0);// String type can't be stored in Employee referance
        System.out.println(arrayList.get(0));
    }
}
