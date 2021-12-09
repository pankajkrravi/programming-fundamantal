package com.java.hackerrank.GFG.stack;

/**
 * @Author pankaj
 * @create 12/9/21 11:04 PM
 * Your task is to implement  2 stacks in one array efficiently.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * push1(2)
 * push1(3)
 * push2(4)
 * pop1()
 * pop2()
 * pop2()
 * <p>
 * Output:
 * 3 4 -1
 * <p>
 * Explanation:
 * push1(2) the stack1 will be {2}
 * push1(3) the stack1 will be {2,3}
 * push2(4) the stack2 will be {4}
 * pop1()   the poped element will be 3
 * from stack1 and stack1 will be {2}
 * pop2()   the poped element will be 4
 * from stack2 and now stack2 is empty
 * pop2()   the stack2 is now empty hence -1 .
 * <p>
 * <p>
 * Your Task:
 * You don't need to read input or print anything. You are required to complete the 4 methods push1, push2 which takes one argument an integer 'x' to be pushed into stack one and two and pop1, pop2 which returns the integer poped out from stack one and two. If no integer is present in the array return -1.
 * <p>
 * <p>
 * <p>
 * Expected Time Complexity: O(1) for all the four methods.
 * Expected Auxiliary Space: O(1) for all the four methods.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * 1 <= Number of queries <= 100
 * 1 <= value in the stack <= 100
 * The sum of elements in both the stacks < size of the given array
 * <p>
 * ************************ 24*7 Innovation Labs Microsoft Samsung Snapdeal **********************
 */
class TwoStack {

    int size;
    int top1, top2;
    int arr[] = new int[100];

    TwoStack() {
        size = 100;
        top1 = -1;
        top2 = size;
    }

    public class ImplementtwoStacksinanarray {
        void push1(int x, TwoStack sq) {
            sq.arr[++sq.top1] = x;
        }


        void push2(int x, TwoStack sq) {
            sq.arr[--sq.top2] = x;
        }

        int pop1(TwoStack sq) {
            if (sq.top1 != -1)
                return sq.arr[sq.top1--];
            return -1;
        }

        int pop2(TwoStack sq) {
            if (sq.top2 < sq.size)
                return sq.arr[sq.top2++];
            return -1;
        }
    }
}
