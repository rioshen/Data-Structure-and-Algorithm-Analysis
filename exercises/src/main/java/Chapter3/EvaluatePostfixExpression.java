package Chapter3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by Carl Shen on 3/11/15.
 *
 * <title>Exercise 3.22</title>
 *
 * Write a program t evaluate a postfix expression
 */
public class EvaluatePostfixExpression {
    private static final Set<String> OPERATOR =
            new HashSet<String>(Arrays.asList("+", "-", "*", "/"));
    /**
     * Evaluate the result of postfix expression.
     * @param exp
     * @return
     */
    public int evaluatePostfixExpression(String[] exp) {
        if (exp == null || exp.length == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (String token : exp) {
            if (!OPERATOR.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop(), a = stack.pop();
                stack.push(eval(token, a, b));
            }
        }
        return stack.pop();
    }

    private int eval(String operator, int a, int b) {
        if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        } else if (operator.equals("*")) {
            return a * b;
        } else {
            return a / b;
        }
    }
}
