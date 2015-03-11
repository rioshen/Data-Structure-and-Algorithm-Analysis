package Chapter3;
import utils.Node;
/**
 * Created by Carl Shen on 3/11/15.
 *
 * Exercise 3.3
 * Implement the <code>contains</code> routine for MyLinkedList
 *
 * For minimum implementation, only <code>add</code> and <code>contains</code>
 */
public class LinkedListContains {

    private Node head = new Node(0, null, null);
    private int size = 0;

    public LinkedListContains() {
        head.next = head.prev = head;
    }

    public void add(int element) {
        Node node = new Node(element, head.prev, head);
        node.prev.next = node;
        node.next.prev = node;
        size++;
    }

    public boolean contains(int element) {
        Node curr = head;
        for (int i = 0; i < size; i++) {
            if (curr.val == element) return true;
            curr = curr.next;
        }
        return false;
    }

    public int size() { return size; }
}
