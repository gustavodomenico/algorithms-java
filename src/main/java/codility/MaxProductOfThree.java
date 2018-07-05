package codility;

import java.util.Arrays;

class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);

        // Multiply the largest 3 numbers
        int largestProduct = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];

        // Multiply the smallest 2 numbers, because of negative and multiply with the largest one
        int smallestWithLargestProduct = A[A.length - 1] * A[0] * A[1];

        return Math.max(largestProduct, smallestWithLargestProduct);
    }
}
