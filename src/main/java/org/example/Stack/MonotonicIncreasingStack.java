package org.example.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
As x increase, y also increases always e.g y = 2 x + 5
 */
public class MonotonicIncreasingStack {

    //Function to implement monotonic increasing stack
    public static int[] monotonicIncreasing(int [] nums) {
        Deque<Integer> stack = new ArrayDeque<>(); //double ended queue, add or remove elements from either end (FIFO, LIFO)

        //Traverse the array
        for (int num:nums) {
            //while stack is not empty AND top of stack is more than the current element
            while (!stack.isEmpty() && stack.peekLast() > num) {
                //if true pop the top element from the stack
                stack.pollLast();
            }
            //push the current element into the stack
            stack.offerLast(num);
        }

        //construct the result array from the stack
        int[] result = new int[stack.size()];
        int index = stack.size() -1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pollLast();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5,9,2,6};
        int[] result = monotonicIncreasing(nums);

        System.out.println("Monotonic increasing stack: [");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            if (i != result.length -1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");

        /*
        iteration 1 = 3
        stack = empty
        add 3 to stack

        iteration 2 = 1
        stack = 3 (top of stack is greater than 1, pop 3)
        add 1 to result
        result = 1
        push 1 to stack

        iteration 3 = 4
        stack = 1 (top of stack is less than 4)
        push 4 to stack
        stack = 1, 4
        result = 1

        iteration 4 = 1
        stack = 1, 4 (top of stack is greater than 1, pop 4)
        add 1 to result
        result = 1, 1
        push 1 to stack
        stack = 1, 1

        nums = 3,1,4,1,5,9,2,6

        iteration 5 = 5
        stack = 1, 1 (top of stack is less than 5)
        push 5 to stack
        stack = 1, 1, 5
        result = 1, 1

        iteration 6 = 9
        stack = 1, 1, 5 (top of stack is less than 9)
        push 9 to stack
        stack = 1, 1, 5, 9
        result = 1, 1

        iteration 7 = 2
        stack = 1, 1, 5, 9 (top of stack is greater than 2, pop 9)
        stack = 1, 1, 5 (top of stack is greater than 2, pop 5)
        stack = 1, 1 (top of stack is less than 2)
        add 2 to result
        push 2 to stack
        result = 1, 1, 2
        stack = 1, 1, 2

        iteration 8 = 6
        stack = 1, 1, 2 (top of stack is less than 6)
        add 6 to result
        result = 1, 1, 2, 6


         */
    }
}
