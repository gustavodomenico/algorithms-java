package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Arrays.sort;

// https://www.hackerrank.com/challenges/cut-the-sticks/problem

class CuttheSticks implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int length = parseInt(scanner.nextLine());

        int[] sticks = new int[length];
        for (int i = 0; i < length; i++) {
            sticks[i] = scanner.nextInt();
        }

        sort(sticks);

        int remainingSticks = length;
        out.println(remainingSticks);

        for (int i = 0; i < length; i++) {
            int lowest = sticks[i];

            boolean hasNewCut = false;
            for (int j = 0; j < length; j++) {
                if (sticks[j] == 0) continue;

                sticks[j] = sticks[j] - lowest;
                if (sticks[j] == 0) {
                    remainingSticks--;
                    hasNewCut = true;
                }
            }

            if (hasNewCut && remainingSticks > 0) {
                out.println(remainingSticks);
            }
        }
    }
}
