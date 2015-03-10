package Chap2;

/**
 * Created by Carl on 3/10/15.
 *
 * A small stack interface, basically supports <code>push</code>, <code>pop</code>,
 * <code>peek</code>, <code>size</code> and <code>isEmpty</code> operations.
 */
public interface StackADT<T> {
    /**
     * Appends the given element onto the stack
     */
    public void push(T element);

    /**
     * Removes the last element from the stack
     * @exception: java.util.NoSuchElementException
     */
    public T pop();

    /**
     * Returns the top item from the stack without popping it.
     * @exception: java.util.NoSuchElementException
     */
    public T peek();

    /**
     * Returns the size of the stack
     */
    public int size();

    /**
     * Returns whether the stack is Empty or not
     */
    public boolean isEmpty();
}
