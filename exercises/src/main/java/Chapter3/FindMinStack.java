package Chapter3;

import java.util.Stack;

/**
 * Created by Carl Shen on 3/11/15.
 *
 * <title>Exercise 3.25</title>
 * Propose a data structure that supports the stack push and pop operations and a thrid operations findMin,
 * which returns the smallest element in the data structure all in O(1) worst-case time.
 *
 * Use an additional stack to store the current min element, while poping, if the top element is also the min element
 * we also pop it from min stack
 */
public class FindMinStack {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || minStack.peek() >= value) {
            minStack.push(value);
        }
    }

    public int pop() {
        int value = stack.pop();
        if (value == minStack.peek()) minStack.pop();
        return value;
    }

    public int peek() { return stack.peek(); }

    public int findMin() {
        return minStack.peek();
    }
}
