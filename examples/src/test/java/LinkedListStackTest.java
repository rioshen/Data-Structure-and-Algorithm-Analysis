import Chap2.LinkedListStack;
import org.junit.Before;

/**
 * Created by Carl Shen on 3/10/15.
 */
public class LinkedListStackTest extends StackTest {
    @Before
    public void init() {
        stack = new LinkedListStack();
    }
}
