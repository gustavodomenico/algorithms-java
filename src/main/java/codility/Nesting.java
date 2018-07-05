package codility;

import java.util.Stack;

public class Nesting {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (Character c : S.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) {
                    return 0;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return 1;
        }

        return 0;
    }
}
