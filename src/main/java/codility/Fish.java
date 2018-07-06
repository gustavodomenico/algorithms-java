package codility;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> livingFishes = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int size = A[i];
            int direction = B[i];

            if (livingFishes.empty()) {
                livingFishes.push(i);
            } else {
                while (!livingFishes.empty() && direction - B[livingFishes.peek()] == -1 && size > A[livingFishes.peek()]) {
                    livingFishes.pop();
                }

                if (livingFishes.isEmpty()) {
                    livingFishes.push(i);
                } else {
                    if (direction - B[livingFishes.peek()] != -1) {
                        livingFishes.push(i);
                    }
                }
            }
        }

        return livingFishes.size();
    }
}
