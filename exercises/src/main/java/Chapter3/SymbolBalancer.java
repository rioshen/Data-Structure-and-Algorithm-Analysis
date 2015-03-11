package Chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Carl Shen on 3/10/15.
 */
public class SymbolBalancer {
    /**
     * The solution is simple, use an additional stack, if the current symbol is
     * an openning, push it onto the stack. Otherwise, if the stack is empty or
     * top element on the stack doesn't match, return false. Finally, the stack
     * should be empty.
     * The time complexity is O(N), where N means the length of input string.
     * @param symbols
     * @return
     */
    public static boolean isBalanced(String symbols) {
        if (symbols == null || symbols.length() == 0) {
            return true;
        }

        Map<Character, Character> table = new HashMap<Character, Character>();
        table.put('(', ')');
        table.put('[', ']');
        table.put('{', '}');

        Stack<Character> stack = new Stack<Character>();
        for (char symbol : symbols.toCharArray()) {
            if (table.containsKey(symbol)) { // open symbol
                stack.push(symbol);
            } else { // close symbol
                if (stack.isEmpty() || table.get(stack.pop()) != symbol) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
