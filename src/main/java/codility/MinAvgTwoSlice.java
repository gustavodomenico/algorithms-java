package codility;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        return solutionAggressive(A);
    }

    private int solutionAggressive(int[] A) {
        // Get the prefix sum
        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = A[i] + prefixSum[i - 1];
        }

        // For each sum, compute the min average
        int minAverage = Integer.MAX_VALUE;

        for (int i = 0; i < prefixSum.length - 1; i++) {
            for (int j = i + 1; j < prefixSum.length; j++) {
                int from = prefixSum[i];
                int to = prefixSum[j];

                int average = (to - from) / (j - i);
                minAverage = Math.min(average, minAverage);
            }
        }

        return minAverage;
    }
}
