import java.util.Stack;

public class CheckParentheses {

    public static void main(String[] args) {
        String input = "HELLO AND (WELCOME (TO THE) TCEA (CONTEST)TODAY)IS (SATURDAY())";
        
        int result = checkParentheses(input);
        
        System.out.println("Output: " + result);
    }

    public static int checkParentheses(String input) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                // Check if there's a preceding '(' on the stack
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Matched, pop the '('
                } else {
                    return 1; // Unmatched ')' found
                }
            }
        }
        
        // After iterating through the string, check if stack is empty
        if (stack.isEmpty()) {
            return 0; // All parentheses matched correctly
        } else {
            return 1; // Unmatched '(' found
        }
    }
}
