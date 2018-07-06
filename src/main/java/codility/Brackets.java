package codility;

import java.util.Stack;

class Brackets {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (Character c : S.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }

                Character head = stack.pop();
                if (head == '(' && c != ')') {
                    return 0;
                }
                if (head == '[' && c != ']') {
                    return 0;
                }
                if (head == '{' && c != '}') {
                    return 0;
                }
            }
        }

        if (stack.isEmpty()) {
            return 1;
        }

        return 0;
    }

}
