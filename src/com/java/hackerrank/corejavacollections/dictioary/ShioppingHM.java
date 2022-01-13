package com.java.hackerrank.corejavacollections.dictioary;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author pankaj
 * @create 1/13/22 2:20 PM
 */
public class ShioppingHM {
    public static void main(String[] args) {
        // shopping list
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Rice", true);
        shoppingList.put("Bread", false);
        shoppingList.put("Beans", true);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", true);
        //Retrieve items
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList.get("Rice"));
        System.out.println(shoppingList.get("Bread"));
        System.out.println(shoppingList.get("Beans"));
        //
        System.out.println("============ Keys =======");
        System.out.println(shoppingList.keySet());
        System.out.println("============ Values =======");
        System.out.println(shoppingList.values());
        // print key value pairs
        System.out.println(shoppingList.toString());
        // remove item
        shoppingList.remove("Rice");
        System.out.println(shoppingList.toString());
        // replace value for specific key
        shoppingList.replace("Eggs", true);
        System.out.println(shoppingList.toString());

        //clear my dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        // check empty
        System.out.println(shoppingList.isEmpty());
    }
}
