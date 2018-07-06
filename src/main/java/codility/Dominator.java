package codility;

import java.util.Arrays;

@SuppressWarnings("Duplicates")
class Dominator {
    public int solutionQuadratic(int[] A) {
        // Just iterate for each par in AxA and check if any
        // number occurs len(A) / 2 times...
        for(int a : A) {
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                int b = A[i];
                if (a == b) {
                    count++;
                    // It is not possible to have two numbers, so we can return
                    if (count > A.length / 2) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public int solutionLogarithmic(int[] A) {
        // The idea is that if there is a dominator, it will be in the middle of the
        // array
        Arrays.sort(A);

        int candidate = A[A.length / 2];
        int count = 0;

        // Just go through the array validating if it is really a dominator
        for (int i = 0; i < A.length; i++) {
            int e = A[i];
            if (candidate == e) {
                count++;
                if (count > A.length / 2) {
                    return i;
                }
            }
        }

        return -1;
    }

    public int solution(int[] A) {
        // The linear solution is based on the fact that if you remove any different pair of values
        // the leader is still the leader of the remaining array

        // We are going to use this to track if the values are different
        int value = 0;
        int size = 0;

        for (int aA : A) {
            // We found a new value
            if (size == 0) {
                size++;
                value = aA;
            } else {
                // Found a different value, remove then
                if (aA != value) {
                    size--;
                } else {
                    // Keep increasing if the values are different
                    // we need to ignore two different pairs
                    size++;
                }
            }
        }

        // There is no candidate
        if (size == 0) {
            return -1;
        }

        int candidate = value;
        int count = 0;

        // Just go through the array validating if it is really a dominator
        for (int i = 0; i < A.length; i++) {
            int e = A[i];
            if (candidate == e) {
                count++;
                if (count > A.length / 2) {
                    return i;
                }
            }

        }

        return -1;
    }
}
