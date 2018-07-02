package interview.kit.arrays;

// https://www.hackerrank.com/challenges/minimum-swaps-2/problem

class MinimumSwaps2 {
    int minimumSwaps(int[] A) {
        // The tricky part is to understand that if the elements are consecutive
        // the array is ordered if, for any given i, a[i] = i + 1, for 0-based arrays

        int steps = 0;

        for (int i = 0; i < A.length; i++) {

            // Find the first element that is not in the position, i
            if (A[i] != i + 1) {

                // Get the next element that is not in the position, j
                int j = i;
                while (A[j] !=  i + 1) {
                    j++;
                }

                // Switch them
                swap(A, i, j);

                steps++;
            }
        }

        return steps;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
