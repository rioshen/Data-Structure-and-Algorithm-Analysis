import Chap2.DoubleListQueue;
import org.junit.Before;

/**
 * Created by Carl Shen on 3/10/15.
 */
public class DoubleQueueTest extends QueueTest {
    @Before
    public void init() {
        queue = new DoubleListQueue();
    }
}
