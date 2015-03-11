import Chapter3.SymbolChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Carl Shen on 3/11/15.
 */
public class TestSymbolChecker {
    private SymbolChecker sol = new SymbolChecker();

    @Test
    public void testValidPascal() {
        String[] exp = new String[4];
        exp[0] = "begin";
        exp[1] = "(";
        exp[2] = ")";
        exp[3] = "end";
        assertTrue(sol.isValidExpression(exp));
    }

    @Test
    public void testInvalidPasal() {
        String[] exp = new String[4];
        exp[0] = "begin";
        exp[1] = "(";
        exp[2] = ")";
        exp[3] = "begin";
        assertFalse(sol.isValidExpression(exp));
    }

    @Test
    public void testValidJava() {
        String[] exp = new String[4];
        exp[0] = "/*";
        exp[1] = "(";
        exp[2] = ")";
        exp[3] = "*/";
        assertTrue(sol.isValidExpression(exp));
    }

    @Test
    public void testInvalidJava() {
        String[] exp = new String[4];
        exp[0] = "/*";
        exp[1] = "(";
        exp[2] = "]";
        exp[3] = "*/";
        assertFalse(sol.isValidExpression(exp));
    }
}
