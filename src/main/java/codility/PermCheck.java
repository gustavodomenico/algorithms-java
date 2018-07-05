package codility;

public class PermCheck {
    public int solution(int[] A) {
        boolean[] exists = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length || exists[A[i]]) {
                return 0;
            } else {
                exists[A[i]] = true;
            }
        }

        return 1;
    }
}
