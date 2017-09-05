package warmup;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/diagonal-difference

class DiagonalSequence implements Exercise {
    public void solve() {
        Scanner scanner = new Scanner(in);

        int rows = parseInt(scanner.nextLine());

        int matrix[][] = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = scanner.nextInt();
            }

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < rows; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonal += matrix[i][rows - i - 1];
        }

        out.println(abs(primaryDiagonalSum - secondaryDiagonal));
    }
}
