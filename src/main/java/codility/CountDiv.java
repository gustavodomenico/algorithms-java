package codility;

public class CountDiv {
    public int solution(int A, int B, int K) {
        // Add 1 explicitly as A is divisible by M
        if (A % K == 0)
            return (B / K) - (A / K) + 1;

        // A is not divisible by M
        return (B / K) - (A / K);
    }
}
