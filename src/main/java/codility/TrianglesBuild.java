package codility;

import java.util.Arrays;

class TrianglesBuild {
    public int solution(int[] A) {
        // We can fail fast if there is less than 3 elements
        if (A.length < 3) return 0;

        // Sorting we guarantee
        // A[Q] + A[R] > A[P]
        // A[R] + A[P] > A[Q
        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            // Long to avoid overflow
            long p = A[i];
            long q = A[i + 1];
            long r = A[i + 2];

            // So just A[P] + A[Q] > A[R] is left
            if (p + q > r) {
                return 1;
            }
        }

        return 0;
    }
}
