package codility;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        return solutionFlawless(A);
    }

    private int solutionFlawless(int[] A) {
        // Assume that the minimum average is between pairs or triples
        // and test them

        // Minimal average
        double minAverage = (A[0] + A[1]) / 2.0;
        int minFrom =  0;

        // For each pair or triple test the average
        for (int i = 0; i < A.length - 2; i++) {
            double pairAverage = (A[i] + A[i + 1]) / 2.0;
            double tripleAverage = (A[i] + A[i + 1] + A[i + 2]) / 3.0;

            if (Math.min(pairAverage, tripleAverage) < minAverage) {
                minAverage = Math.min(pairAverage, tripleAverage);
                minFrom = i;
            }
        }

        // We need to test the latest pair, because of length - 2 in the loop above
        double lastPairAverage = (A[A.length - 1] + A[A.length - 2]) / 2.0;
        if (lastPairAverage < minAverage) {
            minFrom = A.length - 2;
        }

        return minFrom;
    }
}
