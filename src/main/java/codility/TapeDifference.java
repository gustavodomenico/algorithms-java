package codility;

public class TapeDifference {
    public int solution(int[] A) {
        // Sum left part start with first element
        int sumLeftPart = A[0];

        // Sum right part, rest of the array
        int sumRightPArt = 0;
        for (int i = 1; i < A.length; i++) sumRightPArt += A[i];

        // Min difference using what we calculated above
        int minDifference = Math.abs(sumLeftPart - sumRightPArt);

        // Start from the next position in the array
        for (int i = 1; i < A.length - 1; i++) {
            // Add it to the left part and remove from the right part
            sumLeftPart += A[i];
            sumRightPArt -= A[i];

            // Check if the new difference is lower
            minDifference = Math.min(minDifference,  Math.abs(sumLeftPart - sumRightPArt));
        }

        return minDifference;
    }
}
