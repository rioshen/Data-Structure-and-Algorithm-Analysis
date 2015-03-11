import Chapter3.LinkedListContains;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Carl Shen on 3/11/15.
 */
public class TestLinkedListContains {
    private LinkedListContains list;

    @Before
    public void init() { list = new LinkedListContains(); }

    @Test
    public void testEmptyList() {
        assertEquals(list.size(), 0);
    }

    @Test
    public void testDoesnotContains() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertTrue(list.contains(8));
    }

    @Test
    public void testContains() {
        list.add(10);
        assertFalse(list.contains(1));
    }
}
