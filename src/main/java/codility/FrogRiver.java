package codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiver {
    public int solution(int X, int[] A) {
        // Save all positions that the frog has passed
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);

            // As soon as we hae all positions in the set we can return the current index
            if (set.size() == X) {
                return i;
            }
        }

        // Frog cannot jump the river
        return -1;
    }
}
