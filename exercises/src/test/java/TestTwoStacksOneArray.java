import Chapter3.TwoStacksOneArray;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Carl Shen on 3/11/15.
 */
public class TestTwoStacksOneArray {
    private TwoStacksOneArray stack = new TwoStacksOneArray();

    @Test
    public void testEmpty() {
        assertTrue(stack.isEmpty(1));
        assertTrue(stack.isEmpty(2));

        assertEquals(0, stack.size(1));
        assertEquals(0, stack.size(2));
    }

    @Test
    public void testPushStack1() {
        stack.push(1, 1);

        assertFalse(stack.isEmpty(1));

        assertEquals(1, stack.size(1));

        assertEquals(1, stack.pop(1));
    }

    @Test
    public void testPushStack2() {
        stack.push(2, 1);

        assertFalse(stack.isEmpty(2));

        assertEquals(1, stack.size(2));

        assertEquals(1, stack.pop(2));
    }

    @Test(expected = StackOverflowError.class)
    public void testPushDownStack1() {
        for (int i = 0; i < 20; i++) {
            stack.push(1, i);
        }
        assertEquals(20, stack.size(1));
        stack.push(1, 1);
    }

    @Test(expected = StackOverflowError.class)
    public void testPushDownStack2() {
        for (int i = 0; i < 20; i++) {
            stack.push(2, i);
        }
        assertEquals(20, stack.size(2));
        stack.push(2, 1);
    }

    @Test(expected = StackOverflowError.class)
    public void testPushDownBothStack12() {
        for (int i = 0; i < 10; i++) {
            stack.push(1, i);
        }
        assertEquals(10, stack.size(1));

        for (int i = 0; i < 10; i++) {
            stack.push(2, i);
        }
        assertEquals(9, stack.size(2));

        for (int i = 0; i < 2; i++) {
            stack.push(1, i);
        }
    }
}
