import Chap2.QueueADT;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Carl Shen on 3/10/15.
 */
public abstract class QueueTest {
    protected QueueADT queue;

    @Test
    public void testNewQueueEmpty() {
        assertTrue(queue.isEmpty());
        assertEquals(queue.size(), 0);
    }

    @Test
    public void testEnqueue() {
        final int number = 10;
        for (int i = 0; i < number; i++) {
            queue.enqueue(i);
        }
        assertFalse(queue.isEmpty());
        assertEquals(queue.size(), number);
    }

    @Test
    public void testEnqueueThenDequeue() {
        String buzz = "Buzz";
        queue.enqueue(buzz);
        assertEquals(queue.dequeue(), buzz);
    }

    @Test
    public void testDequeue() {
        final int number = 10;
        for (int i = 0; i < number; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < number; i++) {
            queue.dequeue();
        }
        assertTrue(queue.isEmpty());
        assertEquals(queue.size(), 0);
    }
}
