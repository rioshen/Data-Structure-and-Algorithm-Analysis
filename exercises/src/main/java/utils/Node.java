package utils;

/**
 * Created by Carl Shen on 3/11/15.
 */
public class Node {
    public int val;
    public Node prev;
    public Node next;

    public Node(int value, Node prev, Node next) {
        this.val = value;
        this.prev = prev;
        this.next = next;
    }
}
