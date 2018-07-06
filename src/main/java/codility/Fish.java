package codility;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> livingFishes = new Stack<>();

        // For each fish
        for (int i = 0; i < A.length; i++) {
            int size = A[i];
            int direction = B[i];

            // If there is no living fishes yet, push it
            if (livingFishes.empty()) {
                livingFishes.push(i);
            } else {
                // While there are living fishes in the opposite direction and with smaller size
                // eat them
                while (!livingFishes.empty() && direction - B[livingFishes.peek()] == -1 && size > A[livingFishes.peek()]) {
                    livingFishes.pop();
                }

                // Again, if the living fihes is empty, push the fish that we are working on
                if (livingFishes.isEmpty()) {
                    livingFishes.push(i);
                } else {
                    // Else, we can push the fish just if his direction is not the opposite
                    // otherwise we can consider it eaten by the head living fish
                    if (direction - B[livingFishes.peek()] != -1) {
                        livingFishes.push(i);
                    }
                }
            }
        }

        return livingFishes.size();
    }
}
