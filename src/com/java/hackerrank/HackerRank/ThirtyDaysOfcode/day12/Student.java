package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day12;


/**
 * @Author pankaj
 * @create 1/19/22 3:04 PM
 */
class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public Student(String firstName, String lastName,int idNumber,int[] testScores){
        super(firstName,lastName,idNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.testScores = testScores;
    }
    public char calculate(){
        int sum=0;
        for(int i =0; i<testScores.length; i++){
            sum = sum+testScores[i];
        }
        int avg = sum/testScores.length;

        if(90 <= avg && avg <= 100)
            return 'O';
        else if(80 <= avg && avg <90)
            return 'E';
        else if(70 <= avg && avg < 80)
            return 'A';
        else if(55 <= avg && avg < 70)
            return 'P';
        else if(40 <= avg && avg < 55)
            return 'D';
        else
            return 'T';
    }
}
