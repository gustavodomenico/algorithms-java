package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/sherlock-and-squares/problem

class SherlockandSquares implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int cases = parseInt(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            out.println(squaresBetween(lower, upper));
            scanner.nextLine();
        }
    }

    private int squaresBetween(int lower, int upper) {
        int squares = 0;

        int lowerBound = (int)floor(sqrt(lower));
        int upperBound = (int)ceil(sqrt(upper));

        for (int i = lowerBound; i <= upperBound; i++) {
            int square = i * i;
            if (square >= lower && square <= upper) {
                squares++;
            }
        }

        return squares;
    }
}
