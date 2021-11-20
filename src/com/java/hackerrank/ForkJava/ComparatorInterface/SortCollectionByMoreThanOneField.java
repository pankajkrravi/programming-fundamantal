/*
package com.java.hackerrank.ForkJava.ComparatorInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
*/
/**
 * @Author pankaj
 * @create 11/19/21 8:23 PM

// Java program to demonstrate working of Comparator
// interface more than one field
 *//*

// sort according to the student name and secondly, sort according to student age.
class Student {

    // instance member variables
    String Name;
    int Age;

    // parameterized constructor
    public Student(String Name, Integer Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    // overriding toString() method
    @Override
    public String toString() {
        return "Customer{"
                + "Name=" + Name + ", Age=" + Age + '}';
    }

    static class CustomerSortingComparator
            implements Comparator<Students> {

        @Override
        public int compare(Students customer1,
                           Students customer2) {

            // for comparison
           */
/* #################### fix it
           int NameCompare = customer1.getName().compareTo(
                    customer2.getName());
            int AgeCompare = customer1.getAge().compareTo(
                    customer2.getAge());*//*


            // 2-level comparison
           */
/* return (NameCompare == 0) ? AgeCompare
                    : NameCompare;*//*

            return 0; // fix above code
        }
    }


        public static void main(String[] args)
        {

            // create ArrayList to store Student
            List<Students> al = new ArrayList<>();

            // create customer objects using constructor
            // initialization
            Students obj1 = new Students("Ajay", 27);
            Students obj2 = new Students("Sneha", 23);
            Students obj3 = new Students("Simran", 37);
            Students obj4 = new Students("Ajay", 22);
            Students obj5 = new Students("Ajay", 29);
            Students obj6 = new Students("Sneha", 22);

            // add customer objects to ArrayList
            al.add(obj1);
            al.add(obj2);
            al.add(obj3);
            al.add(obj4);
            al.add(obj5);
            al.add(obj6);

            // before Sorting arraylist: iterate using Iterator
            Iterator<Students> custIterator = al.iterator();

            System.out.println("Before Sorting:\n");
            while (custIterator.hasNext()) {
                System.out.println(custIterator.next());
            }

            // sorting using Collections.sort(al, comparator);
            Collections.sort(al,
                    new CustomerSortingComparator());

            // after Sorting arraylist: iterate using enhanced
            // for-loop
            System.out.println("\n\nAfter Sorting:\n");
            for (Students customer : al) {
                System.out.println(customer);
            }
        }
    }
*/
