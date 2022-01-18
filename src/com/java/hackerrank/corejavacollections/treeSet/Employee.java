package com.java.hackerrank.corejavacollections.treeSet;

/**
 * @Author pankaj
 * @create 1/18/22 1:41 PM
 */


public class Employee implements Comparable {
    private String name;
    private int salary;
    public Employee(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }



}
