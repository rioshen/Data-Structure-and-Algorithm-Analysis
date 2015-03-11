package Chap3;

import java.util.NoSuchElementException;

/**
 * Created by Carl Shen on 3/10/15.
 */
public class DoubleListQueue<T> implements QueueADT<T> {

    /**
     * A singly-linked list class
     */
    private class Node {
        T value;
        Node next;

        public Node(T value, Node n) {
            this.value = value;
            this.next = n;
        }

        public Node(T value) {
            new Node(value, null);
        }
    }

    private int size = 0;
    private Node head = null;
    private Node tail = null;

    @Override
    public void enqueue(T element) {
        Node node = new Node(element, null);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;

        size++;
    }

    @Override
    public T dequeue() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T data = head.value;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
