package Chapter3;

/**
 * Created by Carl Shen on 3/10/15.
 */
public class InfixConversion {
    /**
     * The general idea is first convert infix to postfix as postfix expression can be easily
     * done by stack: when encounter a operator, pop two items from the stack and push the
     * calculated result back to the stack.
     * For an infix expression like a + b * c, our target is: a b c * +.
     * @param expression
     * @return
     */
    public static int infixEvaluation(String expression) {
        // TODO
        return 0;
    }
}
