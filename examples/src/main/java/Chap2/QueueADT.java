package Chap2;

/**
 * Created by Carl SHen on 3/10/15.
 *
 * A simple Queue interface, supports <code>dequeue</code> and <code>enqueue</code> operations
 * and other common methods such as <code>size</code> and <code>isEmpty</code>
 */
public interface QueueADT<T> {
    /**
     * Pushes the element into the queue
     */
    public void enqueue(T element);

    /**
     * Remove the element from the queue
     */
    public T dequeue();

    /**
     * Returns the number of elements in the queue
     */
    public int size();

    /**
     * Returns whether the queue is empty or not
     */
    public boolean isEmpty();
}

