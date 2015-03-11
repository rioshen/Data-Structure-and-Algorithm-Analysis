package Chapter3;

import utils.ListNode;

/**
 * Created by Carl Shen on 3/11/15.
 *
 * <title>Exercise 3.11</title>
 *
 * Assume that a singly linked list is implemented with a header node, but no tail node, and that it maintains only a
 * reference to the header node.
 * Write a class that includes:
 * a. return the size of the linked list
 * b. print the linked list
 * c. test if a value x is contained in the linked list
 * d. add a value x if it is not already contained in the linked list
 * e. remove a value x if it is contained in the linked list
 *
 * <title>Solution</title>
 * For a singly linked list, add and removeLast should always be O(1), this can be done is we use head pointer as the tail
 * pointer.
 */
public class SinglyLinkedList {
    private ListNode head;
    private int size;

    public SinglyLinkedList() { this.head = new ListNode(0); }

    public void add(int value) {
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.val == value) return;
            curr = curr.next;
        }
        curr.next = new ListNode(value);
        size++;
    }

    public int size() { return size; }

    public void printList() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public boolean contains(int value) {
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == value) return true;
            curr = curr.next;
        }
        return false;
    }

    public void remove(int value) {
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == value) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        size--;
    }
}
