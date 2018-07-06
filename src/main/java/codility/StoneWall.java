package codility;

import java.util.Stack;

class StoneWall {
    public int solution(int[] H) {
        Stack<Integer> heights = new Stack<>();
        int blocks = 0;

        // For each height
        for (int aH : H) {
            // While the stack is not empty and the current height is smaller then the head
            while (!heights.empty() && aH < heights.peek()) {
                // We need a block for it
                heights.pop();
                blocks++;
            }

            // If the stack is empty or the current height is greater than the head
            if (heights.empty() || aH > heights.peek()) {
                // We push it to be processed
                heights.push(aH);
            }
        }

        // After we distribute the blocks, we could have remaining walls
        blocks += heights.size();
        
        return blocks;
    }
}
