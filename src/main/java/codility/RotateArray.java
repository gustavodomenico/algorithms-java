package codility;

class RotateArray {
    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            // Just calculate the new index based on K moves and reseting to 0 if
            // greater than the array length
            int newIndex = (i + K) % A.length;
            result[newIndex] = A[i];
        }

        return result;
    }
}
