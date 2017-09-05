package implementation;

import common.Exercise;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

class DivisibleSumPairs implements Exercise {

    private static int divisibleSumPairs(int n, int k, int[] ar) {
        int matches = 0;

        for (int i = 0; i < n; i++) {
            int a = ar[i];

            for (int j = 0; j < n; j++) {
                int b = ar[j];

                if (i < j && (a + b) % k == 0) {
                    matches++;
                }
            }
        }

        return matches;
    }

    public void solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
