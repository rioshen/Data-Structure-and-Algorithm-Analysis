package Chap3;


import java.util.NoSuchElementException;

/**
 * Created by Carl Shen on 3/10/15.
 */
public class ArrayStack<T> implements StackADT<T> {
    private T[] elements;
    private int index;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        elements = (T []) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void push(T element) {
        if (index == elements.length) {
            throw new IllegalArgumentException();
        }
        elements[index++] = element;
    }

    @Override
    public T pop() {
        if (index == 0) {
            throw new NoSuchElementException();
        }
        T item = elements[index--];
        return item;
    }

    @Override
    public T peek() {
        if (index == 0) {
            throw new IllegalArgumentException();
        }
        return elements[index];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }
}
