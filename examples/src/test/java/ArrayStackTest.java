import Chap2.ArrayStack;
import org.junit.Before;

/**
 * Created by Robbert on 3/10/15.
 */
public class ArrayStackTest extends StackTest {
    @Before
    public void init() {
        stack = new ArrayStack();
    }
}
