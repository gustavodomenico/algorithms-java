package codility;

import java.util.Stack;

public class Nesting {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        // For each char
        for (Character c : S.toCharArray()) {
            // If it is an open bracket, push to the stack
            if (c == '(') stack.push(c);
            else {
                // Otherwise, pop it, if the stack is empty, it is not balanced
                if (stack.isEmpty()) {
                    return 0;
                }
                stack.pop();
            }
        }

        // It is balanced if there is no open brackets left
        if (stack.isEmpty()) {
            return 1;
        }

        return 0;
    }
}
