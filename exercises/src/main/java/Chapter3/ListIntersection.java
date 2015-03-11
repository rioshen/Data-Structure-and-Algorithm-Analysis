package Chapter3;

import utils.ListNode;

/**
 * Created by Carl Shen on 3/10/15.
 *
 * Exercise 3.4
 * Given two sorted linked list, L1 and L2, write a procedure to compute L1 intersect L2 using only basic
 * list operations
 */
public class ListIntersection {
    /**
     * Simply using nested loop can achieve the goal easily, to do it better we can also use two pointers
     * This is because if one of the list if smaller than the other, nested loop is unessary.
     *
     * Time complexity should be O(N) where N is the smaller one.
     * Space compleixty, as we need to store the result, so additional space is required.
     */
    public static ListNode intersection(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode result = new ListNode(0);
        ListNode curr = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        return result.next;
    }
}
