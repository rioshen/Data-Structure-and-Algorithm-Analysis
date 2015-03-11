package Chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Carl Shen on 3/11/15.
 *
 * <title>Exercise 3.21</title>
 *
 * Write a program to check the balancing symbols in the following languages:
 * a. Pascal (begin/end, (), [], {})
 * b. Java (//, (), [], {})
 */
public class SymbolChecker {
    private Map<String, String> table = new HashMap<String, String>();

    public SymbolChecker() {
        table.put("(", ")");
        table.put("[", "]");
        table.put("{", "}");
        table.put("begin", "end");
        table.put("/*", "*/");
    }

    public boolean isValidExpression(String[] exp) {
        if (exp == null || exp.length == 0) return true;

        Stack<String> stack = new Stack<String>();
        for (String token : exp) {
            if (table.containsKey(token)) {
                stack.push(token);
            } else {
                if (stack.isEmpty() || !table.get(stack.pop()).equals(token)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
