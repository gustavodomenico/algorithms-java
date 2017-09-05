package implementation;

import common.Exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/picking-numbers/problem

class PickingNumbers implements Exercise {

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        // Solution

        int largestSet = getLargestSet(a, n);
        out.println(largestSet);
    }

    private static int getLargestSet(int input[], int n) {
        Arrays.sort(input);

        int matches = 0;
        int largest = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (input[j] - input[i] <= 1) {
                    matches++;
                }
            }
            if (matches > largest)
                largest = matches;
            matches = 0;
        }

        return largest;
    }
}
