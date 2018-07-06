package codility;

class MaxSliceSum {

    public int solution(int[] A) {
        // Assume the first element has the max sum
        int maxUntilNow = A[0];
        int maxSum = A[0];

        // For each element
        for (int i = 1; i < A.length; i++) {
            // Check the sum until now, the max A[i] is necessary because of negative values
            maxUntilNow = Math.max(A[i], maxUntilNow + A[i]);

            // Check if the sum until now is the max sum
            maxSum = Math.max(maxSum, maxUntilNow);
        }

        return maxSum;
    }
}
