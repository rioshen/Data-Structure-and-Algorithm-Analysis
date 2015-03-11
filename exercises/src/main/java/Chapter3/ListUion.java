package Chapter3;

import utils.ListNode;

/**
 * Created by Carl Shen on 3/10/15.
 *
 * Exercise 3.5
 * Given two sorted list L1 and L2, write a procedure to compute L1 union L2 using only the basic list operations.
 */
public class ListUion {
    /**
     * If duplicates are allowed, we can simply point l1 to l2 and return it, this can be done in linear time.
     * @param l1
     * @param l2
     * @return the union of L1 and L2
     */
    public static ListNode listUnion(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode tail = l1;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = l2;

        return l1;
    }
}
