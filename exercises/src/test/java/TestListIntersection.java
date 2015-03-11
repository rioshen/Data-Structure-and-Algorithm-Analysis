import Chapter3.ListIntersection;
import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carl Shen on 3/10/15.
 */
public class TestListIntersection {
    private ListIntersection sol = new ListIntersection();

    @Test
    public void testEmptyLists() {
        assertEquals(sol.intersection(null, null), null);
    }

    @Test
    public void testNoIntersection() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        assertEquals(sol.intersection(l1, l2), null);
    }

    @Test
    public void testAllIntersection() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        assertEquals(sol.intersection(l1, l2).val, 1);
    }
}
