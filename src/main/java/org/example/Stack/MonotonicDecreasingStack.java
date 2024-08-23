package org.example.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
As x increase, y decreases always e.g y = -(2x)
 */

public class MonotonicDecreasingStack {
    public static List<Integer> monotonicDecreasing(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        //traverse the array
        for (int num : nums) {
            //while stack is not empty AND top of stack is less than the current element
            while (!stack.isEmpty() && stack.peek() < num) {
                //pop the top element from the stack
                stack.pop();
            }

            //construct the result
            if (!stack.isEmpty()) {
                result.add(stack.peek());
            } else {
                result.add(-1);
            }

            //push the current element into the stack
            stack.push(num);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5,9,2,6};
        List<Integer> result = monotonicDecreasing(nums);
        System.out.println("Monotonic decreasing stack: " + result);

        /*
        1st iteration = 3
        stack = empty so add -1 to result
        result = -1, push 3 into stack
        stack = 3

        2nd iteration = 1
        stack = 3, (top of stack is greater than 1, add num to result)
        result = -1, 3
        push 1 on stack = 3, 1

        3rd iteration = 4
        stack = 3, 1, (top of stack 1 less than 4 so 1 is popped)
        stack = 3 (3 is less than 4 so 3 is popped)
        stack = empty so add -1 to result
        result = -1, 3, -1
        push 4 on stack = 4

        4th iteration = 1
        stack = 4 ( top of stack is greater than 1, add num to result
        result = -1, 3, -1, 4
        push 1 to stack = 4, 1
        5th iteration = 5
        stack = 4, 1 (top of stack is less then 5, 1  is popped)
        stack = 4 (top of stack is less than 5, 4 is popped)
        stack = empty add -1 to result
        result -1, 3, -1, 4, -1
        push 5 on stack = 5

        nums = 3,1,4,1,5,9,2,6
        6th iteration = 9
        stack = 5 (top of stack is less than 9, 5 is popped)
        stack = empty add -1 to result
        result = 1-, 3, -1, 4, -1, -1
        push 9 on stack

        7th iteration = 2
        stack = 9 (top of stack is greater than 2)
        add 9 to result
        result = 1-, 3, -1, 4, -1, -1, 9
        push 2 on stack

        8th iteration = 6
        stack = 9, 2 (top of stack is less than 6, 2 is popped
        stack = 9 (top of stack is greater than 6)
        add 9 to result
        result = 1-, 3, -1, 4, -1, -1, 9, 9
         */
    }
}
