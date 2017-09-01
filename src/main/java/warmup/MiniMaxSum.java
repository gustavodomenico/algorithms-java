package warmup;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/mini-max-sum/problem

class MiniMaxSum {
    void solve() {
        Scanner scanner = new Scanner(in);

        int array[] = new int[5];
        for(int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        long max = MIN_VALUE;
        long min = MAX_VALUE;

        for(int i = 0; i < 5; i++) {
            int sum = 0;
            for(int j = 0; j < 5; j++) {
                // Sum all except the current "i" one
                if (i != j) {
                    sum += array[j];
                }
            }

            max = max(max, sum);
            min = min(min, sum);
        }

        out.format("%s %s\n", min, max);
    }
}
