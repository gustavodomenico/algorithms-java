package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/encryption/problem

class Encryption implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        char[] sentence = scanner.nextLine().trim().toCharArray();
        int length = sentence.length;

        int rows = (int) floor(sqrt(length));
        int columns = (int) ceil(sqrt(length));

        if (rows * columns < length) rows++;

        char[][] matrix = new char[rows][columns];

        for (int i = 0, j = 0; i < length; i++) {
            if (i > 0 && i % columns == 0) {
                j++;
            }

            matrix[j][i % columns] = sentence[i];
        }

        StringBuilder result = new StringBuilder();
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > 0) {
                    result.append(matrix[i][j]);
                }
            }

            if (j < columns - 1) {
                result.append(" ");
            }
        }

        out.println(result.toString());
    }
}
