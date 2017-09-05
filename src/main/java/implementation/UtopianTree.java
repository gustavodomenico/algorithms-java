package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/utopian-tree/problem

class UtopianTree implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int cases = parseInt(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            int cycles = parseInt(scanner.nextLine());

            int height = 1;
            for (int j = 1; j <= cycles; j++) {
                if (j % 2 == 0) {
                    height += 1;
                } else {
                    height *= 2;
                }
            }

            out.println(height);
        }
    }
}
