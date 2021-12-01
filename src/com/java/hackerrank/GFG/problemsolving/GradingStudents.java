package com.java.hackerrank.GFG.problemsolving;

/**
 * @Author pankaj
 * @create 10/4/21 7:46 AM
 */
/* f the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
Sample Input 0

        4
        73
        67
        38
        33
        Sample Output 0

        75
        67
        40
        33*/
import java.util.*;

public class GradingStudents {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
            List<Integer> result=new ArrayList<Integer>();
        for (int marks : grades){
            if (marks < 38 || marks%5 <=2){
                result.add(marks);
            } else if (marks % 5 >2){
                int add= 5-(marks % 5);
                    result.add(marks+add);
            }
        }
        return result;
    }

}
