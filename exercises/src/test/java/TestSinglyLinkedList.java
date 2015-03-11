import Chapter3.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Carl Shen on 3/11/15.
 */
public class TestSinglyLinkedList {
    private SinglyLinkedList sol = new SinglyLinkedList();

    @Test
    public void testEmpty() {
        assertEquals(0, sol.size());
    }

    @Test
    public void testContains() {
        for (int i = 0; i < 10; i++) {
            sol.add(i);
        }
        assertTrue(sol.contains(9));
    }
}
