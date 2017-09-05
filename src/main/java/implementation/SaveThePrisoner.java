package implementation;

import common.Exercise;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/save-the-prisoner/problem

class SaveThePrisoner implements Exercise {

    private static int saveThePrisoner(int n, int m, int s) {
        int result = ((m % n) + s - 1) % n;
        if (result == 0) {
            return n;
        }
        return result;
    }

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();

            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
