import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        /// if the string length is odd its impossible to have all open closed parentheses
        if (s.length() % 2 != 0) return false;

        /// use a stack to store the char array of parentheses occurrences
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (!stack.isEmpty()) {
                // get the current character on the stack
                char prev = stack.peek();

                /// check if the parentheses have a start on the stack top, if so, we remove it
                if ((prev == '(' && c == ')') || prev == '{' && c == '}' || prev == '[' && c == ']') {
                    stack.pop();
                } else {
                    /// insert the new element
                    stack.push(c);
                }

            } else {
                /// stack is empty so we push the new char into
                stack.push(c);
            }

        }

        /// of stack os empty, means that all parentheses was open and closed
        return stack.isEmpty();
    }

}


