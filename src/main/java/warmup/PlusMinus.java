package warmup;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/plus-minus/problem

class PlusMinus {
    void solve() {
        Scanner scanner = new Scanner(in);

        int arraySize = parseInt(scanner.nextLine());

        int positive = 0, negative = 0, zeros = 0;

        for (int i = 0; i < arraySize; i++) {
            int current = scanner.nextInt();

            if (current > 0) positive++;
            else if (current < 0) negative++;
            else zeros++;
        }

        out.format("%06f\n", positive / (double) arraySize);
        out.format("%06f\n", negative / (double) arraySize);
        out.format("%06f\n", zeros / (double) arraySize);
    }
}
