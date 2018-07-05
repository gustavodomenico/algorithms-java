package codility;

public class PermCheck {
    public int solution(int[] A) {
        // Track which numbers exists
        boolean[] exists = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            // If the number is larger than the array size, or it has been already found
            // it is not a permutation
            if (A[i] > A.length || exists[A[i]]) {
                return 0;
            } else {
                // Else, tracks that we already found that number
                exists[A[i]] = true;
            }
        }

        // We can safely return true if conditions above match
        return 1;
    }
}
