import Chapter3.JosephusProblem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carl Shen on 3/11/15.
 */
public class TestJosephusProblem {
    private JosephusProblem sol = new JosephusProblem();

    @Test
    public void test() {
        assertEquals(sol.Winner(5, 0), 5);
        assertEquals(sol.Winner(5, 1), 3);
        assertEquals(31, sol.Winner(41, 2));
    }
}
