package codility;

public class CountFactors {
    public int solutionTosca(int N) {
        int result = 1; // N is a divisor of N

        // For each number until N / 2
        for (int i = 1; i <= N / 2; i++) {
            // We test if the div remainder is 0
            if (N % i == 0) {
                result++;
            }
        }

        return result;
    }

    public int solution(int N) {
        // Here the tricky part if that we can get all divisors from sqrt(N)

        int result = 0;
        int  i = 1;

        double sn = Math.sqrt(N);

        // While we our number is less than the sqrt(n)
        while(i < sn) {
            // If it is a divisor, we count 2
            if (N % i == 0) {
                result += 2;
            }
            i += 1;
        }

        // If it is a perfect square root we need to count it
        if (i * i == N) {
            result++;
        }

        return result;
    }
}
