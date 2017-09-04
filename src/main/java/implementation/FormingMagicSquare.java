package implementation;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Math.abs;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/magic-square-forming/problem

class FormingMagicSquare {

    private static final int MATRIX_SIZE = 3;

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for (int s_i = 0; s_i < 3; s_i++) {
            for (int s_j = 0; s_j < 3; s_j++) {
                s[s_i][s_j] = in.nextInt();
            }
        }

        // Solution

        /*
          Pre-defined matrixes

         https://en.wikipedia.org/wiki/Magic_square#Equivalent_magic_squares

         "The Lo Shu Square, as the magic square on the turtle shell is called,
         is the unique normal magic square of order three in which 1 is at the bottom and 2 is in the
         upper right corner. Every normal magic square of order three is obtained from the Lo Shu by
         rotation or reflection."

        */

        int[][][] matrices = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };

        // Get minimal transformation cost, from s to any of the matrices above

        int cost = MAX_VALUE;
        for (int[][] matrix : matrices) {
            cost = Math.min(cost, calculateTransformationCost(matrix, s));
        }

        out.println(cost);
    }

    private int calculateTransformationCost(int[][] magicMatrices, int[][] s) {
        int cost = 0;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < 3; j++) {
                cost += abs(magicMatrices[i][j] - s[i][j]);
            }
        }
        return cost;
    }
}
