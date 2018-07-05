package codility;

class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int intersections = 0;

        // For each disk pair
        for (int i = 0; i < A.length -1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int iDisk = A[i];
                int jDisk = A[j];

                // if i + A[i] >= j - A[j], we found an intersection
                if(i + iDisk >= j - jDisk) {
                    intersections++;
                }
            }
        }

        return intersections;
    }
}
