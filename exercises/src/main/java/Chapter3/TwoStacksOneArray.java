package Chapter3;

/**
 * Created by Carl Shen on 3/11/15.
 *
 * <title>Exercise 3.24</title>
 *
 * Write routines to implement two stacks using only one array. You stack routines should not declare an overflow
 * error unless every slot in the array is used.
 *
 * Solution:
 * Because the requirement, we use two index one starts from 0, and the other starts from the last and move backward.
 * When they meet, it means the array is fully used.
 */
public class TwoStacksOneArray {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] items = new int[2 * DEFAULT_CAPACITY];
    private int posA = 0;
    private int posB = items.length - 1;

    public int size(int stackNum) {
        validation(stackNum);
        return stackNum == 1 ? posA : items.length - 1 - posB;
    }

    public void push(int stackNum, int value) {
        validation(stackNum);

        if (posA == posB) {
            throw new StackOverflowError();
        }

        if (stackNum == 1) {
            items[posA++] = value;
        } else {
            items[posB--] = value;
        }
    }

    public int pop(int stackNum) {
        validation(stackNum);

        int value;
        if (stackNum == 1) {
            if (posA == 0) {
                throw new StackOverflowError();
            }
            value = items[posA--];
        } else {
            if (posB == items.length - 1) {
                throw new StackOverflowError();
            }
            value = items[posB++];
        }
        return value;
    }

    public boolean isEmpty(int stackNum) {
        validation(stackNum);

        return stackNum == 1 ? posA == 0 : posB == items.length - 1;
    }

    private void validation(int stackNum) {
        if (stackNum != 1 && stackNum != 2) {
            throw new IllegalArgumentException();
        }
    }
}
