package codility;

class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int intersections = 0;

        // For each disk pair
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int iDisk = A[i];
                int jDisk = A[j];

                // if i + A[i] >= j - A[j], we found an intersection
                if (i + iDisk >= j - jDisk) {
                    intersections++;
                }
            }
        }

        return intersections;
    }

    private int vanillaSolution(int[] A) {
        int[] westEnding = new int[A.length];
        int[] eastEnding = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (i - A[i] >= 0) eastEnding[i - A[i]]++;
            else eastEnding[0]++;
            if ((long) i + A[i] < A.length) westEnding[i + A[i]]++;
            else westEnding[A.length - 1]++;
        }

        long result = 0; //long to contain the case of 50k*50k. codility doesn't test for this.
        int wests = 0;
        int easts = 0;
        for (int i = 0; i < A.length; i++) {

            int balance = easts * wests; //these are calculated elsewhere

            wests++;
            easts += eastEnding[i];

            result += (long) easts * wests - balance - 1; // 1 stands for the self-intersection
            if (result > 10000000) return -1;

            easts--;
            wests -= westEnding[i];
        }

        return (int) result;
    }
}
