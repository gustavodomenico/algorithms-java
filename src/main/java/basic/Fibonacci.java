package basic;

class Fibonacci {
    int fibonacciRecursive(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); // 2 ^ n complexity
    }

    int fibonacci(int n) {
        int prev1, prev2 = 1, sum = 1;

        for (int i = 2; i < n; i++) {
            prev1 = prev2;
            prev2 = sum;

            sum = prev1 + prev2;
        }

        return sum;
    }
}
