package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/circular-array-rotation/problem

class CircularArrayRotation implements Exercise {

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();

        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        // Solution

        // In case of K > N, ex: if N = 4, K = 2 == K = 6
        int modularK = k % n;

        // Rotate the start index modularK times
        int start = (n - modularK) % n;

        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt();

            // Start is the beginning of the rotated array
            // rotatedIndex is larger than N, start at the beginning
            int rotatedIndex = (start + m) % n;

            out.println(a[rotatedIndex]);
        }
    }
}
