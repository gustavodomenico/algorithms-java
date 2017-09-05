package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.util.Arrays.sort;

// https://www.hackerrank.com/challenges/between-two-sets/problem

class BetweenTwoSets implements Exercise {

    private static int getTotalX(int[] a, int[] b) {
        sort(a);
        sort(b);

        int lower = a[a.length - 1];
        int upper = b[b.length - 1];

        int matches = 0;

        for (int i = lower; i <= upper ; i++) {
            boolean isBetween = true;

            // Check x mod a[j]
            for (int anA : a) {
                if (i % anA != 0) {
                    isBetween = false;
                    break;
                }
            }

            // Check b[j] mod x
            if (isBetween) {
                for (int aB : b) {
                    if (aB % i != 0) {
                        isBetween = false;
                        break;
                    }
                }
            }

            if (isBetween) matches++;
        }

        return matches;
    }

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);

        System.out.println(total);
        in.close();
    }

}
