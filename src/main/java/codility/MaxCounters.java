package codility;

class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];

        // Track the current max as we increase the counters
        int currentMax = 0;

        // This is the minimum value that the counter must have
        int minMax = 0;

        for (int i = 0; i < A.length; i++) {
            int value = A[i];

            // if it is increase operation
            if (value <= N) {
                // Update the counter using the counter value or the minimum max saved
                counters[value - 1] = Math.max(minMax, counters[value - 1]) + 1;

                // Update the current max value between all counters
                currentMax = Math.max(currentMax, counters[value - 1]);
            } else {
                // If it is a "max" operation, save as the mininum max for all counters
                minMax = currentMax;
            }
        }

        // This is needed to update the counters that don' have any increase operation
        for (int i = 0; i < N; i++) {
            counters[i] = Math.max(counters[i], minMax);
        }

        return counters;
    }
}
