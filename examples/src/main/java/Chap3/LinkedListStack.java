package Chap3;

import java.util.NoSuchElementException;

/**
 * Created by Robbert on 3/10/15.
 */
public class LinkedListStack<T> implements StackADT<T> {


    private int size = 0;
    private ListNode top = null;

    @Override
    public void push(T element) {
        top = new ListNode(element, top);
        size++;
    }

    @Override
    public T pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }

        T data = (T)top.value;
        top = top.next;
        size--;
        return data;
    }

    @Override
    public T peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return (T)top.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * A single linked list node class
     */
    private static class ListNode<T> {
        T value;
        ListNode next;

        public ListNode(T value) {
            this.value = value;
        }

        public ListNode(T value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
