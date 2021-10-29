package com.java.hackerrank.GFG.BinarySearch;

/**
 * @Author pankaj
 * @create 10/29/21 4:31 PM
 * Given a tank with capacity C litres which is completely filled in starting. At the end of every day, tank is filled with L litres of water and in the case of overflow extra water is thrown out. Now on i-th day i litres of water is taken out for drinking. We need to find out the day at which tank will become empty the first time.
 * <p>
 * Example 1:
 * <p>
 * Input: C = 5, L = 2
 * Output: 4
 * Explanation: At the start of 1st day,
 * water in tank = 5 and at the end of
 * the 1st day = (5 - 1) = 4 At the start
 * of 2nd day, water in tank = 4 + 2 = 6
 * but tank capacity is 5 so water = 5 and
 * at the end of the 2nd day = (5 - 2) = 3
 * At the start of 3rd day, water in
 * tank = 3 + 2 = 5 and at the end of the
 * 3rd day = (5 - 3) = 2 At the start of 4th
 * day, water in tank = 2 + 2 = 4 and at the
 * end of the 4th day = (4 - 4) = 0
 * So final answer will be 4.
 ==================== Need to understand algo  ===================*/
public class EmptyTheTank {
    static long minDaysToEmpty(long C, long l) {
        // if water filling is more than capacity then
        // after C days only tank will become empty
        if (C <= l)
            return C;

        // initialize binary search variable
        int lo = 0;
        int hi = (int) 1e4;
        int mid;

        // loop until low is less than high
        while (lo < hi) {

            mid = (lo + hi) / 2;

            // if cumulate sum is greater than (C - l)
            // then search on left side
            if (getCumulateSum(mid) >= (C - l))
                hi = mid;

                // if (C - l) is more then search on
                // right side
            else
                lo = mid + 1;
        }

        // final answer will be obtained by adding
        // l to binary search result
        return (l + lo);
    }

    // Utility method to get sum of first n numbers
    static int getCumulateSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(minDaysToEmpty(5, 2));
    }
}
