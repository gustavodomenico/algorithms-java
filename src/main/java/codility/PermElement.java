package codility;

public class PermElement {
    public int solution(int[] A) {
        // Sum elements in the array
        long currentSum = 0;
        for (int e : A) currentSum += e;

        // Sum the ideal array n + 1 (one element is missing)
        // Sum of a series = (n * (n + 1)) / 2
        long size = A.length;
        long idealSum = ((size + 1) * (size + 2)) / 2;

        // The difference should be the missing element
        return (int)(idealSum - currentSum);
    }
}
